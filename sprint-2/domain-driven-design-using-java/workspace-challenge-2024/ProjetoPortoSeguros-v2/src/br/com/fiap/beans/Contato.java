package br.com.fiap.beans;

public class Contato {

	private int codigo;
	private String telefone;
	private String celular;
	private String email;
	private String observacao;

	public Contato() {
		super();
	}

	

	public Contato(String telefone, String celular, String email, String observacao) {
		super();
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.observacao = observacao;
	}


	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
