package br.com.fiap.beans;

public class Orcamento {

	private int codigo;
	private double precoPeca;
	private double maoDeObra;
	private double valorHora;
	private int quantidadeHoras;
	private double valorTotal;
	private Oficina oficina;

		
	public Orcamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Orcamento(double precoPeca, double maoDeObra, double valorHora, int quantidadeHoras, double valorTotal,
			Oficina oficina) {
		super();
		this.precoPeca = precoPeca;
		this.maoDeObra = maoDeObra;
		this.valorHora = valorHora;
		this.quantidadeHoras = quantidadeHoras;
		this.valorTotal = valorTotal;
		this.oficina = oficina;
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



	public int getQuantidadeHoras() {
		return quantidadeHoras;
	}



	public void setQuantidadeHoras(int quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}



	public double getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}



	public Oficina getOficina() {
		return oficina;
	}



	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}



	public double calculaServico() {
		
		return precoPeca + maoDeObra + (valorHora * quantidadeHoras);
	}

	@Override
	public String toString() {
		return "Orcamento [precoPeca=" + precoPeca + ", maoDeObra=" + maoDeObra + ", valorHora=" + valorHora
				+ ", valorTotal=" + valorTotal + ", oficina=" + oficina + "]";
	}

}
