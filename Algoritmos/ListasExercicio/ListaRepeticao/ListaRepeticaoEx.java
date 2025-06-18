package ListasExercicio.ListaRepeticao;

import Utils.IO;

public class ListaRepeticaoEx {
    
    public static void ex01(){
        // Entrada
        int inicio = 10;
        int fim = 200;

        // Processamento e Saída
        for (int i = inicio; i <= fim; i++) {
            IO.imprimirString("Número: " + i);
        }
    }

    public static void ex02(){
        // Entrada
        int inicio = 200;
        int fim = 1;

        // Processamento e Saída
        for (int i = inicio; i >= fim; i--) {
            IO.imprimirString("Número: " + i);
        }
    }

    public static void ex03(){
        // Entrada
        int fim = IO.lerInt();
        
        // Processamento e Saída
        for (int i = 1; i <= fim; i++) {
            IO.imprimirString("Número: " + i);
        }
    }

    public static void ex04(){
        // Entrada
        int inicio = IO.lerInt();

        // Processamento e Saída
        for (int i = inicio; i >= 1; i--) {
            IO.imprimirString("Número: " + i);
        }
    }

    public static void ex05(){
        // Entrada
        int inicio = IO.lerInt();
        int fim = IO.lerInt();

        // Processamento e Saída
        for (int i = inicio; i <= fim; i++) {
            IO.imprimirString("Número: " + i);
        }
    }

    public static void ex06(){
        // Entrada
        int inicio = IO.lerInt();
        int fim = IO.lerInt();

        // Processamento
        if (inicio > fim) {
            int aux = inicio;
            inicio = fim;
            fim = aux;
        }

        int soma = somaValores(inicio, fim);

        // Saída
        IO.imprimirString("A soma dos valores de " + inicio + " a " + fim + " é: " + soma);
    }

    public static void ex07(){
        // Entrada
        int inicio = IO.lerInt();
        int fim = IO.lerInt();

        // Processamento
        if (inicio > fim) {
            int aux = inicio;
            inicio = fim;
            fim = aux;
        }

        int soma = somaPares(inicio, fim);

        // Saída
        IO.imprimirString("A soma dos números pares de " + inicio + " a " + fim + " é: " + soma);
    }

    public static void ex08(){
        // Entrada
        int inicio = IO.lerInt();
        int fim = IO.lerInt();

        // Processamento
        if (inicio > fim) {
            for (int i = inicio; i >= fim; i--) {
                IO.imprimirString("Número: " + i);
            }
        }else{
            for (int i = inicio; i <= fim; i++) {
                IO.imprimirString("Número: " + i);
            }
        }
    }

    public static void ex09(){
        // Entrada
        int maior = 0;
        int menor = 0;
        int valorLido = 0;
        boolean valores = false;

        // Processamento
        for (int i = 0; i < 5; i++) {
            valorLido = IO.lerInt("Digite o " + (i + 1) + "º valor: ");
            if (i == 0) {
                maior = valorLido;
                menor = valorLido;
                valores = true;
            } else {
                if (valorLido > maior) {
                    maior = valorLido;
                }
                if (valorLido < menor) {
                    menor = valorLido;
                }
            }
        }

        // Saída
        if (valores) {
            IO.imprimirString("O maior valor lido foi: " + maior);
            IO.imprimirString("O menor valor lido foi: " + menor);
        } else {
            IO.imprimirString("Nenhum valor foi lido.");
        }
    }

    public static void ex10(){
        // Entrada
        int num = IO.lerInt("Digite o número de testes: ");
        int contMaior = 0;
        int contMenor = 0;
        
        // Processamento
        for (int i = 0; i < num; i++) {
            int numero = IO.lerInt("Digite o número " + (i + 1) + ": ");
            if (numero > 0) {
                contMaior++;
            }
            if (numero < 0) {
                contMenor++;
            }
        }

        // Saída
        IO.imprimirString("Quantidade de números maiores que zero: " + contMaior);
        IO.imprimirString("Quantidade de números menores que zero: " + contMenor);
    }

