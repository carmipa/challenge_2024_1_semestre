#########################################################################################################################################
#
#     INSTRUÇÕES DE USO:
#
# 1 - quando houver uma opção de pesquisa no menu use as seguinte opções:
#     ex: 1 ou 2 ou 3 - "sempre um destes 3 código"
#
# 2 - O programa usa a biblioteca "COLORAMA", como visto no importe, para que funcione corretamente use
#     o seguinte comando no console abaixo antes de rodar o programa:
#     "pip install colorama"
#     OBS: se a biblioteca já estiver instalada, não é necessário a instalar
#
#########################################################################################################################################

# importa bibiotecas de cores e para limpesa de tela

import os
import sys
import colorama

# inicializa o colorama que cria as corers personalizadas nos mesnus e alertas

colorama.init()

#########################################################################################################################################

# lista global

adicionaCliente = []
adicionaVeiculos = []
adicionarAgendamentoOficina = []
adicionaOrcamentoPagamento = []

#########################################################################################################################################


def exibeMenu():
        
    print(colorama.Fore.BLUE +"**************************************** PORTO SEGURO / OFICINA ON-LINE ****************************************"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "MENU PRINCÍPAL                                                                  *")                                                                                                            
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "1 - CADASTRAR NOVOS CLIENTES")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "2 - CADASTRAR VEICULOS")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "3 - AGENDAMENTO / OFICINA ON-LINE")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "4 - ORÇAMENTO / PAGAMENTO")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "LISTAR DADOS")                                                                                                              
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "5 - LISTA DE CLIENTES CADASTRADOS")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "6 - LISTA DE VEÍCULOS CADASTRADOS")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "7 - LISTA DE OFICINA E AGENDAMENTO CADASTRADOS")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "8 - LISTA DE PAGAMENTOS CADASTRADOS")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)                                                                                                           
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "0 - SAIR DO SISTEMA")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"****************************************************************************************************************"+ colorama.Style.RESET_ALL)


def escolherOpcao():
    try:
        opcao_escolhida = int(input('Escolha uma opção: '))

        if opcao_escolhida == 1: 
            cadastrarNovosClientes()
        elif opcao_escolhida == 2:
            cadastrarNovosVeiculos() 
        elif opcao_escolhida == 3: 
            cadastrarNovosAgendamentoOficina() 
        elif opcao_escolhida == 4: 
            cadastraNovosOrcamentoPagamento() 
        elif opcao_escolhida == 5: 
            listarClientes()
        elif opcao_escolhida == 6: 
            listarVeiculos()
        elif opcao_escolhida == 7: 
            listarAgendaOficina()
        elif opcao_escolhida == 8: 
            listarOrcacamentoPagamento()
        elif opcao_escolhida == 0: 
            finalizarSistema() 
        else: 
            opcaoInvalida()
    except:
        opcaoInvalida()
    return opcao_escolhida

def opcaoInvalida():
    print(colorama.Fore.RED + "**************************************** OPÇÃO INVÁLIDA ****************************************" + colorama.Style.RESET_ALL)
    voltarMenuPrincipal() 


def voltarMenuPrincipal():

    input("\nDigite uma tecla para voltar ao menu: ")
    return  # Simplesmente retorna à função main()


def cadastrarNovosClientes():

    os.system('cls')
    
    print(colorama.Fore.BLUE +"**************************************** CADASTRAR NOVOS CLIENTES ****************************************"+colorama.Style.RESET_ALL)
    
    cliente = [] # Crie uma lista para armazenar os dados do cliente
    print(colorama.Fore.BLUE +"DADOS DO CLIENTE"+ colorama.Style.RESET_ALL)
    cliente.append(input("NOME...............: "))
    cliente.append(input("DATA DE NASCIMENTO.: "))
    cliente.append(input("PROFISÃO...........: "))
    cliente.append(input("CPF................: "))
    cliente.append(input("NASCIONALIDADE.....: "))
    print(colorama.Fore.BLUE +"CONTATOS DO CLIENTE"+ colorama.Style.RESET_ALL)
    cliente.append(input("NÚMERO DE TELEFÔNE.: "))
    cliente.append(input("NÚMERO DE CELUAR...: "))
    cliente.append(input("E-MAIL.............: "))
    print(colorama.Fore.BLUE +"ENDEREÇO DO CLIENTE"+ colorama.Style.RESET_ALL)
    cliente.append(input("LOGRADOURO.........: "))
    cliente.append(input("Número.............: "))
    cliente.append(input("CEP................: "))
    cliente.append(input("ESTADO.............: "))
    cliente.append(input("COMPLEMENTO........: "))

    adicionaCliente.append(cliente) # adiciona cliente a lista global

    print("\n")
    print("\n")
    print(colorama.Fore.YELLOW +"**************************************** DADOS DO CLIENTE CADASTRADOS COM SUCESSO ****************************************" + colorama.Style.RESET_ALL)
    print("\n")
    print("\n")
    voltarMenuPrincipal()


