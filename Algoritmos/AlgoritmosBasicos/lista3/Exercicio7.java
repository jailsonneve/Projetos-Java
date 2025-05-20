package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio7 {
    public static void main(String[] args) {
        int valor1, valor2, valor3, maior;

        funcoesPrincipais.imprimir("Digite o primeiro valor:");
        valor1 = funcoesPrincipais.lerInt();
        funcoesPrincipais.imprimir("Digite o segundo valor:");
        valor2 = funcoesPrincipais.lerInt();
        funcoesPrincipais.imprimir("Digite o terceiro valor:");
        valor3 = funcoesPrincipais.lerInt();

        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else if (valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }

        funcoesPrincipais.imprimir("O maior número é: " + maior);
    }
}
