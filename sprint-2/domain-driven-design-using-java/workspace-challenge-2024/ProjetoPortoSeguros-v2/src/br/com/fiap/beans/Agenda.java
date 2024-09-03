package br.com.fiap.beans;

public class Agenda {

	private int codigo;
	private int dia;
	private String mes;
	private int ano;
	private String diaDaSemana;
	private String observacao;
	private Oficina oficina;

	public Agenda() {
		super();
	}

	public Agenda(int dia, String mes, int ano, String diaDaSemana, String observacao) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diaDaSemana = diaDaSemana;
		this.observacao = observacao;
	}


	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

}
