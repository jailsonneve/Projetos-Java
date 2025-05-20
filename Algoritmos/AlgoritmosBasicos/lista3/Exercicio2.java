package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio2 {
    public static void main(String[] args) {
        float cotacaoDolar, dolar, reais;

        funcoesPrincipais.imprimir("Digite a cotação do dólar:");
        cotacaoDolar = funcoesPrincipais.lerFloat();

        funcoesPrincipais.imprimir("Digite o valor em dólares:");
        dolar = funcoesPrincipais.lerFloat();

        reais = dolar * cotacaoDolar;

        funcoesPrincipais.imprimir("Valor em Reais: " + reais);
    }
}
