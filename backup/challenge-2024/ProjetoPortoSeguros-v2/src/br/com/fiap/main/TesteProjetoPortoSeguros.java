package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Agenda;
import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Contato;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Moto;
import br.com.fiap.beans.Oficina;
import br.com.fiap.beans.Orcamento;
import br.com.fiap.beans.Pagamento;

public class TesteProjetoPortoSeguros {

	public static void main(String[] args) {
		
		//ENTRADAS

		// int codigo, String nome, String dataNascimento, String profissao, String cpf,String observacao
		
		JOptionPane.showMessageDialog(null, "DADOS DO CLIENTE");
		
		Cliente cliente = new Cliente(
				JOptionPane.showInputDialog("nome do cliente:"),
				JOptionPane.showInputDialog("Data de nascimento:"),
				JOptionPane.showInputDialog("Profissão o cliente:"),
				JOptionPane.showInputDialog("CPF do cliente:")
				);

		JOptionPane.showMessageDialog(null, "DADOS DE CONTATO DO CLIENTE");
		
		Contato contato = new Contato(
				JOptionPane.showInputDialog("Número de telefone:"),
				JOptionPane.showInputDialog("Número de celular:"),
				JOptionPane.showInputDialog("E-mail:"),
				JOptionPane.showInputDialog("Observações:")
				);
				
		
		//int codigo, String logradouro, int numero, String cep, String estado, String complemento, String observacao
		
		JOptionPane.showMessageDialog(null, "DADOS DO ENDEREÇO DO CLIENTE");
		
		Endereco endereco = new Endereco(
				JOptionPane.showInputDialog("Logradouro:"),
				Integer.parseInt(JOptionPane.showInputDialog("Numero:")),
				JOptionPane.showInputDialog("CEP:"),
				JOptionPane.showInputDialog("Eestado:"),
				JOptionPane.showInputDialog("Complemento:"),
				JOptionPane.showInputDialog("Observações:")
				);
		
		endereco.setContato(contato);
		cliente.setEndereco(endereco);

		// int codigo, String tipo, String montadora, String motor, String anoFabricacao, String placa, 
		// String dono, int codigo2, String modelo
		
		JOptionPane.showMessageDialog(null, "DADOS DOS VEÍCULOS");
		JOptionPane.showMessageDialog(null, "DADOS DA MOTO");
		
		Moto moto = new Moto(
				JOptionPane.showInputDialog("Tipo da moto:"),
				JOptionPane.showInputDialog("Montaora da moto:"), 
				JOptionPane.showInputDialog("Motor da moto:"), 
				JOptionPane.showInputDialog("Ano de fabricação da moto:"),
				JOptionPane.showInputDialog("Placa da moto:"), 
				JOptionPane.showInputDialog("Proprietário da moto:"),
				JOptionPane.showInputDialog("Modelo da moto:")
				);
		
		JOptionPane.showMessageDialog(null, "DADOS DO CARRO");
		
		Carro carro = new Carro(
				JOptionPane.showInputDialog("Tipo do carro:"),
				JOptionPane.showInputDialog("Montaora do carro:"), 
				JOptionPane.showInputDialog("Motor do carro:"), 
				JOptionPane.showInputDialog("Ano de fabricação do carro:"),
				JOptionPane.showInputDialog("Placa do carro:"), 
				JOptionPane.showInputDialog("Proprietário do carro:"),
				JOptionPane.showInputDialog("Modelo do carro:")
				);
		
		JOptionPane.showMessageDialog(null, "DADOS DO ORÇAMENTO");
		
		Orcamento orcamento = new Orcamento(
				Double.parseDouble(JOptionPane.showInputDialog("Preço da peça:")),
				Double.parseDouble(JOptionPane.showInputDialog("valor da mão de obra:")),
				Double.parseDouble(JOptionPane.showInputDialog("valor da hora trabalhada:")),
				Double.parseDouble(JOptionPane.showInputDialog("Custo total:"))
				);
		
		//int codigo, String descricaoProblema, String diagnostico, String partesAfetadas, String pecasUsadas, String horasTrabalhadas
		
		JOptionPane.showMessageDialog(null, "DADOS DA OFÍCINA");
		
		Oficina oficina = new Oficina(
				JOptionPane.showInputDialog("Descrição o problema:"),
				JOptionPane.showInputDialog("Diagnostico:"),
				JOptionPane.showInputDialog("Partes afetadas:"),
				JOptionPane.showInputDialog("Peças ultilizadas:"),
				JOptionPane.showInputDialog("Horas trabalhadas:")
				);
				
		oficina.setOrcamento(orcamento);
		
		//int codigo, int dia, String mes, int ano, String diaDaSemana, String observacao

		JOptionPane.showMessageDialog(null, "DADOS DO AGENDAMENTO");
		
		Agenda agenda = new Agenda(
				Integer.parseInt(JOptionPane.showInputDialog("Dia do agendamento:")),
				JOptionPane.showInputDialog("Mês do agendamento:"),
				Integer.parseInt(JOptionPane.showInputDialog("Ano do agendamento:")),
				JOptionPane.showInputDialog("Dia da semana do agendamento:"),
				JOptionPane.showInputDialog("Observações:")
				);
		
		agenda.setOficina(oficina);
		cliente.setAgenda(agenda);		
		
		//int codigo, String tipoPagamento, String desconto, String parcelamento

		JOptionPane.showMessageDialog(null, "DADOS DO PAGAMENTO");
		
		Pagamento pagamento = new Pagamento (
				JOptionPane.showInputDialog("Tipo de pagamento:"),
				JOptionPane.showInputDialog("Desconto:"),
				JOptionPane.showInputDialog("Parcelamento:")
				);
		
		pagamento.setOrcamento(orcamento);
		cliente.setPagamento(pagamento);
		
		
		// SAIDAS
				
		System.out.println(" ******************************************* OFICINA - PORTO SEGURO *******************************************" +
				           "\n" +
				           "\n******************************************* CLIENTE *******************************************" +
				           "\n" +
				           "\nINFORMAÇÕES PESSOAIS DO cliente:" + 
						   "\n" +
		                   "\nNome do cliente...............: " + cliente.getNome() + 
		                   "\nData de nascimento do cliente.: " + cliente.getDataNascimento() + 
		                   "\nProfissão do cliente..........: " + cliente.getProfissao() + 
		                   "\nCPF  do cliente...............: " + cliente.getCpf() + 
		                   "\n" +
		                   
		                   "\nENDEREÇO DO cliente" +
		                   "\n" +
		                   "\nLogradouro....................: " + endereco.getLogradouro() + 
		                   "\nNúmero........................: " + endereco.getNumero() +
		                   "\nCEP...........................: " + endereco.getCep() + 
		                   "\nEstado........................: " + endereco.getEstado() + 
		                   "\nComplemento...................: " + endereco.getComplemento() + 
		                   "\nObservações...................: " + endereco.getObservacao() +
		                   "\n" +
		                   
		                   "\nCONTATO DO cliente" +
		                   "\n" +		                   
		                   "\nTelefone fixo.................: " + endereco.getContato().getTelefone() + 
		                   "\nCelular.......................: " + endereco.getContato().getCelular() + 
		                   "\nE-mail........................: " + endereco.getContato().getEmail() + 
		                   "\nObservações...................: " + endereco.getContato().getObservacao() +
		                   "\n"
		                   );
		                   
		                   
		System.out.println("******************************************* INFORMAÇÕES DO VEÍCULO *******************************************" +
		                   "\n" +
		                   "\nINFORMAÇÕES DA MOTO" +
		                   "\n" +		                   
		                   "\nTipo da moto..................: " + moto.getTipo() +
		                   "\nMontaora da moto..............: " + moto.getMontadora() +
		                   "\nmotor da moto.................: " + moto.getMotor() + 
		                   "\nAno de fabricação da moto.....: " + moto.getAnoFabricacao() +
		                   "\nPlaca da moto.................: " + moto.getPlaca() + 
		                   "\nDono da moto..................: " + moto.getDono()	+
		                   "\nModelo da moto................: " + moto.getModelo() +
		                   "\n" +
		                   
						   "\nINFORMAÇÕES DO CARRO" +
						   "\n" +		                   
						   "\nTipo do carro.................: " + carro.getTipo() +
						   "\nMontaora do carro.............: " + carro.getMontadora() +
						   "\nmotor do carroo...............: " + carro.getMotor() + 
						   "\nAno de fabricação do carro....: " + carro.getAnoFabricacao() +
						   "\nPlaca do carro................: " + carro.getPlaca() + 
						   "\nDono do carro.................: " + carro.getDono()	+
						   "\nModelo do carro...............: " + carro.getModelo() +
						   "\n" 
						   );
		
		
		System.out.println("******************************************* OFICINA / AGENDAMENTO *******************************************" +
				           "\n" +
		                   "\nINFORMAÇÕES SOBRE OFICINA" +
		                   "\n" +
		                   "\nDescrição do problema...........: " + oficina.getDescricaoProblema() + 
		                   "\nDiagnostico.....................: " + oficina.getDiagnostico() + 
		                   "\nPartes afetadas.................: " + oficina.getPartesAfetadas() + 
		                   "\nPeças ultilizadas...............: " + oficina.getPecasUsadas() + 
		                   "\nHoras Trabalhadas...............: " + oficina.getHorasTrabalhadas() +
		                   "\n" + 
		                   
		                   "\nINFORMAÇÕES SOBRE AGENDAMENTO" +
		                   "\n" +
		                   "\nDia do agendamento..............: " + agenda.getDia() + 
		                   "\nMês do agendamento..............: " + agenda.getMes() + 
		                   "\nAno do agendamento..............: " + agenda.getAno() + 
		                   "\nDia da semana...................: " + agenda.getDiaDaSemana() +
		                   "\nObservações sobre o agendamento.: " + agenda.getObservacao() +
		                   "\n"
		                   );
		                   
		                   
		System.out.println("******************************************* ORÇAMENTO / PAGAMENTO *******************************************" +
		                   "\n" +
				           "\nINFORMAÇÕES SOBRE O ORÇAMENTO" +
				           "\n" +
		                   "\nPreço da peça...................: " + orcamento.getPrecoPeca() +
		                   "\nValor da mão de obra............: " + orcamento.getMaoDeObra() + 
		                   "\nValor a hora trabalhada.........: " + orcamento.getValorHora() + 
		                   "\nValor total.....................: " + orcamento.getValorTotal() +
		                   "\n" +
		                   
		                   "\nINFORMAÇÕES SOBRE O PAGAMENTO" +
		                   "\n" +
		                   "\nTipo de pagamento...............: " + pagamento.getTipoPagamento() + 
		                   "\nDesconto........................: " + pagamento.getDesconto() + 
		                   "\nParcelamento....................: " + pagamento.getParcelamento()
		                   );
	}

}
