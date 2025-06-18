package Aulas;

import Utils.IO;

public class Aula07 {

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
}