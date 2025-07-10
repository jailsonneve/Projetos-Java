# AED 2025 2º Bim - Avaliação Prática

## Questão 1 -  Potência

::::::::{exercise}
:label: exex:potencia

(ex:potencia)=
:::::::{card} Cálculo de potência

Implemente uma função chamada `potencia` que recebe dois valores inteiros não negativos `b` e `e`, retornando o valor de $b^e$. **Não utilize** funções, bibliotecas nem operadores que realizem operações de potência.

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
2
```
```c
3
```
::::

::::{card} Saída
```c
8
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
$2^3 = 8$.
::::

<!-- /example -->
::::::

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
5
```
```c
0
```
::::

::::{card} Saída
```c
1
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
Qualquer número elevado a $0$ resulta em $1$.
::::

<!-- /example -->
::::::

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
3
```
```c
4
```
::::

::::{card} Saída
```c
81
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
$3^4 = 81$.
::::

<!-- /example -->
::::::

<!-- /card exercicio -->
:::::::
<!-- /exercise -->
::::::::

## Questão 2 - Soma de múltiplos de X em um intervalo

::::::::{exercise}
:label: exex:soma_multiplos

(ex:soma_multiplos)=
:::::::{card} Somar múltiplos

Crie uma função `somaMultiplosIntervalo` que recebe três valores inteiros `x`,
`a` e `b` e retorna a soma de todos os múltiplos de `x` no intervalo
$[a,b]$, inclusive.

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
3
```
```c
1
```
```c
10
```
::::

::::{card} Saída
```c
18
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
$3+6+9 = 18$.
::::

<!-- /example -->
::::::

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
5
```
```c
1
```
```c
15
```
::::

::::{card} Saída
```c
30
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
$5+10+15 = 30$.
::::

<!-- /example -->
::::::

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
7
```
```c
10
```
```c
35
```
::::

::::{card} Saída
```c
98
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
Múltiplos de $7$ entre $10$ e $35$: $14+21+28+35 = 98$.
::::

<!-- /example -->
::::::

<!-- /card exercicio -->
:::::::
<!-- /exercise -->
::::::::

## Questão 3 - Inverso com dígitos

::::::::{exercise}
:label: exex:inverso_digitos

(ex:inverso_digitos)=
:::::::{card} Inverter dígitos

Desenvolva uma função `inverterDigitos` que recebe um número inteiro positivo e retorna o valor obtido ao inverter a ordem de seus dígitos. Não converta o número para String durante as operações.

::::::{tip} Dica
Perceba que:
```java
int valor = 456, novo_valor;
novo_valor = 456/10 ; //45
novo_valor = 456/100 ; //4
novo_valor = 456/1000 ; //0
```
::::::

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
123
```
::::

::::{card} Saída
```c
321
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
Os dígitos são invertidos.
::::

<!-- /example -->
::::::

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
4500
```
::::

::::{card} Saída
```c
54
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
Zeros à esquerda são descartados após a inversão.
::::

<!-- /example -->
::::::

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
9876
```
::::

::::{card} Saída
```c
6789
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
O número é lido da direita para a esquerda.
::::

<!-- /example -->
::::::

<!-- /card exercicio -->
:::::::
<!-- /exercise -->
::::::::

## Questão 4 - Soma de Números Primos em um intervalo

::::::::{exercise}
:label: exex:primos_intervalo

(ex:primos_intervalo)=
:::::::{card} Soma de Números Primos em um intervalo

Implemente uma função `somarPrimosIntervalo` que recebe dois valores inteiros $a$ e $b$
e retorna a soma de todos os números primos no intervalo $[a, b]$, inclusive. Considere $2$ como sendo o primeiro número primo.

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
1
```
```c
10
```
::::

::::{card} Saída
```c
17
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
Os número primos entre $1$ e $10$ são $2$, $3$, $5$ e $7$. Logo, $2+3+5+7=17$
::::

<!-- /example -->
::::::

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
8
```
```c
12
```
::::

::::{card} Saída
```c
11
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
Dos números de $8$ a $12$, somente $11$ é primo.
::::

<!-- /example -->
::::::

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
20
```
```c
30
```
::::

::::{card} Saída
```c
52
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
Soma dos números primos que estão entre $20$ e $30$.
::::

<!-- /example -->
::::::

<!-- /card exercicio -->
:::::::
<!-- /exercise -->
::::::::

## Questão 5 - Enésimo primo

::::::::{exercise}
:label: exex:enesimo_primo

(ex:enesimo_primo)=
:::::::{card} Obter $n$-ésimo número primo

Desenvolva uma função `enesimoPrimo` que recebe um valor inteiro positivo $n$ e retorna o $n$-ésimo número primo. Considere $2$ como primeiro número primo.

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
1
```
::::

::::{card} Saída
```c
2
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
O primeiro primo é $2$.
::::

<!-- /example -->
::::::

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
5
```
::::

::::{card} Saída
```c
11
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
A sequência de primos começa em $2, 3, 5, 7, 11$. O quinto primo é $11$.
::::

<!-- /example -->
::::::

::::::{prf:example}
:nonumber:
<!-- :class: dropdown -->

:::::{grid} 1 1 2 2
::::{card} Entrada
```c
10
```
::::

::::{card} Saída
```c
29
```
::::

<!-- /grid -->
:::::

::::{card} Explicação
O décimo número primo é $29$.
::::

<!-- /example -->
::::::

<!-- /card exercicio -->
:::::::
<!-- /exercise -->
::::::::


