package br.edu.ufal.model;

import javax.persistence.Embeddable;

@Embeddable
public class Profile{
	
	public ProfessionalInformation professionalInformation = new ProfessionalInformation();
	public EducationalInformation educationalInformation = new EducationalInformation();
	private String status;
	private String contact;
	
	public Profile() {
		this.status = "-";
		this.contact = "-";
	}

	public ProfessionalInformation getProfessionalInformation() {
		return professionalInformation;
	}

	public void setProfessionalInformation(ProfessionalInformation professionalInformation) {
		this.professionalInformation = professionalInformation;
	}

	public EducationalInformation getEducationalInformation() {
		return educationalInformation;
	}

	public void setEducationalInformation(EducationalInformation educationalInformation) {
		this.educationalInformation = educationalInformation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}	
	
	
}
