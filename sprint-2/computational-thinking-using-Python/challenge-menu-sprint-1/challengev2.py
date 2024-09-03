#########################################################################################################################################
#
# INSTRUÇÕES DE USO:
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
import colorama

# inicializa o colorama que cria as corers personalizadas nos mesnus e alertas
colorama.init()

# cria o menu princípal e suas opções
while True:
    print(colorama.Fore.BLUE +"**************************************** PORTO SEGURO / OFICINA ON-LINE ****************************************"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "1 - CADASTRAR NOVOS CLIENTES")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "2 - CADASTRAR VEICULOS")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "3 - OFICINA ON-LINE / AGENDAMENTOS")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "4 - ORÇAMENTO / PAGAMENTO")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "5 - PESQUISAR DADOS DE UM CLIENTE")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL, "0 - SAIR DO SISTEMA")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL)
    opcao = input("* DIGITE A OPÇÃO DESEJADA: ")
    print(colorama.Fore.BLUE +"*"+ colorama.Style.RESET_ALL)
    print(colorama.Fore.BLUE +"****************************************************************************************************************"+ colorama.Style.RESET_ALL)

#########################################################################################################################################

# cria a primeiro menu e suas opções
    if(opcao == "1"):
        os.system('cls')
        while True:
            print(colorama.Fore.BLUE +"**************************************** CADASTRAR NOVOS CLIENTES ****************************************"+colorama.Style.RESET_ALL)
            print("\n")
            print("1 - CADASTRAR NOVO CLIENTE")
            print("0 - VOLTAR AO MENU ANTERIOR")
            print("\n")
            opcao = input("DIGITE A OPÇÃO DESEJADA: ")
            
            if(opcao == "1"):
                
                # dadastra os dados do cliente
                print("**************************************** CADASTRAR NOVO CLIENTE ****************************************")
                print("DADOS DO CLIENTE")
                nomeCliente = input("NOME:...............: ")
                dataNascimento = input("DATA DE NASCIMENTO..: ")
                profissaoCliente = input("PROFISSÃO...........: ")
                cpfCliente = input("CPF.................: ")
                nascionalidadeCliente = input("NASCIONALIDADE......: ")
                print("\n")
                print("ENDEREÇO DO CLIENTE")
                ruaCliente = input("RUA.................: ")
                numeroCliente = input("NUMERO..............: ")
                cepCliente = input("CEP.................: ")
                estadoCliente = input("ESTADO..............: ")
                complementoCliente = input("COMPLEMENTO.........: ")

                os.system('cls')
                
                # feito o cadastro desvolve uma mensagem de salvamento e exibe os dados digitados

                print(colorama.Fore.YELLOW +"**************************************** DADOS DO CLIENTE CADASTRADOS COM SUCESSO ****************************************")
                print("\n")
                print("NOME:...............: ",nomeCliente)
                print("DATA DE NASCIMENTO..: ",dataNascimento)
                print("PROFISSÃO...........: ",profissaoCliente)
                print("CPF.................: ",cpfCliente)
                print("NASCIONALIDADE......: ",nascionalidadeCliente)
                print("RUA.................: ",ruaCliente)
                print("NUMERO..............: ",numeroCliente)
                print("CEP.................: ",cepCliente)
                print("ESTADO..............: ",estadoCliente)
                print("COMPLEMENTO.........: ",complementoCliente + colorama.Style.RESET_ALL)
                print("\n")

            elif(opcao == "0"):
                break
            else:
                print(colorama.Fore.RED +"**************************************** OPÇÃO INCORRETA. DIGITE O APÇÃO CORRETA! ****************************************" + colorama.Style.RESET_ALL)

