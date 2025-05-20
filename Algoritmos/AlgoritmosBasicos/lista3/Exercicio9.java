package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio9 {
    public static void main(String[] args) {
        float baseMaior, baseMenor, altura, areaT;

        funcoesPrincipais.imprimir("Digite a base maior:");
        baseMaior = funcoesPrincipais.lerFloat();

        funcoesPrincipais.imprimir("Digite a base menor:");
        baseMenor = funcoesPrincipais.lerFloat();

        funcoesPrincipais.imprimir("Digite a altura:");
        altura = funcoesPrincipais.lerFloat();

        if (baseMaior <= 0 || baseMenor <= 0 || altura <= 0) {
            funcoesPrincipais.imprimir("Digite um valor válido");
        } else {
            areaT = ((baseMaior + baseMenor) * altura) / 2;
            funcoesPrincipais.imprimir("Área do trapézio: " + areaT);
        }
    }
}
