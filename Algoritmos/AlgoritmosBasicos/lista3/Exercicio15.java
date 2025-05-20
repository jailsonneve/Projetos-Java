package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio15 {
    public static void main(String[] args) {
        int ano;
        String bissexto = "não";

        funcoesPrincipais.imprimir("Digite um ano:");
        ano = funcoesPrincipais.lerInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            bissexto = "sim";
        }

        funcoesPrincipais.imprimir("É bissexto: " + bissexto);
    }
}

