package Avaliacoes.provas.Rec2A;
import Utils.IO;

public class Q1 {
    public static void somarPrimosIntervalo() {
        // Variáveis
        int inicio = IO.lerInt("Digite o Valor Inicial do Intervalo: ");
        int fim = IO.lerInt("Digite o Valor Final do Intervalo: ");
        int soma = 0;
        
        // Processamento
        for (int i = inicio; i <= fim; i++) {
            if (primo(i)) {
                soma += i;
            }
        }

        // Saída
        IO.imprimirString("A Soma dos Números Primos é: " + soma);
    }

    public static boolean primo(int num){
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
