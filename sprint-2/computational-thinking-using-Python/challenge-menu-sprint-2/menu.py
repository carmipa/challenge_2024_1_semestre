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

#########################################################################################################################################

# inicializa o colorama que cria as corers personalizadas nos mesnus e alertas

colorama.init()

#########################################################################################################################################

# lista global

adicionaCliente = []

#########################################################################################################################################

def exibir_nome_do_programa():
    print("""
██████╗░░█████╗░██████╗░████████╗░█████╗░  ░██████╗███████╗░██████╗░██╗░░░██╗██████╗░░█████╗░  ░░░░██╗
██╔══██╗██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗  ██╔════╝██╔════╝██╔════╝░██║░░░██║██╔══██╗██╔══██╗  ░░░██╔╝
██████╔╝██║░░██║██████╔╝░░░██║░░░██║░░██║  ╚█████╗░█████╗░░██║░░██╗░██║░░░██║██████╔╝██║░░██║  ░░██╔╝░
██╔═══╝░██║░░██║██╔══██╗░░░██║░░░██║░░██║  ░╚═══██╗██╔══╝░░██║░░╚██╗██║░░░██║██╔══██╗██║░░██║  ░██╔╝░░
██║░░░░░╚█████╔╝██║░░██║░░░██║░░░╚█████╔╝  ██████╔╝███████╗╚██████╔╝╚██████╔╝██║░░██║╚█████╔╝  ██╔╝░░░
╚═╝░░░░░░╚════╝░╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░  ╚═════╝░╚══════╝░╚═════╝░░╚═════╝░╚═╝░░╚═╝░╚════╝░  ╚═╝░░░░

░█████╗░███████╗██╗░█████╗░██╗███╗░░██╗░█████╗░  ░█████╗░███╗░░██╗░░░░░░██╗░░░░░██╗███╗░░██╗███████╗
██╔══██╗██╔════╝██║██╔══██╗██║████╗░██║██╔══██╗  ██╔══██╗████╗░██║░░░░░░██║░░░░░██║████╗░██║██╔════╝
██║░░██║█████╗░░██║██║░░╚═╝██║██╔██╗██║███████║  ██║░░██║██╔██╗██║█████╗██║░░░░░██║██╔██╗██║█████╗░░
██║░░██║██╔══╝░░██║██║░░██╗██║██║╚████║██╔══██║  ██║░░██║██║╚████║╚════╝██║░░░░░██║██║╚████║██╔══╝░░
╚█████╔╝██║░░░░░██║╚█████╔╝██║██║░╚███║██║░░██║  ╚█████╔╝██║░╚███║░░░░░░███████╗██║██║░╚███║███████╗
░╚════╝░╚═╝░░░░░╚═╝░╚════╝░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝  ░╚════╝░╚═╝░░╚══╝░░░░░░╚══════╝╚═╝╚═╝░░╚══╝╚══════╝""")

#########################################################################################################################################

# cria o menu princípal e suas opções

def exibeMenu():
        
    print(colorama.Fore.BLUE +"**************************************** PORTO SEGURO / OFICINA ON-LINE ****************************************"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "1 - CADASTRAR NOVOS CLIENTES")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "2 - CADASTRAR VEICULOS")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "3 - OFICINA ON-LINE / AGENDAMENTOS")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "4 - ORÇAMENTO / PAGAMENTO")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "5 - PESQUISAR OU LISTAR DADOS DE UM CLIENTE")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "0 - SAIR DO SISTEMA")
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*                                                                                                              *"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"****************************************************************************************************************"+ colorama.Style.RESET_ALL)

#########################################################################################################################################

# finaliza a aplicação

def sairDoPrograma():
    print(colorama.Fore.RED + "**************************************** Sair do programa! ****************************************" + colorama.Style.RESET_ALL)
    sys.exit()
#########################################################################################################################################


#########################################################################################################################################

def voltarMenuPrincipal():
    input("\nDigite uma tecla para voltar ao menu: ")
    main()

#########################################################################################################################################

# mensagem de erro quando o usuário digitar algo errado

def opcaoInvalida():
    print(colorama.Fore.RED + "**************************************** OPÇÃO INVÁLIDA ****************************************" + colorama.Style.RESET_ALL)
    voltarMenuPrincipal()

#########################################################################################################################################

# escolhe quais são as opções desejadas no menu princípal

