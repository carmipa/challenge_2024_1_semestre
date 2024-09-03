package br.com.fiap.beans;

public class Endereco {

	private int codigo;
	private String logradouro;
	private int numero;
	private String cep;
	private String estado;
	private String complemento;
	private String observacao;
	private Contato contato;
	
	public Endereco() {
		super();
	}

	public Endereco(String logradouro, int numero, String cep, String estado, String complemento,
			String observacao) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.estado = estado;
		this.complemento = complemento;
		this.observacao = observacao;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	
}
