package br.edu.ufal.controller;

import java.util.Iterator;
import java.util.List;

import br.edu.ufal.dao.CRUDImpl;
import br.edu.ufal.model.Chat;
import br.edu.ufal.model.Community;
import br.edu.ufal.model.Msg;
import br.edu.ufal.model.MsgCommunity;
import br.edu.ufal.model.User;
import br.edu.ufal.validation.ValidationData;
import br.edu.ufal.validation.ValidationDate;
import br.edu.ufal.validation.ValidationEmail;
import br.edu.ufal.view.Capture;
import br.edu.ufal.view.PrintError;
import br.edu.ufal.view.Screen;

public class Controller {

	static CRUDImpl crudImpl = new CRUDImpl();

	public static int addUser() {

		String name = Capture.nameUser();
		if (!ValidationData.validateNome(name)) {
			PrintError.invalidNameError();
			return -1;
		}
		String lastName = Capture.lastNameUser();

		String email = Capture.emailUser();
		if (!ValidationEmail.validate(email)) {
			return -1;
		}

		String password = Capture.passwordUser();
		if (!ValidationData.validatePassword(password)) {
			PrintError.invalidPaswordError();
			return -1;
		}

		String gender = Capture.genderUser();
		if (!ValidationData.validateGender(gender)) {
			PrintError.invalidGender();
			return -1;
		}

		String dateBirth = Capture.dateBirthUser();
		if (!ValidationDate.validateDateOfBirth(dateBirth)) {
			PrintError.invalidDateError();
			return -1;
		}

		User user = new User();
		user.setName(name);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setDateBirth(dateBirth);
		user.setGender(gender);

		if (!crudImpl.checkForEqualEmail(email)) {
			crudImpl.addInstance(user);
			Screen.registrationSucessfully();
			return 1;
		} else {
			PrintError.msgEmailIsAlreadyRegistered();
			return -1;
		}
	}

	public static User authenticationLogin() {
		String email = Capture.emailUser();

		String password = Capture.passwordUser();

		return crudImpl.autheticationUser(email, password);

	}

	public static void printProfile(User user) {
		Screen.profile(user);
	}

	public static void Edition(User user, String field) {

		if (field == "name") {
			user.setName(Capture.nameUser());
		} else if (field == "lastName") {
			user.setLastName(Capture.lastNameUser());
		} else if (field == "gender") {
			user.setGender(Capture.genderUser());
		} else if (field == "dateBirth") {
			user.setDateBirth(Capture.dateBirthUser());
		} else if (field == "contact") {
			user.profile.setContact(Capture.contactUser());
		} else if (field == "status") {
			user.profile.setStatus(Capture.statusUser());
		}

		crudImpl.updateInstance(user);
	}

	public static void EditionInformationProfessional(User user) {

		user.profile.professionalInformation.setCompanyName(Capture.companyName());
		user.profile.professionalInformation.setFunction(Capture.function());
		user.profile.professionalInformation.setInitialDate(Capture.dateInitial());
		user.profile.professionalInformation.setFinalDate(Capture.dateFinal());

		crudImpl.updateInstance(user);
	}

	public static void EditionInformationEducational(User user) {

		user.profile.educationalInformation.setCourse(Capture.courseName());
		user.profile.educationalInformation.setYearConclusion(Capture.yearConclusion());
		user.profile.educationalInformation.setInstitutionalName(Capture.institutionalName());

		crudImpl.updateInstance(user);
	}

