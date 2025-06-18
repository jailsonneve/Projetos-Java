package Aulas;
import Utils.IO;

public class Aula04 {
    public static float maiorNum( float num1, float num2 ){
        float maiorNum = 0;
        if (num1 > num2) {
            maiorNum = num1;
        }
        else if (num2 > num1) {
            maiorNum = num2;
        }
        return maiorNum;
    }

    public static void ex01(){
        // Entrada
        float num1 = IO.lerFloat();
        float num2 = IO.lerFloat();

        // Processamento           
        float resp = maiorNum(num1, num2);

        // Saida
        if (resp == 0) {
            IO.imprimirString("Os Números são Iguais !!");
        } else {
            IO.imprimirString("O Maior Número é: " + resp);
        }
    }
}