    public static void ex11(){
        // Entrada
        int num = IO.lerInt("Digite o número de testes: ");
        int contPar = 0;
        int contImpar = 0;

        // Processamento
        for (int i = 0; i < num; i++) {
            int numero = IO.lerInt("Digite o número " + (i + 1) + ": ");
            if (numero % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        // Saída
        IO.imprimirString("Quantidade de números pares: " + contPar);
        IO.imprimirString("Quantidade de números ímpares: " + contImpar);
    }

    public static void ex12() {
        // Entrada
        int num = IO.lerInt("Digite o número de testes: ");
        int contIntervalo0_25 = 0;
        int contIntervalo26_50 = 0;
        int contIntervaloMaior50 = 0;

        // Processamento
        for (int i = 0; i < num; i++) {
            int numero = IO.lerInt("Digite o número " + (i + 1) + ": ");
            if (numero >= 0 && numero <= 25) {
                contIntervalo0_25++;
            } else if (numero >= 26 && numero <= 50) {
                contIntervalo26_50++;
            } else if (numero > 50) {
                contIntervaloMaior50++;
            }
        }

        // Saída
        IO.imprimirString("Quantidade de números no intervalo [0, 25]: " + contIntervalo0_25);
        IO.imprimirString("Quantidade de números no intervalo [26, 50]: " + contIntervalo26_50);
        IO.imprimirString("Quantidade de números maiores que 50: " + contIntervaloMaior50);
    }

    public static void ex13(){
        // Entrada
        while (true) {
            int num = IO.lerInt("Digite o número: ");

            // Processamento e Saída
            if (num <= 0 || num >= 1001) {
                IO.imprimirString("Saindo.....");
                break;
            } else if (num % 7 == 0) {
                    IO.imprimirString("O Número: " + num + " é Múltiplo de 7");
            } else {
                IO.imprimirString("O Número: " + num + " NÃO é Múltiplo de 7");
            }
        }
    }

    public static void ex14(){
        
        // Entrada
        int idade;
        int totalPessoas = 0;
        int somaIdades = 0;
        int menorIdade = 0;
        int maiorIdade = 0;
        while (true) {
            idade = IO.lerInt("Digite a idade (ou um valor <= 0 para sair): ");

            // Processamento
            if (idade <= 0) {
                break;
            }
            totalPessoas++;
            somaIdades += idade;
            menorIdade = idade;

            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
        }            
        
        // Saida
        double mediaIdades = somaIdades / totalPessoas;
        IO.imprimirString("Número total de pessoas válidas: " + totalPessoas);
        IO.imprimirString("Idade média do grupo: " + mediaIdades);
        IO.imprimirString("Menor idade informada: " + menorIdade);
        IO.imprimirString("Maior idade informada: " + maiorIdade);
    }

    public static void ex15(){

        // Entrada
        int idade;
        char tipoEnsino;
        int totalTecnico = 0;
        int totalSuperior = 0;
        int totalIdade18_35 = 0;
        while (true) {
            idade = IO.lerInt("Digite a idade (ou 0 para sair) / Tipo de ensino (T para Técnico, S para Superior): ");
            tipoEnsino = IO.lerChar();
            
            if (idade == 0) {
                break;
            }

            // Processamento
            if (tipoEnsino == 'T' || tipoEnsino == 't') {
                totalTecnico++;
            } else if (tipoEnsino == 'S' || tipoEnsino == 's') {
                totalSuperior++;
            }

            if (idade >= 18 && idade <= 35) {
                totalIdade18_35++;
            }
        }
        // Saída
        IO.imprimirString("Total de indivíduos do ensino Técnico: " + totalTecnico);
        IO.imprimirString("Total de indivíduos do ensino Superior: " + totalSuperior);
        IO.imprimirString("Total de indivíduos com idade entre 18 e 35 anos: " + totalIdade18_35);
    }

    public static void ex16() {
        
        // Entrada
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosValidos = 0;

        // Processamento
        while (votosValidos < 152) {
            int voto = IO.lerInt("Digite o código do candidato (1 ou 2): ");
            if (voto == 1) {
                votosCandidato1++;
                votosValidos++;
            } else if (voto == 2) {
                votosCandidato2++;
                votosValidos++;
            } else {
                IO.imprimirString("Voto inválido. Por favor, digite 1 ou 2.");
            }
        }

        // Saída
        IO.imprimirString("Total de votos para o Candidato 1: " + votosCandidato1);
        IO.imprimirString("Total de votos para o Candidato 2: " + votosCandidato2);
        if (votosCandidato1 > votosCandidato2) {
            IO.imprimirString("O Candidato 1 é o vencedor da eleição.");
        } else if (votosCandidato2 > votosCandidato1) {
            IO.imprimirString("O Candidato 2 é o vencedor da eleição.");
        } else {
            IO.imprimirString("Houve um empate entre os candidatos.");
        }
    }

    public static void ex17() {

        // Entrada
        int numero = IO.lerInt("Digite um número para ver sua tabuada: ");
        int limite = 20;

        // StringBuilder para armazenar a tabuada
        StringBuilder tabuada = new StringBuilder();
        tabuada.append("Tabuada do ").append(numero).append(":\n");
        
        // Processamento
        for (int i = 1; i <= limite; i++) {
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }

        // Saída
        IO.imprimirString(tabuada.toString());
    }

    public static void ex18() {

        // Entrada
        int x = IO.lerInt("Digite um número para verificar os divisíveis de 1 a 100: ");
        StringBuilder divisiveis = new StringBuilder();
        divisiveis.append("Números de 1 a 100 divisíveis por ").append(x).append(":\n");
        
        // Processamento
        for (int i = 1; i <= 100; i++) {
            if (i % x == 0) {
                divisiveis.append(i).append("\n");
            }
        }
        
        // Saída
        IO.imprimirString(divisiveis.toString());
    }

    public static void ex19(){

        // Entrada
        int numero = IO.lerInt("Digite um número para calcular o fatorial: ");
        long fatorial = 1;
        
        // Processamento
        if (numero < 0) {
            IO.imprimirString("Fatorial não definido para números negativos.");
            return;
        }
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        // Saída
        IO.imprimirString("O fatorial de " + numero + " é: " + fatorial);
    }

    public static void ex20(){

        // Entrada
        StringBuilder numeros = new StringBuilder();
        numeros.append("Números entre 500 e 2000 que, quando divididos por 11, possuem resto igual a 5:\n");
        
        // Processamento
        for (int i = 501; i < 2000; i++) {
            if (i % 11 == 5) {  
                numeros.append(i).append("\n");
            }
        }
        
        // Saída
        IO.imprimirString(numeros.toString());
    }

    public static void ex21(){

        // Entrada
        int numero = IO.lerInt("Digite um número para ver seus divisores: ");
        StringBuilder divisores = new StringBuilder();
        divisores.append("Divisores de ").append(numero).append(" que são menores que ele:\n");
        
        // Processamento
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                divisores.append(i).append("\n");
            }
        }
        
        // Saída
        if (divisores.length() > 0) {
            IO.imprimirString(divisores.toString());
        } else {
            IO.imprimirString("Não há divisores menores que " + numero);
        }
    }

