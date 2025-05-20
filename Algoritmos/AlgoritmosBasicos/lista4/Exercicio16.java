package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio16 {
    public static void main(String[] args) {
        int votosCand1 = 0, votosCand2 = 0, totalVotos = 0;

        while (totalVotos < 305) {
            funcoesPrincipais.imprimir("Digite o voto (1 ou 2):");
            int voto = funcoesPrincipais.lerInt();

            if (voto == 1) {
                votosCand1++;
                totalVotos++;
            } else if (voto == 2) {
                votosCand2++;
                totalVotos++;
            } else {
                funcoesPrincipais.imprimir("Valor Inválido!");
            }
        }

        funcoesPrincipais.imprimir("Total de votos para o Candidato 1: " + votosCand1);
        funcoesPrincipais.imprimir("Total de votos para o Candidato 2: " + votosCand2);

        if (votosCand1 > votosCand2) {
            funcoesPrincipais.imprimir("Candidato 1 é o vencedor!");
        } else if (votosCand2 > votosCand1) {
            funcoesPrincipais.imprimir("Candidato 2 é o vencedor!");
        } else {
            funcoesPrincipais.imprimir("Empate!");
        }
    }
}
