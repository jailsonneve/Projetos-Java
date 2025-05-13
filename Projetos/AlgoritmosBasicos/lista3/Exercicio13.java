package AlgoritmosBasicos.lista3;
import funcoes.*;

public class Exercicio13 {
    public static void main(String[] args) {
        float peso, altura, imc;
        String classificacao;

        funcoesPrincipais.imprimir("Digite o peso (kg):");
        peso = funcoesPrincipais.lerFloat();

        funcoesPrincipais.imprimir("Digite a altura (m):");
        altura = funcoesPrincipais.lerFloat();

        imc = peso / (altura * altura);

        if (imc <= 0.00185) {
            classificacao = "Abaixo do peso";
        } else if (imc <= 0.00249) {
            classificacao = "Peso ideal";
        } else if (imc <= 0.00299) {
            classificacao = "Peso em excesso";
        } else if (imc <= 0.00349) {
            classificacao = "Obesidade Grau I";
        } else if (imc <= 0.00399) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        funcoesPrincipais.imprimir("IMC: " + imc + " Categoria: " + classificacao);
    }
}
