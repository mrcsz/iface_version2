package br.edu.ufal.components;

public class Profile{
	InformationsProfessional trabalho;
	UnidadeEducacional unidadeEducacional;
	private String status;
	private String telefone;
	
	public Profile() {
		this.trabalho = new InformationsProfessional();
		this.unidadeEducacional = new UnidadeEducacional();
		this.status = null;
		this.telefone = null;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
