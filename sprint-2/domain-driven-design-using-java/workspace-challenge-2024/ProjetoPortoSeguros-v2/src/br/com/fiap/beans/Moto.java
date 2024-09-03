package br.com.fiap.beans;

public class Moto extends Veiculo {

	private int codigo;
	private String modelo;

	public Moto() {
		super();
	}

	public Moto(String tipo, String montadora, String motor, String anoFabricacao, String placa,
			String dono, String modelo) {
		super(tipo, montadora, motor, anoFabricacao, placa, dono);
		this.modelo = modelo;
	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
