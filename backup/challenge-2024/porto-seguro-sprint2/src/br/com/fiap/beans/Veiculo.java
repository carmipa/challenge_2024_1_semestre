package br.com.fiap.beans;

public abstract class Veiculo {

	private int codigo;
	private String modelo;
	private String montadora;
	private String motor;
	private String anofabricacao;
	private String placa;
	private String proprietario;
	private String observacao;

	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veiculo(String modelo, String montadora, String motor, String anofabricacao, String placa,
			String proprietario, String observacao) {
		super();
		this.modelo = modelo;
		this.montadora = montadora;
		this.motor = motor;
		this.anofabricacao = anofabricacao;
		this.placa = placa;
		this.proprietario = proprietario;
		this.observacao = observacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getAnofabricacao() {
		return anofabricacao;
	}

	public void setAnofabricacao(String anofabricacao) {
		this.anofabricacao = anofabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