	public static void sendRequest(User user) {

		// A SER CONVIDADO
		int idUserGuest = Capture.getIdSolicitation();
		User userGuest = crudImpl.getInstanceId(idUserGuest);

		List<User> list = userGuest.getFriendRequest();

		// VERIFICANDO SE JA FOI ENVIADO SOLICITACAO
		Iterator<User> itr = list.iterator();
		while (itr.hasNext()) {
			User element = (User) itr.next();
			if (element.getId() == user.getId()) {
				Screen.pendingFriendRequest();
				return;
			}
		}

		// VERIFICANDO SE JA RECEBEU SOLICITACACAO
		list = user.getFriendRequest();
		itr = list.iterator();
		while (itr.hasNext()) {
			User element = (User) itr.next();
			if (element.getId() == idUserGuest) {
				Screen.pendingFriendRequest();
				return;
			}
		}
		// VERIFICA SE JA SAO AMIGOS
		list = user.getFriend();
		itr = list.iterator();
		while (itr.hasNext()) {
			User element = (User) itr.next();
			if (element.getId() == idUserGuest) {
				Screen.areFriends();
				return;
			}
		}

		userGuest.setFriendRequest(user);
		crudImpl.updateInstance(userGuest);
		Screen.requestSend();
	}

	public static void listFriends(User user) {

		List<User> list = user.getFriend();

		Iterator<User> itr = list.iterator();
		while (itr.hasNext()) {
			User element = (User) itr.next();
			System.out.println(element.getId() + " " + element.getName() + " " + element.getLastName());
		}
	}

	public static int sendMsg(User user) {
		boolean bool = true;
		listFriends(user);

		int idFriend = Capture.getIdSolicitation();
		if (idFriend == 0) return -1;
		
		String msgContent = Capture.writeMessage();

		List<Chat> chats = user.getChat();

		User userFriend = crudImpl.getInstanceId(idFriend);
		List<Chat> chats2 = userFriend.getChat();

		Iterator<Chat> itr = chats.iterator();
		while (itr.hasNext()) {
			Chat element = (Chat) itr.next();
			if (element.getIdFriend() == idFriend) {
				Iterator<Chat> it = chats2.iterator();
				while (it.hasNext()) {
					Chat elem = (Chat) it.next();
					if (element.getIdFriend() == user.getId()) {
						Msg msg = new Msg(user.getId(), user.getName(), msgContent);
						element.getMsgs().add(msg);
						elem.getMsgs().add(msg);
						crudImpl.addInstance(msg);
						
						bool = false;
					}
				}
			}
		}

		if (bool) {
			Msg msg = new Msg(user.getId(), user.getName(), msgContent);
			crudImpl.addInstance(msg);

			Chat chat = new Chat();
			crudImpl.addInstance(chat);
			
			chat.setIdUser(user.getId());
			chat.setIdFriend(idFriend);
			chat.setMsgs(msg);

			user.getChat().add(chat);
			userFriend.getChat().add(chat);

		}

		crudImpl.updateInstance(user);

		return 0;
	}

	public static boolean msgBox(User user) {

		List<Chat> chat = user.getChat();
		boolean bool = false;

		Iterator<Chat> itr = chat.iterator();

		while (itr.hasNext()) {

			Chat element = (Chat) itr.next();

			System.out.println(element.getId() + " " + crudImpl.getInstanceId(element.getIdFriend()).getName());
			bool = true;
		}

		return bool;
	}

	public static boolean searchUser() {
		List<User> users = crudImpl.getAllInstances();

		boolean bool = false;
		String name = Capture.nameUser();

		Iterator<User> itr = users.iterator();

		while (itr.hasNext()) {
			User element = (User) itr.next();

			if (element.getName().equalsIgnoreCase(name)) {
				System.out.println(element.getId() + " " + element.getName() + " " + element.getLastName());
				bool = true;
			}
		}
		return bool;
	}

	public static boolean listRequest(User user) {
		boolean bool = false;
		List<User> resquests = user.getFriendRequest();
		Iterator<User> itr = resquests.iterator();
		while (itr.hasNext()) {
			User element = (User) itr.next();
			System.out.println(element.getId() + " " + element.getName() + " " + element.getLastName());
			bool = true;
		}
		return bool;
	}

