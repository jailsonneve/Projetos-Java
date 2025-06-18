package Aulas;

import Utils.IO;

public class Aula06 {

    public static void bee1113(){
        // Crescente e Decrescente
        while (true) {
            int num1 = IO.lerInt("Digite os números"); 
            int num2 = IO.lerInt();
            if (num1 == num2) {
                break;
            }
            if (num1 < num2) {
                IO.imprimirString("Crescente");
            } else {
                IO.imprimirString("Decrescente");
            }
        }
    }

    public static void bee1071(){
        // Soma de Impares Consecutivos I
        int num1, num2;
        num1 = IO.lerInt("Digite o Primeiro Número: ");
        num2 = IO.lerInt("Digite o Segundo Número: ");
        int soma = 0;

        if (num2 < num1) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }

        for (int i = num1+1; i < num2; i++) {
            if (i % 2 == 1) {
                soma += i;
            }
        }

        IO.imprimirString("A Soma é: " + soma);
    }
}