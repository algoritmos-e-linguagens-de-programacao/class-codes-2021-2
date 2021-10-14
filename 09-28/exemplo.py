# a = 10.0
# b = 'vamos la'
# # b -> [v][a][m][o][s][][l][a]
# # b -> [0][1][2][3][4][5[6][7]
# c = a + b
class Lista:
    """Exemplo de uma classe Lista
    """

    def __init__(self, items):
        self.items = items


    def add(self, item):
        self.items.append(item)

    def insert(self, item, index):
        self.items.insert(index, item)    

    def contains(self, item):
        """Função para verificar se um item existe na lista.

        Args:
            item ([type]): Item que quero saber se existe

        Returns:
            boolean: `True` se existe, `False` se não existe.
        """
        achou = False

        for elem in c:
            if (elem == item):
                achou = True
                break

        return achou        


c = [1, "isso", 5, 32, 27, 81, 16, 33]

lista = Lista(c)

print(lista)

for e in lista.items:
    print(e)

y = int(input('# Qual o n? '))
i = int(input('# Qual o posicao vamos inserir o valor? '))

if not lista.contains(y):
    lista.insert(y, i)

for e in lista.items:
    print(e)