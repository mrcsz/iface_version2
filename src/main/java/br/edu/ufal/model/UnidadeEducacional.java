package br.edu.ufal.model;

public class UnidadeEducacional {
	private String curso;
	private String anoConclusao;
	private String nomeInstituicao;
	
	public UnidadeEducacional() {
		
		this.curso = null;
		this.anoConclusao = null;
		this.nomeInstituicao = null;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getAnoConclusao() {
		return anoConclusao;
	}

	public void setAnoConclusao(String anoConclusao) {
		this.anoConclusao = anoConclusao;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	
	
	
	
}
