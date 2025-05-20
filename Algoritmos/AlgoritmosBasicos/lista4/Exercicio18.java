package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio18 {
    public static void main(String[] args) {
        funcoesPrincipais.imprimir("Digite a massa inicial (em gramas):");
        float massaInicial = funcoesPrincipais.lerFloat();
        float massaAtual = massaInicial;
        int tempo = 0;

        while (massaAtual >= 0.05) {
            massaAtual /= 2;
            tempo += 60;
        }

        funcoesPrincipais.imprimir("Tempo necessário: " + tempo + " segundos");
    }
}
