package br.com.fiap.beans;

public class Oficina  {

	private int codigo;
	private String descricaoProblema;
	private String diagnostico;
	private String partesAfetadas;
	private String pecasUsadas;
	private String horasTrabalhadas;
	private Orcamento orcamento;
	public Oficina() {
		super();
	}

	

	public Oficina(String descricaoProblema, String diagnostico, String partesAfetadas, String pecasUsadas,
			String horasTrabalhadas) {
		super();
		this.descricaoProblema = descricaoProblema;
		this.diagnostico = diagnostico;
		this.partesAfetadas = partesAfetadas;
		this.pecasUsadas = pecasUsadas;
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getPartesAfetadas() {
		return partesAfetadas;
	}

	public void setPartesAfetadas(String partesAfetadas) {
		this.partesAfetadas = partesAfetadas;
	}

	public String getPecasUsadas() {
		return pecasUsadas;
	}

	public void setPecasUsadas(String pecasUsadas) {
		this.pecasUsadas = pecasUsadas;
	}

	public String getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(String horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
}
