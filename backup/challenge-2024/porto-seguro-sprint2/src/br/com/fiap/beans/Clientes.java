package br.com.fiap.beans;

public class Clientes{
	
	private int codigo;
	private String nome;
	private String tipoDocumento;
	private String numeroDocumento;
	private String dataNascimento;
	private String atividadeProfissional;
	private String observacao;
	private Endereco endereco;
	private Contato contato;
	private Agenda agenda;
	private Oficina oficina;
	private Carro carro;
	private Moto moto;
	private Orcamento orcamento;
	private Pagamento pagamento;
	
	
	public Clientes() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Clientes(String nome, String tipoDocumento, String numeroDocumento, String dataNascimento,
			String atividadeProfissional, String observacao, Endereco endereco, Contato contato, Agenda agenda,
			Oficina oficina, Carro carro, Moto moto, Orcamento orcamento, Pagamento pagamento) {
		super();
		this.nome = nome;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.dataNascimento = dataNascimento;
		this.atividadeProfissional = atividadeProfissional;
		this.observacao = observacao;
		this.endereco = endereco;
		this.contato = contato;
		this.agenda = agenda;
		this.oficina = oficina;
		this.carro = carro;
		this.moto = moto;
		this.orcamento = orcamento;
		this.pagamento = pagamento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public String getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getAtividadeProfissional() {
		return atividadeProfissional;
	}


	public void setAtividadeProfissional(String atividadeProfissional) {
		this.atividadeProfissional = atividadeProfissional;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Contato getContato() {
		return contato;
	}


	public void setContato(Contato contato) {
		this.contato = contato;
	}


	public Agenda getAgenda() {
		return agenda;
	}


	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}


	public Oficina getOficina() {
		return oficina;
	}


	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}


	public Carro getCarro() {
		return carro;
	}


	public void setCarro(Carro carro) {
		this.carro = carro;
	}


	public Moto getMoto() {
		return moto;
	}


	public void setMoto(Moto moto) {
		this.moto = moto;
	}


	public Orcamento getOrcamento() {
		return orcamento;
	}


	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}


	public Pagamento getPagamento() {
		return pagamento;
	}


	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}


	@Override
	public String toString() {
		return "Clientes [nome=" + nome + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento
				+ ", dataNascimento=" + dataNascimento + ", atividadeProfissional=" + atividadeProfissional
				+ ", observacao=" + observacao + ", endereco=" + endereco + ", contato=" + contato + ", agenda="
				+ agenda + ", oficina=" + oficina + ", carro=" + carro + ", moto=" + moto + ", orcamento=" + orcamento
				+ ", pagamento=" + pagamento + "]";
	}
	
	

	
	
	
	

}
