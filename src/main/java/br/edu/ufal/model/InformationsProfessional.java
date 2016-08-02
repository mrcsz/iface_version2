package br.edu.ufal.model;

public class InformationsProfessional{
	private String inicio;
	private String fim;
	private String nomeEmpresa;
	private String funcao;
	
	
	public InformationsProfessional() {
		
		this.inicio = null;
		this.fim = null;
		this.nomeEmpresa = null;
		this.funcao = null;
	}
	
	
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	public String getFim() {
		return fim;
	}
	public void setFim(String fim) {
		this.fim = fim;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
}