#########################################################################################################################################

    elif(opcao == "2"):
        
        # cria a segundo menu e suas opções
        
        os.system('cls')
        while True:
            print(colorama.Fore.BLUE +"**************************************** CADASTRO DE VEICULOS ****************************************"+colorama.Style.RESET_ALL)
            print("\n")
            print("1 - CADASTRAR NOVO VEICULO")
            print("0 - VOLTAR AO MENU ANTERIOR")
            print("\n")
            opcao = (input("DIGITE A OPÇÃO DESEJADA: "))
            if(opcao == "1"):
                print("**************************************** CADASTRAR NOVO VEICULO ****************************************")
                tipoVeiculo = input("TIPO DE VEICULO.....: ")
                fabricanteVeiculo = input("FABRICANTE..........: ")
                modeloVeiculo = input("MODELO..............: ")
                motorVeiculo = input("MOTOR...............: ")
                corVeciculo = input("COR.................: ")
                anoFabricaaoVeiculo = input("ANO DE FABRICAÇÃO...: ")
                placaVeiculo = input("PLACA...............: ")
                donoVeiculo = input("NOME DO DONO........: ")

                os.system('cls')
                
                # feito o cadastro desvolve uma mensagem de salvamento e exibe os dados digitados

                print(colorama.Fore.YELLOW +"**************************************** DADOS DO VEICULO CADASTRADOS COM SUCESSO ****************************************")
                print("\n")
                print("TIPO DE VEICULO.....: ",tipoVeiculo)
                print("FABRICANTE..........: ",fabricanteVeiculo)
                print("MODELO..............: ",modeloVeiculo)
                print("MOTOR...............: ",motorVeiculo)
                print("COR.................: ",corVeciculo)
                print("ANO DE FABRICAÇÃO...: ",anoFabricaaoVeiculo)
                print("PLACA...............: ",placaVeiculo)
                print("NOME DO DONO........: ",donoVeiculo + colorama.Style.RESET_ALL)
                print("\n")

            elif(opcao == "0"):
                break
            else:
                print(colorama.Fore.RED +" **************************************** OPÇÃO INCORRETA. DIGITE O APÇÃO CORRETA! ****************************************" + colorama.Style.RESET_ALL)

#########################################################################################################################################

    elif(opcao == "3"):
        
        # cria o terceiro menu e suas opções
        
        os.system('cls')
        while True:
            print(colorama.Fore.BLUE +"**************************************** OFICINA ON-LINE / AGENDAMENTOSS ****************************************"+colorama.Style.RESET_ALL)
            print("\n")
            print("1 - INDICAR PROBLEMAS NO VEICULO E FAZER AGENDAMENTO")
            print("0 - VOLTAR AO MENU ANTERIOR")
            print("\n")
            opcao = input("DIGITE A OPÇÃO DESEJADA: ")

            if(opcao == "1"):
                print("**************************************** INDICAR PROBLEMAS NO VEICULO E FAZER AGENDAMENTO ****************************************")
                print("\n")
                print("PROBLEMAS NO VEICULO")
                problemaDescricao = input("DESCRIÇÃO DO PROBLEMA DO VEICULO..: ")
                problemasPartes = input("PARTES AFETADAS.....................: ")
                print("\n")
                print("AGENDAR OFICINA")
                problemaDia = input("DIGITE O DIA DO AGENDAMENTO.............: ")
                problemaMes = input("DIGITE O MÊS DO AGENDAMENTO.............: ")
                problemaAno = input("DIGITE O ANO DE AGENDAMENTO.............: ")
                problemaPeriodo = input("PERÍODO DO DIA (MANHÃ OU TARDE).........: ")
                print(colorama.Fore.RED +"**************************************** ALERTA! A OFICINA ATENDE DAS 8H AS 20H DE SEGUNDA A SÁBADO! ****************************************"+ colorama.Style.RESET_ALL)
                problemaHorario = input("DIGITE O HORÁRIO DE ATENDIMENTO.........: ")
                
                os.system('cls')
                
                # feito o cadastro desvolve uma mensagem de salvamento e exibe os dados digitados

                print(colorama.Fore.YELLOW +"**************************************** PROBLEMAS DO VEÍCULO E AGENDAMENTO REALIZADO COM SUCESSO ****************************************")
                print("\n")
                print("DESCRIÇÃO DO PROBLEMA DO VEICULO............: ",problemaDescricao)
                print("PARTES AFETADAS.............................: ",problemasPartes)
                print("DIA DO AGENDAMENTO..........................: ",problemaDia)
                print("MÊS DO AGENDAMENTO..........................: ",problemaMes)
                print("ANO DE AGENDAMENTO..........................: ",problemaAno)
                print("PERÍODO DO AGENDAMENTO (MANHÃ OU TARDE).....: ",problemaPeriodo)
                print("HORÁRIO DE ATENDIMENTO......................: ",problemaHorario + colorama.Style.RESET_ALL)
                print("\n")

            elif(opcao == "0"):
                break
            else:
                print(colorama.Fore.RED +" ****************************************OPÇÃO INCORRETA. DIGITE O APÇÃO CORRETA! ****************************************" + colorama.Style.RESET_ALL)

