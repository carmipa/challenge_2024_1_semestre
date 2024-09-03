package br.com.fiap.beans;

public class Oficina {

	private int codigo;
	private String descricaoProblema;
	private String diagnostico;
	private String partesAfetadas;
	private String pecasUsadas;
	private int horasTrbalhadas;
	private String observacao;
	private Agenda agenda;
	private Veiculo veiculo;

	public Oficina() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oficina(String descricaoProblema, String diagnostico, String partesAfetadas, String pecasUsadas,
			int horasTrbalhadas, String observacao) {
		super();
		this.descricaoProblema = descricaoProblema;
		this.diagnostico = diagnostico;
		this.partesAfetadas = partesAfetadas;
		this.pecasUsadas = pecasUsadas;
		this.horasTrbalhadas = horasTrbalhadas;
		this.observacao = observacao;
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

	public int getHorasTrbalhadas() {
		return horasTrbalhadas;
	}

	public void setHorasTrbalhadas(int horasTrbalhadas) {
		this.horasTrbalhadas = horasTrbalhadas;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public String toString() {
		return "Oficina [descricaoProblema=" + descricaoProblema + ", diagnostico=" + diagnostico + ", partesAfetadas="
				+ partesAfetadas + ", pecasUsadas=" + pecasUsadas + ", horasTrbalhadas=" + horasTrbalhadas
				+ ", observacao=" + observacao + ", agenda=" + agenda + ", veiculo=" + veiculo + "]";
	}

}
