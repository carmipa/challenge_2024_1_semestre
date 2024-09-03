package br.com.fiap.beans;

public class Agenda {

	private int codigo;
	private String dataAgendamento;
	private String observacao;

	public Agenda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agenda(String dataAgendamento, String observacao) {
		super();
		this.dataAgendamento = dataAgendamento;
		this.observacao = observacao;
	}

	public String getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "Agenda [dataAgendamento=" + dataAgendamento + ", observacao=" + observacao + "]";
	}

}