#########################################################################################################################################  
    
    elif(opcao == "4"):
        
        # cria o quarto menu e suas opções
        
        os.system('cls')
        while True:
            print(colorama.Fore.BLUE +"**************************************** ORÇAMENTO / PAGAMENTO ****************************************"+colorama.Style.RESET_ALL)
            print("\n")
            print("1 - ORÇAMENTO E PAGAMENTO")
            print("0 - VOLTAR AO MENU ANTERIOR")
            print("\n")
            opcao = input("DIGITE A OPÇÃO DESEJADA: ")

            if(opcao == "1"):
                print("**************************************** ORÇAMENTO / PAGAMENTO ****************************************")
                print("\n")
                print("ORÇAMENTO - PEÇAS")
                pecas1Pagamento = input ("PEÇAS 1.......................: ")
                valor1Peca = float(input("PREÇO (apenas números)........: R$ "))
                pecas2Pagamento = input ("PEÇAS 2.......................: ")
                valor2Peca = float(input("PREÇO (apenas números)........: R$ "))
                pecas3Pagamento = input ("PEÇAS 3.......................: ")
                valor3Peca = float(input("PREÇO (apenas números)........: R$ "))
                maoDeObra = float(input("MÃO DE OBRA (apenas números)..: R$ "))

                # valor total
                total = valor1Peca + valor2Peca + valor3Peca + maoDeObra
                # a vista com 10% de desconto
                total10 = total / 10
                aVista = total - total10
                # crédito com 5% de desconto
                total5 = (total * 5) / 100
                credito = total = total5
                # parcelado em 5x
                parcelado = total / 5
                print("\n")
                print("PAGAMENTO ")
                print("TOTAL....................................: R$",total)
                print("A VISTA (10% DESCONTO)...................: R$",aVista)
                print("NO CRÈDITO (5% DESCONTO).................: R$",credito)
                print("PARCELADO (5X - SEM DESCONTO)............: R$",parcelado, "5x")

                os.system('cls')
                
                # feito o cadastro desvolve uma mensagem de salvamento e exibe os dados digitados

                print(colorama.Fore.YELLOW +"**************************************** ORÇAMENTO / PAGAMENTO REALIZADO COM SUCESSO ****************************************")

                print("ORÇAMENTO - PEÇAS")
                print("PEÇAS 1..................................:",pecas1Pagamento)
                print("PREÇO....................................: R$",valor1Peca)
                print("PEÇAS 2..................................:",pecas2Pagamento)
                print("PREÇO....................................: R$",valor2Peca)
                print("PEÇAS 3..................................:",pecas3Pagamento)
                print("PREÇO....................................: R$",valor3Peca)
                print("MÃO DE OBRA..............................: R$",maoDeObra)
                print("\n")
                print("PAGAMENTO ")
                print("TOTAL....................................: R$",total)
                print("A VISTA (10% DESCONTO)...................: R$",aVista)
                print("NO CRÈDITO (5% DESCONTO).................: R$",credito)
                print("PARCELADO (5X - SEM DESCONTO)............: R$",parcelado, "5x"+ colorama.Style.RESET_ALL)
                print("\n")

            elif(opcao == "0"):
                break
            else:
                print(colorama.Fore.RED +" **************************************** OPÇÃO INCORRETA. DIGITE O APÇÃO CORRETA! ****************************************" + colorama.Style.RESET_ALL)

