package AlgoritmosBasicos.lista3;
import funcoes.*;

public class Exercicio13 {
    public static void main(String[] args) {
        double peso, altura, imc;
        String classificacao;

        funcoesPrincipais.imprimir("Digite o peso (kg):");
        peso = funcoesPrincipais.lerDouble();

        funcoesPrincipais.imprimir("Digite a altura (m):");
        altura = funcoesPrincipais.lerDouble();

        // imc = peso / (altura * altura);
        imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso ideal";
        } else if (imc < 30) {
            classificacao = "Peso em excesso";
        } else if (imc < 35) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        funcoesPrincipais.imprimir("IMC: " + imc + " Categoria: " + classificacao);
    }
}
