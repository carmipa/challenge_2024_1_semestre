package br.com.fiap.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.fiap.beans.Agenda;
import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Clientes;
import br.com.fiap.beans.Contato;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Moto;
import br.com.fiap.beans.Oficina;
import br.com.fiap.beans.Orcamento;
import br.com.fiap.beans.Pagamento;

public class Teste {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Clientes clientes = new Clientes();
		Endereco endereco = new Endereco();
		Contato contato = new Contato();

		Carro carro = new Carro();
		Moto moto = new Moto();

		Agenda agenda = new Agenda();

		Oficina oficina = new Oficina();

		Orcamento orcamento = new Orcamento();
		Pagamento pagamento = new Pagamento();

		int opcao = 0;

		while (true) {

			System.out.println("PORTO SEGUROS - OFICINA MECÂNICA");

			System.out.println("\n1 - CADASTRA CLIENTES" 
			                 + "\n2 - CADASTRA VEÍCULOS" 
					         + "\n3 - AGENDAMENTO DE OFICINA"
					         + "\n4 - OFICINA MECÂNICA" 
					         + "\n5 - ORÇAMENTO E PAGAMENTO" 
					         + "\n6 - SAIR"
					         + "\n"
					         + "\n****************************************************************************************");

			System.out.println("\nDIGITE UMA DAS OPÇOES ACIMA: ");

			try {
				opcao = scanner.nextInt();
				scanner.nextLine(); 

				switch (opcao) {
				case 1: {
					System.out.println("1 - CADASTRA CLIENTES ");
					System.out.println("\nDADOS DO CLIENTE\n");
					System.out.print("Nome do cliente...................: ");
					clientes.setNome(scanner.nextLine());
					System.out.print("Tipo de documento do cliente......: ");
					clientes.setTipoDocumento(scanner.nextLine());
					System.out.print("Número de documento do cliente....: ");
					clientes.setTipoDocumento(scanner.nextLine());
					System.out.print("Data de nascimento do cliente.....: ");
					clientes.setDataNascimento(scanner.nextLine());
					System.out.print("Atividade Profissional do cliente.: ");
					clientes.setAtividadeProfissional(scanner.nextLine());
					System.out.print("Observações sobre o cliente.......: ");
					clientes.setObservacao(scanner.nextLine());
					System.out.println("\nENDEREÇO DO CLIENTE:");
					System.out.print("logradouro........................: ");
					endereco.setLogradouro(scanner.nextLine());
					System.out.print("Número do logradouro..............: ");
					endereco.setNumero(scanner.nextInt());
					scanner.nextLine();
					System.out.print("CEP...............................: ");
					endereco.setCep(scanner.nextLine());
					System.out.print("Estado............................: ");
					endereco.setEstado(scanner.nextLine());
					System.out.print("Complemento.......................: ");
					endereco.setComplemento(scanner.nextLine());
					System.out.print("Observação do endereço............: ");
					endereco.setComplemento(scanner.nextLine());
					System.out.println("\n CONTATOS DO CLIENTE:");
					System.out.print("Número de telefone................: ");
					contato.setTelefone(scanner.nextLine());
					System.out.print("Número de celular.................: ");
					contato.setCelular(scanner.nextLine());
					System.out.print("E-mail............................: ");
					contato.setEmail(scanner.nextLine());
					System.out.print("Contato...........................: ");
					contato.setContato(scanner.nextLine());
					clientes.setEndereco(endereco);
					clientes.setContato(contato);

					System.out.println("\n*************** DADOS DO CLIENTE - SALVOS COM SUCESSO! ***************" 
					                 + "\n"
					                 + "\nCLIENTE:"
					                 + "\n"
					                 + "\nNome...................: "+ clientes.getNome() 
					                 + "\nTipo de documento......: "+ clientes.getTipoDocumento() 
					                 + "\nNúmero de documento....: "+ clientes.getNumeroDocumento() 
					                 + "\nData de nascimento.....: "+ clientes.getDataNascimento() 
					                 + "\nAtividade Profissional.: "+ clientes.getAtividadeProfissional() 
					                 + "\nObservações............: "+ clientes.getObservacao()
					                 + "\n"
					                 + "\nENDEREÇO:"
					                 + "\n"
					                 + "\nLogradouro.............: "+ clientes.getEndereco().getLogradouro() 
					                 + "\nNúmero.................: "+ clientes.getEndereco().getNumero() 
					                 + "\nCEP....................: "+ clientes.getEndereco().getCep() 
					                 + "\nEstado.................: "+ clientes.getEndereco().getEstado()
					                 + "\nComplemento............: "+ clientes.getEndereco().getComplemento() 
					                 + "\nObservações............: "+ clientes.getEndereco().getObservacao()
					                 +"\n"
					                 + "\nCONTATO:"
					                 + "\n"
					                 + "\nTelefone...............: "+ clientes.getContato().getTelefone() 
					                 + "\nCelular................: "+ clientes.getContato().getCelular() 
					                 + "\nE-mail.................: "+ clientes.getContato().getEmail() 
					                 + "\nContato................: "+ clientes.getContato().getContato()
					                 + "\n"
					                 + "\n****************************************************************************************");
					break;
				}

				case 2: {
					
					while (true) {
						
						int tipo = 0;
						
						System.out.println("2 - CADASTRA VEÍCULOS\n");
						System.out.println("\nDADOS DO VEÍCULO\n" 
										 + "\n1 - CARRO" 
										 + "\n2 - MOTO" 
										 + "\n3 - SAIR"
										 + "\n"
										 + "\n****************************************************************************************");
						
						System.out.println("\nEscolha uma das opções: ");
						
						try {
			                opcao = scanner.nextInt();
			                scanner.nextLine(); 
			                tipo = opcao;

							switch (tipo) {
	
							case 1: {
								System.out.println("\nCADASTRA CARRO\n");
								System.out.print("Tipo de veículo.............: ");
								carro.setTipo(scanner.nextLine());
								System.out.print("Modelo do carro.............: ");
								carro.setModelo(scanner.nextLine());
								System.out.print("Montadora do carro..........: ");
								carro.setMontadora(scanner.nextLine());
								System.out.print("Motor do Carro..............: ");
								carro.setMotor(scanner.nextLine());
								System.out.print("Ano de fabricações do carro.: ");
								carro.setAnofabricacao(scanner.nextLine());
								System.out.print("Placa do Carro..............: ");
								carro.setPlaca(scanner.nextLine());
								System.out.print("Proprietário do Carro.......: ");
								carro.setProprietario(scanner.nextLine());
								System.out.print("Observações.................: ");
								carro.setObservacao(scanner.nextLine());
	
								System.out.println("\n*************** DADOS DO CARRO - SALVOS COM SUCESSO! ***************"
												 + "\n" 
												 + "\nTipo................: " + carro.getTipo() 
												 + "\nModelo..............: " + carro.getModelo() 
												 + "\nMontadora...........: " + carro.getMontadora()
												 + "\nMotor...............: " + carro.getMotor() 
												 + "\nAno de Fabricação...: " + carro.getAnofabricacao() 
												 + "\nPlaca...............: " + carro.getPlaca()
												 + "\nProprietário........: " + carro.getProprietario() 
												 + "\nObservação..........: " + carro.getObservacao() 
												 + "\n"
												 + "\n****************************************************************************************");
								break;
							}
	
							case 2: {
								System.out.println("\nCADASTRA MOTO\n");
								System.out.print("Tipo de veículo............: ");
								moto.setTipo(scanner.nextLine());
								System.out.print("Modelo da Moto.............: ");
								moto.setModelo(scanner.nextLine());
								System.out.print("Montadora da Moto..........: ");
								moto.setMontadora(scanner.nextLine());
								System.out.print("Motor da Moto..............: ");
								moto.setMotor(scanner.nextLine());
								System.out.print("Ano de fabricações da Moto.: ");
								moto.setAnofabricacao(scanner.nextLine());
								System.out.print("Placa da Moto..............: ");
								moto.setPlaca(scanner.nextLine());
								System.out.print("Proprietário da Moto.......: ");
								moto.setProprietario(scanner.nextLine());
								System.out.print("Observações................: ");
								moto.setObservacao(scanner.nextLine());
	
								System.out.println("\n*************** DADOS DA MOTO - SALVOS COM SUCESSO! ***************"
												+ "\n" 
												+ "\nTipo................: " + moto.getTipo() 
												+ "\nModelo..............: " + moto.getModelo() 
												+ "\nMontadora...........: " + moto.getMontadora()
												+ "\nMotor...............: " + moto.getMotor() 
												+ "\nAno de Fabricação...: " + moto.getAnofabricacao() 
												+ "\nPlaca...............: " + moto.getPlaca()
												+ "\nProprietário........: " + moto.getProprietario() 
												+ "\nObservação..........: " + moto.getObservacao() 
												+ "\n"
												+ "\n****************************************************************************************");
								break;
							}
	
							case 3: {
								System.err.println("SAIR");
								scanner.close();
								System.exit(0);
							}
	
							default:
								System.err.println("Opção inválida. Tente novamente.");
							}
							
					} catch (InputMismatchException e) {
		                System.err.println("Entrada inválida. Digite um número inteiro.");
		                scanner.next();
		            }
					}
				}

				case 3: {
					System.out.println("\n1 - AGENDAMENTO DE OFICINA\n");
					System.out.print("Escolha uma data para agendar a oficina.: ");
					agenda.setDataAgendamento(scanner.nextLine());
					System.out.print("Observações.............................: ");
					agenda.setObservacao(scanner.nextLine());
					
					System.out.println("\n*************** DADOS DO AGENDAMENTO - SALVOS COM SUCESSO! ***************"
									 + "\n" 
									 + "\nData agendada.: " + agenda.getDataAgendamento() 
									 + "\nObservações...: " + agenda.getObservacao() 
									 + "\n"
									 + "\n****************************************************************************************");
					break;
				}

				case 4: {
					System.out.println("4 - OFICINA MECÂNICA\n");
					System.out.print("Descreva o problema do véiculo.............: ");
					oficina.setDescricaoProblema(scanner.nextLine());
					System.out.print("Descreva o diagnóstico do veículo..........: ");
					oficina.setDiagnostico(scanner.nextLine());
					System.out.print("Liste as partes afetadas no veículo........: ");
					oficina.setPartesAfetadas(scanner.nextLine());
					System.out.print("Liste as peças usadas para o concerto......: ");
					oficina.setPecasUsadas(scanner.nextLine());
					System.out.print("Quantidade de horas gastas para o concerto.: ");
					oficina.setHorasTrbalhadas(scanner.nextDouble());
					scanner.nextLine();
					System.out.print("Observações................................: ");
					oficina.setObservacao(scanner.nextLine());

					System.out.println("\n*************** DADOS DA OFICINA - SALVOS COM SUCESSO! ***************" 
							+ "\n"
							+ "\nDescrição do problema......: " + oficina.getDescricaoProblema()
							+ "\nDiagnóstico................: " + oficina.getDiagnostico()
							+ "\nPartes Afetadas............: " + oficina.getPartesAfetadas()
							+ "\nPeças usadas...............: " + oficina.getPecasUsadas()
							+ "\nQuantidade de horas Gastas.: " + oficina.getHorasTrbalhadas()
							+ "\nObservações................: " + oficina.getObservacao() 
							+ "\n"
							+ "\n****************************************************************************************");
					break;
				}

				case 5: {
					System.out.println("5 - ORÇAMENTO E PAGAMENTO\n");
					System.out.println("\nORÇAMENTO DO SERVIÇO:\n");
					System.out.print("Preço das peças usadas..........: R$ ");
					orcamento.setPrecoPeca(scanner.nextDouble());
					scanner.nextLine();
					System.out.print("Valor da mão de óbra............: R$ ");
					orcamento.setMaoDeObra(scanner.nextDouble());
					scanner.nextLine();
					System.out.print("Valor da Hora...................: R$ ");
					orcamento.setValorHora(scanner.nextDouble());
					scanner.nextLine();
					System.out.print("Quantidade de horas trabalhadas.: ");
					orcamento.setQuantidadeHoras(scanner.nextInt());
					scanner.nextLine();
					System.out.print("Valor Total do Serviço..........: R$ " + orcamento.calculaServico());
					orcamento.setValorTotal(orcamento.calculaServico());
					scanner.nextLine();
					pagamento.setOrcamento(orcamento);
					System.out.println("\nPAGAMENTO:\n");
					System.out.print("Tipo de Pagamento...............: ");
					pagamento.setTipoPagamento(scanner.nextLine());
					scanner.nextLine();
					System.out.print("Desconto........................: ");
					pagamento.setDesconto(scanner.nextDouble());
					scanner.nextLine();
					System.out.print("Parcelamento....................: ");
					pagamento.setParcelamento(scanner.nextLine());
					scanner.nextLine();
					System.out.print("Valor total com desconto........: R$ " + pagamento.calculaDesconto(orcamento));
					pagamento.setTotalComDesconto(pagamento.calculaDesconto(orcamento));
					scanner.nextLine();

					System.out.println(
							"\n*************** DADOS DO ORÇAMENTO E DO PAGAMENTO - SALVOS COM SUCESSO! ***************"
									+ "\n" 
									+ "\nORÇAMENTO DO SERVIÇO:" 
									+ "\n"
									+ "\nPreço das peças.....................: R$ " + pagamento.getOrcamento().getPrecoPeca()
									+ "\nValor da mão de óbra................: R$ " + pagamento.getOrcamento().getMaoDeObra()
									+ "\nValor da hora de serviço............: R$ " + pagamento.getOrcamento().getValorHora()
									+ "\nQuantidade de horas trabalhadas.....: " + pagamento.getOrcamento().getQuantidadeHoras()
									+ "\nValor total do serviço..............: R$ "+ pagamento.getOrcamento().getValorTotal() 
									+ "\n" 
									+ "\nPAGAMENTO:" 
									+ "\n"
									+ "\nTipo de pagamento...................: " + pagamento.getTipoPagamento()
									+ "\nDesconto............................: " + pagamento.getDesconto() + " %"
									+ "\nParcelamento........................: " + pagamento.getParcelamento()
									+ "\nValor total do serviço com desconto.: R$ " + pagamento.getTotalComDesconto()
									+ "\n"
									+ "\n****************************************************************************************");
					break;
				}

				case 6: {
					System.err.println("SAIR DO SISTEMA");
					scanner.close();
					System.exit(0);
				}

				default:
					System.err.println("Opção inválida. Tente novamente.");
				}

			} catch (InputMismatchException e) {
				System.err.println("Entrada inválida. Digite um número inteiro.");
				scanner.next(); 

			}
		}

	}

}
