package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio4 {
    public static void main(String[] args) {
        float distanciaP, combustivelG, consumoM;

        funcoesPrincipais.imprimir("Digite a distância percorrida (km):");
        distanciaP = funcoesPrincipais.lerFloat();

        funcoesPrincipais.imprimir("Digite o total de combustível gasto (litros):");
        combustivelG = funcoesPrincipais.lerFloat();

        consumoM = distanciaP / combustivelG;

        funcoesPrincipais.imprimir("Consumo médio: " + consumoM + " km/l");
    }
}
