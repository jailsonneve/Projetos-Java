package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio3 {
    public static void main(String[] args) {
        float lado1, lado2, lado3;

        funcoesPrincipais.imprimir("Digite o lado 1:");
        lado1 = funcoesPrincipais.lerFloat();
        funcoesPrincipais.imprimir("Digite o lado 2:");
        lado2 = funcoesPrincipais.lerFloat();
        funcoesPrincipais.imprimir("Digite o lado 3:");
        lado3 = funcoesPrincipais.lerFloat();

        if (lado1 == lado2 && lado2 == lado3) {
            funcoesPrincipais.imprimir("É um triângulo: Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            funcoesPrincipais.imprimir("É um triângulo: Isósceles");
        } else {
            funcoesPrincipais.imprimir("É um triângulo: Escaleno");
        }
    }
}
