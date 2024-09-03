package br.com.fiap.beans;

public class Carro extends Veiculo {

	private int codigo;
	private String tipo;

	public Carro() {
		super();
		
	}

	public Carro(String modelo, String montadora, String motor, String anofabricacao, String placa, String proprietario,
			String observacao, String tipo) {
		super(modelo, montadora, motor, anofabricacao, placa, proprietario, observacao);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Carro [getTipo()=" + getTipo() + ", getModelo()=" + getModelo() + ", getMontadora()=" + getMontadora()
				+ ", getMotor()=" + getMotor() + ", getAnofabricacao()=" + getAnofabricacao() + ", getPlaca()="
				+ getPlaca() + ", getProprietario()=" + getProprietario() + ", getObservacao()=" + getObservacao()
				+ "]";
	}

}
