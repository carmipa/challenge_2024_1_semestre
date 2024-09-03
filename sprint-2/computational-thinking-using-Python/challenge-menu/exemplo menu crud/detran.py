def menu():
    print("\nDETRAN\n")
    print("1 - INCLUI \n2 - Lista \n 3 - Sai4")
    opcao = input("Seleciona: ")
    return opcao

def incluiVeiculo(lista):
    lista.append(input("Modelo: "))
    lista.append(input("Marca: "))
    lista.append(input("versão: "))
    lista.append(int(input("ano: ")))
    lista.append(int(input("Placa: ")))

def listaVeiculo(lista):
    i = 0
    while i < len(lista):
        print(f"{i}) {lista[i]} {lista[i+4]}")
        i = i + 5
        j = j + 1

def submenu():
    print("1 - Altera \n2 - Exclui \n 3 - Faz nada")
    opcao = input("Seleciona: ")
    return opcao

def exclui(lista, pos, acao):
    ind = (pos -1) * 5
    if acao == 2:
        for x in range(5):
            lista.pop(ind)

def alteraCarro(lista, ind):
    mod = input(f"modelo ({lista[ind]}): ")
    if len(mod) > 0:
        lista[ind] = mod
    
    mar = input(f"modelo ({lista[ind + 1]}): ")
    if len(mar) > 0:
        lista[ind+1] = mar
        
    ver = input(f"modelo ({lista[ind + 2]}): ")
    if len(ver) > 0:
        lista[ind+2] = ver

    ano = input(f"modelo ({lista[ind + 3]}): ")
    if len(ano) > 0:
        lista[ind+3] = int(ano)

    pl = input(f"modelo ({lista[ind + 4]}): ")
    if len(pl) > 0:
        lista[ind+4] = pl

op = menu()
carros = []

while op != 3:
    if op == 1:
        print("Incluir Veiculo")
        incluiVeiculo(carros)
    elif op == 2:
        print("lista veículo")
        listaVeiculo(carros)
        pos = int(input("Selecione o carro: "))
        acao = submenu()
        exclui(carros, pos, acao)
    else: 
        print("Opção inválida")