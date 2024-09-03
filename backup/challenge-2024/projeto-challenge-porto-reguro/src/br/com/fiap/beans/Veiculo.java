package br.com.fiap.beans;

public abstract class Veiculo {

	private int codigo;
	private String tipo;
	private String montaora;
	private String motor;
	private String anoFabricacao;
	private String placa;
	private String dono;
	
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veiculo(int codigo, String tipo, String montaora, String motor, String anoFabricacao, String placa,
			String dono) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.montaora = montaora;
		this.motor = motor;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.dono = dono;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMontaora() {
		return montaora;
	}

	public void setMontaora(String montaora) {
		this.montaora = montaora;
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