	public static void aceptRequest(User user) {

		int idfriend = Capture.getIdSolicitation();
		boolean bool = true;

		User userFriend = crudImpl.getInstanceId(idfriend);

		if (userFriend.equals(null)) {
			Screen.UserNotFound();
			return;
		}

		if (bool) {
			user.setFriend(userFriend);
			userFriend.setFriend(user);

			crudImpl.updateInstance(user);
			crudImpl.updateInstance(userFriend);

			removeRequest(user, userFriend);
			Screen.youAreNowFriends();
		}
	}

	public static void removeRequest(User user, User userFriend) {

		List<User> requests = user.getFriendRequest();

		for (int i = 0; i < requests.size(); i++) {
			User request = requests.get(i);
			if (request.getId() == userFriend.getId()) {
				requests.remove(i);
				crudImpl.updateInstance(user);
			}
		}
	}

	public static void removeRequest(User user) {

		int idfriend = Capture.getIdSolicitation();

		User userFriend = crudImpl.getInstanceId(idfriend);

		List<User> requests = user.getFriendRequest();

		for (int i = 0; i < requests.size(); i++) {
			User request = requests.get(i);
			if (request.getId() == userFriend.getId()) {
				requests.remove(i);
				crudImpl.updateInstance(user);
			}
		}

		Screen.requestRemoved();
	}

	public static void createCommunity(User user) {

		Screen.newCommunity();
		String name = Capture.getCommunityName();
		String describe = Capture.getDescribe();

		Community community = new Community();
		community.setDados(name + "\n" + describe + "\n");
		community.setUsers(user);

		crudImpl.addInstance(community);

		user.setCommunity(community);
		crudImpl.updateInstance(user);
	}

	public static void listCommunities() {

		List<Community> communities = crudImpl.getCommunity();
		Iterator<Community> itr = communities.iterator();
		while (itr.hasNext()) {
			Community element = (Community) itr.next();
			Screen.printDataCommunities(element);
		}
	}

	public static void listCommunities(User user) {

		List<Community> communities = user.getCommunity();

		Iterator<Community> itr = communities.iterator();
		while (itr.hasNext()) {
			Community element = (Community) itr.next();
			Screen.printDataCommunities(element);
		}
	}

	public static void communitySelect(User user) {

		int idCommunity = Capture.idCommunity();
		List<Community> communities = crudImpl.getCommunity();

		Iterator<Community> itr = communities.iterator();
		while (itr.hasNext()) {
			Community element = (Community) itr.next();
			if (element.getId() == idCommunity) {

				Screen.menuMsgCommunity();

				switch (Capture.getOptionInt()) {
				case 1: // VER MSGS

					Controller.printChatCommunity(element.getMsgsCommunity());

					break;
				case 2: // ENVIAR MSG

					MsgCommunity msg = new MsgCommunity();

					msg.setContent("   " + user.getId() + " " + user.getName() + ": " + Capture.writeMessage());

					element.setMsgsCommunity(msg);
					crudImpl.updateInstance(element);

					break;
				default:
					// VOLTAR
				}

			}
		}

	}

	private static void printChatCommunity(List<MsgCommunity> msgs) {

		Iterator<MsgCommunity> itr = msgs.iterator();
		while (itr.hasNext()) {
			MsgCommunity element = (MsgCommunity) itr.next();
			// Ja esta com o nome do user incluso
			Screen.msgChatCommunity(element);
		}

	}

	public static void showMsgs(User user) {

		try {
			Chat chat = crudImpl.getChat(Capture.getIdChat());

			List<Msg> msgs = chat.getMsgs();

			Iterator<Msg> itr = msgs.iterator();

			while (itr.hasNext()) {

				Msg element = (Msg) itr.next();

				Screen.printMsg(element);
			}
		} catch (IndexOutOfBoundsException e) {
			return;
		}
	}

	public static void alterPassword(User user) {
		user.setPassword(Capture.newPassword());
		crudImpl.updateInstance(user);
	}

	public static void alterEmail(User user) {
		user.setEmail(Capture.newEmail());
		crudImpl.updateInstance(user);
	}

	public static void deleteAccount(User user) {
		crudImpl.deleteInstance(user);
	}
}