def listarClientes():

    os.system('cls')
    print(colorama.Fore.YELLOW + "**************************************** LISTA DE CLIENTES ****************************************" )
    if adicionaCliente:
        for i, cliente in enumerate(adicionaCliente):
            print(f"\nCliente {i+1}:")
            print("\n".join(cliente) + colorama.Style.RESET_ALL)  # Junta os dados do cliente com quebras de linha
    else:
        print("\n")
        print("\n")
        print("\n")
        print("\n")
        print(colorama.Fore.RED + "**************************************** ! NENHUM CLIENTE CADASTRADO ! ****************************************" + colorama.Style.RESET_ALL)
        print("\n")
        print("\n")
        print("\n")
        print("\n")
    voltarMenuPrincipal()


def cadastrarNovosVeiculos():

    os.system('cls')
    
    print(colorama.Fore.BLUE +"**************************************** CADASTRAR NOVOS VEÍCULOS ****************************************"+colorama.Style.RESET_ALL)

    veiculo = [] # Crie uma lista para armazenar os dados do veiculo
    print(colorama.Fore.BLUE +"DADOS DO CLIENTE"+ colorama.Style.RESET_ALL)
    veiculo.append(input("MODELO............: "))
    veiculo.append(input("MONTADORA.........: "))
    veiculo.append(input("MOTOR.............: "))
    veiculo.append(input("ANO DE FABRICAÇÃO.: "))
    veiculo.append(input("PLACA.............: "))
    veiculo.append(input("PROPRIETÁRIO......: "))
    veiculo.append(input("OBSERVAÇÃO........: "))

    adicionaVeiculos.append(veiculo) # adiciona veiculo a lista global

    print("\n")
    print("\n")
    print(colorama.Fore.YELLOW +"**************************************** DADOS DO VEÍCULO CADASTRADOS COM SUCESSO ****************************************" + colorama.Style.RESET_ALL)
    print("\n")
    print("\n")
    voltarMenuPrincipal()


def listarVeiculos():

    os.system('cls')
    print(colorama.Fore.YELLOW + "**************************************** LISTA DE VEÍCULOS ****************************************" )
    if adicionaVeiculos:
        for i, veiculo in enumerate(adicionaVeiculos):
            print(f"\nCliente {i+1}:")
            print("\n".join(veiculo) + colorama.Style.RESET_ALL)  # Junta os dados do VEÍCULO com quebras de linha
    else:
        print("\n")
        print("\n")
        print("\n")
        print("\n")
        print(colorama.Fore.RED + "**************************************** ! NENHUM VEÍCULO CADASTRADO ! ****************************************" + colorama.Style.RESET_ALL)
        print("\n")
        print("\n")
        print("\n")
        print("\n")
    voltarMenuPrincipal()


def cadastrarNovosAgendamentoOficina():

    os.system('cls')
    
    print(colorama.Fore.BLUE +"**************************************** CADASTRAR NOVO AGENDAMENTO / OFICINA ON-LINE ****************************************"+colorama.Style.RESET_ALL)
    
    agendamentoOficina = [] # Crie uma lista para armazenar os dados do agendamento
    print("\n")
    print(colorama.Fore.BLUE +"AGENDAMENTO"+ colorama.Style.RESET_ALL)
    agendamentoOficina.append(input("DATA.....................................: "))
    print("\n")
    print(colorama.Fore.BLUE +"AGENDAMENTO"+ colorama.Style.RESET_ALL)
    agendamentoOficina.append(input("DESCRIÇÃO DO PROBLEMA DO VEÍCULO.........: "))
    agendamentoOficina.append(input("DIAGNOSTICO DO VEÍCULO...................: "))
    agendamentoOficina.append(input("PARTES AFETADAS..........................: "))
    agendamentoOficina.append(input("PEÇAS USADAS.............................: "))
    agendamentoOficina.append(input("HORAS TRABALHADAS........................: "))

    adicionarAgendamentoOficina.append(agendamentoOficina) # adiciona agendamento a lista global
    
    print("\n")
    print("\n")
    print(colorama.Fore.YELLOW +"**************************************** DADOS DO VEÍCULO CADASTRADOS COM SUCESSO ****************************************" + colorama.Style.RESET_ALL)
    print("\n")
    print("\n")
    voltarMenuPrincipal()


