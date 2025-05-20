package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio12 {
    public static void main(String[] args) {
        int idade;
        String categoria;

        funcoesPrincipais.imprimir("Digite a idade:");
        idade = funcoesPrincipais.lerInt();

        if (idade >= 3 && idade <= 5) {
            categoria = "Infantil A";
        } else if (idade >= 6 && idade <= 9) {
            categoria = "Infantil B";
        } else if (idade >= 10 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18) {
            categoria = "Sênior";
        } else {
            funcoesPrincipais.imprimir("Digite um valor válido");
            return;
        }

        funcoesPrincipais.imprimir("Idade: " + idade + " Categoria: " + categoria);
    }
}
