package br.com.fiap.beans;

public class Pagamento {

	private int codigo;
	private String tipoPagamento;
	private String desconto;
	private String parcelamento;
	private Orcamento orcamento;

	public Pagamento() {
		super();
	}

	public Pagamento(String tipoPagamento, String desconto, String parcelamento) {
		super();
		this.tipoPagamento = tipoPagamento;
		this.desconto = desconto;
		this.parcelamento = parcelamento;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getDesconto() {
		return desconto;
	}

	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}

	public String getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(String parcelamento) {
		this.parcelamento = parcelamento;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

}