def listarAgendaOficina():

    os.system('cls')
    print(colorama.Fore.YELLOW + "**************************************** LISTA DE VEÍCULOS ****************************************" )
    if adicionarAgendamentoOficina:
        for i, agendamentoOficina in enumerate(adicionarAgendamentoOficina):
            print(f"\nCliente {i+1}:")
            print("\n".join(agendamentoOficina) + colorama.Style.RESET_ALL)  # Junta os dados do agendamento e oficina com quebras de linha
    else:
        print("\n")
        print("\n")
        print("\n")
        print("\n")
        print(colorama.Fore.RED + "**************************************** ! NENHUM AGENDAMENTO / OFICINA CADASTRADO ! ****************************************" + colorama.Style.RESET_ALL)
        print("\n")
        print("\n")
        print("\n")
        print("\n")
    voltarMenuPrincipal()


def cadastraNovosOrcamentoPagamento():

    os.system('cls')
    
    print(colorama.Fore.BLUE +"**************************************** CADASTRAR NOVO ORÇAMENTO / PAGAMENTO ****************************************"+colorama.Style.RESET_ALL)
    print("\n")
    print(colorama.Fore.BLUE +"ORÇAMENTO DO SERVIÇO"+ colorama.Style.RESET_ALL)

    orcamentoPagamento = [] # Crie uma lista para armazenar os dados do cliente
    
    orcamentoPagamento.append(input("PREÇO DAS PEÇAS................................: ")) # 0
    orcamentoPagamento.append(input("VALOR DA HORA DO TRABALHO......................: ")) # 1
    orcamentoPagamento.append(input("QUANTIDADE DE HORAS TRABALHADAS................: ")) # 2
    orcamentoPagamento.append(input("MÃO DE ÓBRA....................................: ")) # 3
    orcamentoPagamento.append(input("VALOR TOTAL....................................: ")) # 4
    print("/n")
    print(colorama.Fore.BLUE +"PAGAMENTO"+ colorama.Style.RESET_ALL)
    orcamentoPagamento.append(input("TIPO DE PAGAMENTO..............................: ")) # 5
    orcamentoPagamento.append(input("DESCONTO.......................................: ")) # 6
    orcamentoPagamento.append(input("PARCELAMENTO...................................: ")) # 7
    orcamentoPagamento.append(input("QUANTIDADE DE PARCELAS.........................: ")) # 8
    orcamentoPagamento.append(input("VALOR DAS PARCELAS.............................: ")) # 8
    orcamentoPagamento.append(input("VALOR TOTAL DO SERVIÇO COM DESCONTO............: ")) # 9

    adicionaOrcamentoPagamento.append(orcamentoPagamento) # adiciona orcamento e pagamento a lista global

    print("\n")
    print("\n")
    print(colorama.Fore.YELLOW +"**************************************** DADOS DO CLIENTE CADASTRADOS COM SUCESSO ****************************************" + colorama.Style.RESET_ALL)
    print("\n")
    print("\n")
    voltarMenuPrincipal()


def listarOrcacamentoPagamento():

    os.system('cls')
    print(colorama.Fore.YELLOW + "**************************************** LISTA DE CLIENTES ****************************************" )
    if adicionaOrcamentoPagamento:
        for i, orcamentoPagamento in enumerate(adicionaOrcamentoPagamento):
            print(f"\nCliente {i+1}:")
            print("\n".join(orcamentoPagamento) + colorama.Style.RESET_ALL)  # Junta os dados do cliente com quebras de linha
    else:
        print("\n")
        print("\n")
        print("\n")
        print("\n")
        print(colorama.Fore.RED + "**************************************** ! NENHUM CLIENTE CADASTRADO ! ****************************************" + colorama.Style.RESET_ALL)
        print("\n")
        print("\n")
        print("\n")
        print("\n")
    voltarMenuPrincipal()


def finalizarSistema():

    print(colorama.Fore.RED + "**************************************** ! SAINDO DO SISTEMA ! ****************************************"+ colorama.Style.RESET_ALL)
    exit()  # Encerra a execução do programa

def main():
    while True:
        exibeMenu()
        escolherOpcao() 

if __name__ == '__main__':
    main()