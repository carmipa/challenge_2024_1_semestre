package br.com.fiap.beans;

public class Moto extends Veiculo {

	private int codigo;
	private String modelo;

	public Moto() {
		super();

	}

	public Moto(int codigo, String tipo, String montaora, String motor, String anoFabricacao, String placa, String dono,
			int codigo2, String modelo) {
		super(codigo, tipo, montaora, motor, anoFabricacao, placa, dono);
		codigo = codigo2;
		this.modelo = modelo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Moto [codigo=" + codigo + ", modelo=" + modelo + ", getCodigo()=" + getCodigo() + ", getModelo()="
				+ getModelo() + ", getTipo()=" + getTipo() + ", getMontaora()=" + getMontaora() + ", getMotor()="
				+ getMotor() + ", getAnoFabricacao()=" + getAnoFabricacao() + ", getPlaca()=" + getPlaca()
				+ ", getDono()=" + getDono() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
