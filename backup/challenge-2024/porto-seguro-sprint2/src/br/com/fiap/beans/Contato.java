package br.com.fiap.beans;

public class Contato {
	
	private int codigo;
	private String telefone;
	private String celular;
	private String email;
	private String contato;
	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contato(String telefone, String celular, String email, String contato) {
		super();
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.contato = contato;
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
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	@Override
	public String toString() {
		return "Contato [telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", contato=" + contato
				+ "]";
	}
	
	

}
