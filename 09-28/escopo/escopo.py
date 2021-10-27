var_global = 'sou global'

lista = [1,2,3,4,6]

lista.append(99)
lista.insert(99, 100)

def func_local(var_global):
    # var_local = 'sou local'    
    var_global = 'sou local'
    # print(var_local)
    print(var_global)

print(var_global)

func_local(var_global)

print(var_global)
# print(var_local)
