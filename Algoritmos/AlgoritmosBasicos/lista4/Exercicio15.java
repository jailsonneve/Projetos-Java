package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio15 {
    public static void main(String[] args) {
        int contTecnico = 0, contSuperior = 0, contIdade18_35 = 0;

        while (true) {
            funcoesPrincipais.imprimir("Digite a idade (0 ou menos para sair):");
            int idade = funcoesPrincipais.lerInt();

            if (idade <= 0) break;

            funcoesPrincipais.imprimir("Digite o nível de ensino (T para técnico, S para superior):");
            char ensino = funcoesPrincipais.lerChar();

            if (ensino == 'T' || ensino == 't') {
                contTecnico++;
            } else if (ensino == 'S' || ensino == 's') {
                contSuperior++;
            }

            if (idade >= 18 && idade <= 35) {
                contIdade18_35++;
            }
        }

        funcoesPrincipais.imprimir("Total do ensino técnico: " + contTecnico);
        funcoesPrincipais.imprimir("Total do ensino superior: " + contSuperior);
        funcoesPrincipais.imprimir("Total com idade entre 18 e 35 anos: " + contIdade18_35);
    }
}
