package br.edu.ufal.controller;

import br.edu.ufal.dao.CRUDImpl;
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

		String sex = Capture.sexUser();
		if (!ValidationData.validateSex(sex)) {
			PrintError.invalidSex();
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
		user.setSex(sex);

		if (!crudImpl.checkForEqualEmail(email)) {
			crudImpl.addInstance(user);
			Screen.registrationSucessfully();
			return 1;
		} else {
			PrintError.msgEmailIsAlreadyRegistered();
			return -1;
		}
	}

	public static int authenticationLogin() {

		String email = Capture.emailUser();

		String password = Capture.passwordUser();

		return crudImpl.autheticationUser(email, password);

	}

	public static void printProfile(int idUser) {
		Screen.profile(crudImpl.getInstance(idUser));
	}

	public static void Edition(int idUser, String field) {
		
		User user = crudImpl.getInstance(idUser);
		
		if(field == "name"){
			user.setName(Capture.nameUser());
		} else if(field == "lastName"){
			user.setLastName(Capture.lastNameUser());
		} else if(field == "sex"){
			user.setSex(Capture.sexUser());
		} else if(field == "dateBirth"){
			user.setDateBirth(Capture.dateBirthUser());
		} else if(field == "contact"){
			user.profile.setContact(Capture.contactUser());
		} else if(field == "status"){
			user.profile.setStatus(Capture.statusUser());
		}
	}

	public static void EditionInformationProfessional(int idUser) {
		User user = crudImpl.getInstance(idUser);
		
		user.profile.professionalInformation.setCompanyName(Capture.companyName());
		user.profile.professionalInformation.setFunction(Capture.function());
		user.profile.professionalInformation.setInitialDate(Capture.dateFinal());
		user.profile.professionalInformation.setFinalDate(Capture.dateInitial());
	}

	public static void EditionInformationEducational(int idUser) {
		//User user = crudImpl.getInstance(idUser);
		
		//user.profile.professionalInformation.setCompanyName(Capture.courseName());
		//user.profile.professionalInformation.setFunction(Capture.yearConclusion());
		//user.profile.professionalInformation.setInitialDate(Capture.institutionalName());
		
	}
}
