package br.edu.ufal.controller;

import java.util.Iterator;
import java.util.List;

import br.edu.ufal.dao.CRUDImpl;
import br.edu.ufal.model.Chat;
import br.edu.ufal.model.Community;
import br.edu.ufal.model.Msg;
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
			PrintError.invalidEmailError();
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

		user.profile.professionalInformation.setCompanyName(Capture.courseName());
		user.profile.professionalInformation.setFunction(Capture.yearConclusion());
		user.profile.professionalInformation.setInitialDate(Capture.institutionalName());

		crudImpl.updateInstance(user);
	}

	public static void sendRequest(User user) {

		// A SER CONVIDADO
		int idUserGuest = Capture.getIdSolicitation();
		User userGuest = crudImpl.getInstanceId(idUserGuest);

		userGuest.setFriendRequest(user);

		crudImpl.updateInstance(userGuest);

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

			Chat chat = new Chat();
			chat.setIdUser(user.getId());
			chat.setIdFriend(idFriend);
			chat.setMsgs(msg);

			crudImpl.addInstance(chat, msg);
			user.getChat().add(chat);
			userFriend.getChat().add(chat);

		}

		crudImpl.updateInstance(user);

		return 0;
	}

	public static boolean msgBox() {

		// LISTA AS MENSAGENS DA CAIXA DE TEXTO
		return false;
	}

	public static void searchUser() {
		List<User> users = crudImpl.getAllInstances();

		String name = Capture.nameUser();

		Iterator<User> itr = users.iterator();
		while (itr.hasNext()) {
			User element = (User) itr.next();
			if (element.getName().equalsIgnoreCase(name)) {
				System.out.println(element.getId() + " " + element.getName() + " " + element.getLastName());
			}
		}
	}

	public static void listRequest(User user) {

		List<User> resquests = user.getFriendRequest();
		Iterator<User> itr = resquests.iterator();
		while (itr.hasNext()) {
			User element = (User) itr.next();
			System.out.println(element.getId() + " " + element.getName() + " " + element.getLastName());
		}
	}

	public static void aceptRequest(User user) {
		int idfriend = Capture.getIdSolicitation();

		User userFriend = crudImpl.getInstanceId(idfriend);

		user.setFriend(userFriend);
		userFriend.setFriend(user);

		crudImpl.updateInstance(user);
		crudImpl.updateInstance(userFriend);

		removeRequest(user, userFriend);
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
	}

	public static void createCommunity(User user) {

		Screen.newCommunity();
		String name = Capture.getCommunityName();
		String describe = Capture.getDescribe();

//		Community community = new Community();
//		community.setName(name);
//		community.setDescribe(describe);
		// crudImpl.addInstance(community);

	//	user.setCommunity(community);
		// crudImpl.updateInstance(user);
	}
}
