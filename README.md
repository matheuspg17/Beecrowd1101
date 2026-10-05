# Resolução exercício Beecrowd1101

## Descrição do problema
Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

## Como Funciona
1. O programa inicia com uma variável `controle = 1` e utiliza um laço `for` dinâmico que incrementa esse limite à medida que pares válidos são digitados.
2. Cada linha de entrada é lida e dividida por espaços usando o método `.split(" ")` para extrair os inteiros `num1` e `num2`.
3. Uma estrutura condicional (`if/else`) verifica se algum dos números é menor ou igual a zero:
   - Se for menor ou igual a zero: Altera `controle = 0`, forçando o encerramento do laço na próxima iteração.
   - Se forem válidos: Mantém o loop ativo incrementando `controle++`.
4. Uma segunda condicional define qual valor é o `numeromaior` e qual é o `numeromenor`.
5. Um laço interno `for` percorre o intervalo de `numeromenor` até `numeromaior`, imprimindo cada número lado a lado e acumulando os valores na variável `soma`.
6. Por fim, o programa exibe o total acumulado na mesma linha precedido pelo texto `"Sum="`.