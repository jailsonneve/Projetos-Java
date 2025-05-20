package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio10 {
    public static void main(String[] args) {
        int idade;
        String classeEleitoral;

        funcoesPrincipais.imprimir("Digite a sua idade:");
        idade = funcoesPrincipais.lerInt();

        if (idade < 16) {
            classeEleitoral = "não eleitor";
        } else if (idade >= 18 && idade < 65) {
            classeEleitoral = "eleitor obrigatório";
        } else {
            classeEleitoral = "eleitor facultativo";
        }

        funcoesPrincipais.imprimir("Sua classe eleitoral: " + classeEleitoral);
    }
}