def escolherOpcao():
    try:
        opcao_escolhida = int(input('Escolha uma opção: '))

        if opcao_escolhida == 1: 
            cadastrarNovosClientes()
        elif opcao_escolhida == 2: 
            cadastrarVeiculos()
        elif opcao_escolhida == 3: 
            oficinaAgendamento()
        elif opcao_escolhida == 4: 
            orcamentoPagamento()
        elif opcao_escolhida == 5: 
            listarClientes()
        elif opcao_escolhida == 0: 
            sairDoPrograma()
        else: 
            opcaoInvalida()
    except:
        opcaoInvalida()
    return opcao_escolhida
#########################################################################################################################################

# cadastro de clientes

def cadastrarNovosClientes(cliente):

    os.system('cls')
    
    print(colorama.Fore.BLUE +"**************************************** CADASTRAR NOVOS CLIENTES ****************************************"+colorama.Style.RESET_ALL)
    print("\n")
    print(colorama.Fore.BLUE +"DADOS DO CLIENTE"+ colorama.Style.RESET_ALL)
    cliente = [] # Crie uma lista para armazenar os dados do cliente
    cliente.append(input("NOME...............: "))
    cliente.append(input("DATA DE NASCIMENTO.: "))
    cliente.append(input("PROFISÃO...........: "))
    cliente.append(input("CPF................: "))
    cliente.append(input("NASCIONALIDADE.....: "))
    print("\n")
    print(colorama.Fore.BLUE +"CONTATOS DO CLIENTE"+ colorama.Style.RESET_ALL)
    cliente.append(input("NÚMERO DE TELEFÔNE.: "))
    cliente.append(input("NÚMERO DE CELUAR...: "))
    cliente.append(input("E-MAIL.............: "))
    print("\n")
    print(colorama.Fore.BLUE +"ENDEREÇO DO CLIENTE"+ colorama.Style.RESET_ALL)
    cliente.append(input("LOGRADOURO.........: "))
    cliente.append(input("Número.............: "))
    cliente.append(input("CEP................: "))
    cliente.append(input("ESTADO.............: "))
    cliente.append(input("COMPLEMENTO........: "))

    adicionaCliente.append(cliente)

    print(colorama.Fore.YELLOW +"**************************************** DADOS DO CLIENTE CADASTRADOS COM SUCESSO ****************************************" + colorama.Style.RESET_ALL)
    print("\n")
    print("\n")
    voltarMenuPrincipal()  
    

#########################################################################################################################################

# cadastro de veiculos

def cadastrarVeiculos():
    print(colorama.Fore.BLUE +"**************************************** CADASTRO DE VEICULOS ****************************************"+colorama.Style.RESET_ALL)
    voltarMenuPrincipal()


#########################################################################################################################################

# oficina e agendamento

def oficinaAgendamento():
    print(colorama.Fore.BLUE +"**************************************** OFICINA ON-LINE / AGENDAMENTOSS ****************************************"+colorama.Style.RESET_ALL)
    voltarMenuPrincipal()

#########################################################################################################################################

# orçamento e pagamento

def orcamentoPagamento():
    print(colorama.Fore.BLUE +"**************************************** ORÇAMENTO / PAGAMENTO ****************************************"+colorama.Style.RESET_ALL)
    voltarMenuPrincipal()

#########################################################################################################################################

def listarClientes():
            os.system('cls')
            print(colorama.Fore.YELLOW + "**************************************** LISTA DE CLIENTES ****************************************" + colorama.Style.RESET_ALL)
            if adicionaCliente:
                for i, cliente in enumerate(adicionaCliente):
                    print(f"\nCliente {i+1}:")
                    print(f"  NOME: {cliente[0]}")
                    print(f"  DATA DE NASCIMENTO: {cliente[1]}")
                    # ... (Exiba os outros dados do cliente)
            else:
                print("Nenhum cliente cadastrado.")
            voltarMenuPrincipal()

def voltarMenuPrincipal():

    voltarMenuPrincipal()





def main():
    #os.system('cls')
    exibir_nome_do_programa()
    exibeMenu()
    #sairDoPrograma()
    escolherOpcao()
    #exibirSubtitulo()
    #voltarMenuPrincipal()
    #opcaoInvalida()

if __name__ == '__main__':
    main()

#########################################################################################################################################
