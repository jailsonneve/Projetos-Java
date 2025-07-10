import questoes.AED2025_2B_Prova;
import utils.IO;

public class Main {
    public static void main(String[] args) {
        System.out.println("++ Algoritmos e Estruturas de Dados - Prova Prática 2º Bimestre 2025++");
        // questao1();
        // questao2();
        // questao3();
        // questao4();
        questao5();
    }

    //Questão de Exemplo (Já resolvida)
    // Pergunta ao usuário dois números inteiros e imprime a soma deles.
    public static void questao0(){
        // Variáveis
        int a, b, soma;

        // Entrada
        //Valor A
        IO.imprimir("Valor A");
        a = IO.lerValorInteiro();

        //Expoente (e)
        IO.imprimir("Valor B");
        b = IO.lerValorInteiro();

        //Processamento - chamar AED2025_2B_Prova.calcularPotencia
        soma = AED2025_2B_Prova.somar(a, b);

        //Saída
        IO.imprimir("" + a + "+" + b + " = " + soma);
    }

    public static void questao1(){
        // Variáveis
        int base, expoente, potencia;

        // Entrada
        //Base (b)
        IO.imprimir("Base: ");
        base = IO.lerValorInteiro();

        //Expoente (e)
        IO.imprimir("Expoente: ");
        expoente = IO.lerValorInteiro();

        //Processamento - chamar AED2025_2B_Prova.calcularPotencia
        potencia = AED2025_2B_Prova.calcularPotencia(base, expoente);

        //Saída
        IO.imprimir("" + base + "^" + expoente + " = " + potencia);
    }


    public static void questao2(){
        //Variáveis

        //Entrada

        //Processamento - chamar AED2025_2B_Prova.somarMultiplosIntervalo

        //Saída
    }

    public static void questao3(){
        //Variáveis

        //Entrada

        //Processamento - chamar AED2025_2B_Prova.inverterDigitos

        //Saída

    }

    public static void questao4(){
        //Variáveis

        //Entrada

        // int a  = AED2025_2B_Prova.somarPrimosIntervalo(1, 10);

        //Saída
        // System.out.println(a);
    }

    public static void questao5(){
        //Variáveis

        //Entrada

        int a = AED2025_2B_Prova.obterEnesimoPrimo(5);

        //Saída
        System.out.println(a);
    }
}
