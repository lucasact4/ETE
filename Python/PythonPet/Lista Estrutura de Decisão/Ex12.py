# 12. Faça um Programa que leia três números e mostre-os em ordem decrescente.
n1 = int(input('Digite o primeiro número: '))
n2 = int(input('Digite o segundo número: '))
n3 = int(input('Digite o terceiro número: '))
if n1 >= n2 and n1 >= n3 and n2 >= n3:
    print(f'A ordem decrescente é {n1} , {n2} e {n3}')
elif n1 >= n2 and n1 >= n3 and n3 >= n2:
    print(f'A ordem decrescente é {n1} , {n3} e {n2}')
elif n2 >= n1 and n2 >= n3 and n1 >= n3:
    print(f'A ordem decrescente é {n2} , {n1} e {n3}')
elif n2 >= n1 and n2 >= n3 and n3 >= n1:
    print(f'A ordem decrescente é {n2} , {n3} e {n1}')
elif n3 >= n1 and n3 >= n2 and n1 >=n2:
    print(f'A ordem decrescente é {n3} , {n1} e {n2}')
elif n3 >= n1 and n3 >= n2 and n2 >= n1:
    print(f'A ordem decrescente é {n3} , {n2} e {n1}')
    