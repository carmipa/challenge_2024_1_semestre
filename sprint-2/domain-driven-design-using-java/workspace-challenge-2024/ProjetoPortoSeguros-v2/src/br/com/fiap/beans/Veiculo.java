package br.com.fiap.beans;

public abstract class Veiculo {

	private int codigo;
	private String tipo;
	private String montadora;
	private String motor;
	private String anoFabricacao;
	private String placa;
	private String dono;
	
	
	public Veiculo() {
		super();
	}
	public Veiculo(String tipo, String montadora, String motor, String anoFabricacao, String placa,
			String dono) {
		super();
		this.tipo = tipo;
		this.montadora = montadora;
		this.motor = motor;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.dono = dono;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}

}
