package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio1 {
    public static void main(String[] args) {
        int quantAndar;
        float alturaAndar, alturaPredio;

        funcoesPrincipais.imprimir("Digite a quantidade de andares:");
        quantAndar = funcoesPrincipais.lerInt();

        funcoesPrincipais.imprimir("Digite a altura de um andar:");
        alturaAndar = funcoesPrincipais.lerFloat();

        alturaPredio = quantAndar * alturaAndar;

        funcoesPrincipais.imprimir("Altura do Prédio: " + alturaPredio);
    }
}
