# cria o menu princípal e suas opções

import os
import sys
import colorama

#########################################################################################################################################

# inicializa o colorama que cria as corers personalizadas nos mesnus e alertas

colorama.init()

#########################################################################################################################################

def exibeMenu():
        
    print(colorama.Fore.BLUE +"**************************************** PORTO SEGURO / OFICINA ON-LINE ****************************************"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "1 - CADASTRAR NOVOS CLIENTES")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "2 - CADASTRAR VEICULOS")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "3 - OFICINA ON-LINE / AGENDAMENTOS")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "4 - ORÇAMENTO / PAGAMENTO")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "5 - PESQUISAR OU LISTAR DADOS DE UM CLIENTE")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "0 - SAIR DO SISTEMA")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"****************************************************************************************************************"+ colorama.Style.RESET_ALL)
