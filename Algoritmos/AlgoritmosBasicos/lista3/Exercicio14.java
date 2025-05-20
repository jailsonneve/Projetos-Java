package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio14 {
    public static void main(String[] args) {
        int idade, tempoTrampo;
        String podeAposentar;

        funcoesPrincipais.imprimir("Digite a idade:");
        idade = funcoesPrincipais.lerInt();

        funcoesPrincipais.imprimir("Digite o tempo de serviço:");
        tempoTrampo = funcoesPrincipais.lerInt();

        if ((idade >= 65 || tempoTrampo >= 30) || (idade >= 60 && tempoTrampo >= 25)) {
            podeAposentar = "sim";
        } else {
            podeAposentar = "não";
        }

        funcoesPrincipais.imprimir("Pode aposentar: " + podeAposentar);
    }
}