    public static void ex22(){

        // Entrada
        int n = IO.lerInt("Digite o valor de n: ");
        int soma = 0;
        int contador = 0;
        StringBuilder resultado = new StringBuilder();
        resultado.append("Soma e média dos primeiros ").append(n).append(" números:\n");
        if (n <= 0) {
            IO.imprimirString("O valor de n deve ser maior que zero.");
            return;
        }
        
        // Processamento
        for (int i = 1; i <= n; i++) {
            soma += i;
            contador++;
        }
        double media = soma / contador;
        
        // Saída
        resultado.append("Soma: ").append(soma).append("\n");
        resultado.append("Média: ").append(media).append("\n");
        IO.imprimirString(resultado.toString());
    }

    public static void ex23() {

        // Entrada
        int num = IO.lerInt("Digite o número: ");

        // Processamento
        String resultado = NumPerfeitos(num);
        
        // Saída
        IO.imprimirString("O número " + num + " é perfeito? " + resultado);

    }

    

    /* Função Ex23 */
    public static String NumPerfeitos(int num){
        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        if (soma == num) {
            return "Verdadeiro.";
        } else {
            return "Falso.";
            
        }
    }

    /* Funções Ex07 */
    public static int somaPares(int inicio, int fim) {
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        return soma;
    }
    
    /* Funções Ex06 */
    public static int somaValores(int inicio, int fim) {
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }
        return soma;
    }
}
