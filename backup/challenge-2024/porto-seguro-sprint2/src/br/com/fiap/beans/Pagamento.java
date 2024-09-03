package br.com.fiap.beans;

public class Pagamento {

	private int codigo;
	private String tipoPagamento;
	private double desconto;
	private String parcelamento;
	private double totalComDesconto;
	private Orcamento orcamento;

	public Pagamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pagamento(String tipoPagamento, double desconto, String parcelamento, double totalComDesconto,
			Orcamento orcamento) {
		super();
		this.tipoPagamento = tipoPagamento;
		this.desconto = desconto;
		this.parcelamento = parcelamento;
		this.totalComDesconto = totalComDesconto;
		this.orcamento = orcamento;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(String parcelamento) {
		this.parcelamento = parcelamento;
	}

	public double getTotalComDesconto() {
		return totalComDesconto;
	}

	public void setTotalComDesconto(double totalComDesconto) {
		this.totalComDesconto = totalComDesconto;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
	 public double calculaDesconto(Orcamento orcamento) {
	        
		 double servico = orcamento.calculaServico();
		 
	        double valorDesconto = servico * desconto / 100;
	        
	        return servico - valorDesconto;
	    }
	

	@Override
	public String toString() {
		return "Pagamento [tipoPagamento=" + tipoPagamento + ", desconto=" + desconto + ", parcelamento=" + parcelamento
				+ ", totalComDesconto=" + totalComDesconto + ", orcamento=" + orcamento + "]";
	}

}
