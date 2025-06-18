package Aulas;
import Utils.IO;

public class SimuladoProva {

    public static void ex01(){

        // Entradas
        int num = IO.lerInt("Digite o Número de Linhas: ");
        int quadrado, cubo;
        StringBuilder resultado = new StringBuilder();
        
        
        // Processamento
        IO.imprimirString("1 1 1");
        for (int i = 2; i <= num; i++) {
            quadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i, 3);
            resultado.append(""+i + " " + ""+quadrado + " " + ""+cubo).append("\n");
        }

        // Saida
        IO.imprimirString(resultado.toString());
    }

    public static void ex02(){
        while (true) {
            // Entradas
            int senha = IO.lerInt("Digite a Senha: ");

            // Processamento e Saida
            if (senha == 2002) {
                IO.imprimirString("Acesso Permitido");
                break;
            } else {
                IO.imprimirString("Senha Invalida");
            }
        }
    }

    public static void ex03(){
        
        // Entradas
        int n = IO.lerInt("Digite o Número N: ");

        for (int i = 0; i < n; i++) {
            int num = IO.lerInt("Digite o Número Desejado: ");
            
            // Processamento
            String resultado = NumPerfeitos(num);

            // Saida
            IO.imprimirString(resultado);
        }
    }

    public static String NumPerfeitos(int num){
        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        if (soma == num) {
            return "eh perfeito";
        } else {
            return "nao eh perfeito";
            
        }
    }
}