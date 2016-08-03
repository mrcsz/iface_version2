package br.edu.ufal.model;

import javax.persistence.Embeddable;

@Embeddable
public class ProfessionalInformation{
	private String initialDate;
	private String finalDate;
	private String companyName;
	private String function;
	
	
	
	public ProfessionalInformation() {
		this.initialDate = "-";
		this.finalDate = "-";
		this.companyName = "-";
		this.function = "-";
	}
	
	public String getInitialDate() {
		return initialDate;
	}
	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}
	public String getFinalDate() {
		return finalDate;
	}
	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	
		
}
