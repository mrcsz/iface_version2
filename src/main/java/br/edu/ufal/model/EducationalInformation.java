package br.edu.ufal.model;

import javax.persistence.Embeddable;

@Embeddable
public class EducationalInformation {
	private String course;
	private String yearConclusion;
	private String institutionalName;
	
	public EducationalInformation() {
		
		this.course = "";
		this.yearConclusion = "";
		this.institutionalName = "";
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getYearConclusion() {
		return yearConclusion;
	}

	public void setYearConclusion(String yearConclusion) {
		this.yearConclusion = yearConclusion;
	}

	public String getInstitutionalName() {
		return institutionalName;
	}

	public void setInstitutionalName(String institutionalName) {
		this.institutionalName = institutionalName;
	}
	
}
