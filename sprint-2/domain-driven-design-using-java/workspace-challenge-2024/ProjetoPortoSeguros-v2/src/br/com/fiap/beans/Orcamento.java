package br.com.fiap.beans;

public class Orcamento {

	private int codigo;
	private double precoPeca;
	private double maoDeObra;
	private double valorHora;
	private double valorTotal;

	public Orcamento() {
		super();
	}

	public Orcamento(double precoPeca, double maoDeObra, double valorHora, double valorTotal) {
		super();
		this.precoPeca = precoPeca;
		this.maoDeObra = maoDeObra;
		this.valorHora = valorHora;
		this.valorTotal = valorTotal;
	}

	public double getPrecoPeca() {
		return precoPeca;
	}

	public void setPrecoPeca(double precoPeca) {
		this.precoPeca = precoPeca;
	}

	public double getMaoDeObra() {
		return maoDeObra;
	}

	public void setMaoDeObra(double maoDeObra) {
		this.maoDeObra = maoDeObra;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