#########################################################################################################################################  
    elif(opcao == "5"):
        
        # cria o quinto menu e suas opções
        
        os.system('cls')
        while True:
            print(colorama.Fore.BLUE +"**************************************** PESQUISAR DADOS DE UM CLIENTE ****************************************"+colorama.Style.RESET_ALL)
            print("\n")
            print("1 - PESQUISAR DADOS DE UM CLIENTE")
            print("0 - VOLTAR AO MENU ANTERIOR")
            print("\n")
            opcao = input("DIGITE A OPÇÃO DESEJADA: ")

            if(opcao == "1"):
                print("**************************************** PESQUISAR DADOS DE UM CLIENTE ****************************************")
                # faz a pesquisa se o usuário existe ou não no sistema
                while True:
                    
                    print(colorama.Fore.RED + "**************************************** ALERTA! - CLIENTE PREVIAMENTE CADASTRADO PARA TESTE - DIGITE 1 ****************************************"+colorama.Style.RESET_ALL)
                    codigo = input("DIGITE O CÓDIGO DO CLIENTE: ")

                    # criado um cliente qualquer apenas para efeito de funcionamento de exemplo
                    # neste caso como exemplo digite o COD "1" para fazer a pesquisa por cliente cadastrado
                    
                    if (codigo == "1" ):
                        print("\n")
                        print(colorama.Fore.YELLOW + "**************************************** O CLIENTE POSSUI CADASTRO ****************************************")
                        print("\n")
                        print("DADOS DO CLIENTE:")
                        print("NOME:...............: JOÃO MÉVIO")
                        print("DATA DE NASCIMENTO..: 01/01/1978")
                        print("PROFISSÃO...........: PADEIRO")
                        print("CPF.................: 999.999.999.99")
                        print("NASCIONALIDADE......: BRASILEIRO")
                        print("RUA.................: BRAUILIO ANTÓNIO")
                        print("NUMERO..............: 1050")
                        print("CEP.................: 99999-99")
                        print("ESTADO..............: RJ")
                        print("\n")
                        print("COMPLEMENTO.........: CASA")
                        print("DADOS DO VEÍCULO:")
                        print("TIPO DE VEICULO.....: CARRO")
                        print("FABRICANTE..........: GM")
                        print("MODELO..............: OMEGA")
                        print("MOTOR...............: 4.0")
                        print("COR.................: PRETO-ECLIPSE")
                        print("ANO DE FABRICAÇÃO...: 2000")
                        print("PLACA...............: ABCD-586")
                        print("NOME DO DONO........: JOÃO MÉVIO")
                        print("\n")
                        print("PROBLEMAS NO VEÍCULO / AGENDAMENTO")
                        print("DESCRIÇÃO DO PROBLEMA DO VEICULO.........: QUEBRA DE ROD, FURO NO TANQUE DE COMBUSTÍVEL")
                        print("PARTES AFETADAS..........................: RODA DIANTEIRA ESQUERDA E TANQUE DE COMBUSTÍVEL")
                        print("DIA DO AGENDAMENTO.......................: 22")
                        print("MÊS DO AGENDAMENTO.......................: FEVEREIRO")
                        print("ANO DE AGENDAMENTO.......................: 2025")
                        print("PERÍODO DO AGENDAMENTO (MANHÃ OU TARDE)..: TARDE")
                        print("HORÁRIO DE ATENDIMENTO...................: 18H")
                        print("\n")
                        print("ORÇAMENTO - PEÇAS")
                        print("PEÇAS 1..................................: RODA")
                        print("PREÇO....................................: R$ 1.1900")
                        print("PEÇAS 2..................................: TANQUE DE COMBUSTÍVEL")
                        print("PREÇO....................................: R$ 900.00")
                        print("PEÇAS 3..................................: ")
                        print("PREÇO....................................: R$ 0")
                        print("MÃO DE OBRA..............................: R$ 500.00")
                        print("\n")
                        print("PAGAMENTO ")
                        print("TOTAL....................................: R$ 3.300")
                        print("A VISTA (10% DESCONTO)...................: R$ 2.970")
                        print("NO CRÈDITO (5% DESCONTO).................: R$ 3.135")
                        print("PARCELADO (5X - SEM DESCONTO)............: R$ 660.00 5x")
                        print("\n")
                        print("********************************************************************************"+colorama.Style.RESET_ALL)
                    # caso não exista um cadastro volta ao menu inicial para escolher o que fazer
                    else:
                        print("\n")
                        print(colorama.Fore.RED + " **************************************** CLIENTE NÃO CADASTRADO, POR FAVOR DIGITE UM CÓDIGO VÁLIDO! ****************************************"+ colorama.Style.RESET_ALL)
                        print("\n")
                        break
            elif(opcao == "0"):
                break
            else:
                print(colorama.Fore.RED +" **************************************** OPÇÃO INCORRETA. DIGITE O APÇÃO CORRETA! ****************************************" + colorama.Style.RESET_ALL)
        
    elif(opcao == "0"):
        
        # cria uma opção para sair do programa 
        
        os.system('cls')
        print(colorama.Fore.RED + "**************************************** SAIR DO SISTEMA ****************************************"+colorama.Style.RESET_ALL)
        break
    else:
        print(colorama.Fore.RED + " **************************************** OPÇÃO INCORRETA. DIGITE O APÇÃO CORRETA! ****************************************" + colorama.Style.RESET_ALL)


