package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio12 {
    public static void main(String[] args) {
        int idade, contador = 0, menorIdade = 0, maiorIdade = 0;
        float soma_idades = 0;

        while (true) {
            funcoesPrincipais.imprimir("Digite a idade (0 ou menos para sair):");
            idade = funcoesPrincipais.lerInt();

            if (idade <= 0) break;

            soma_idades += idade;
            contador++;

            if (contador == 1) {
                menorIdade = idade;
                maiorIdade = idade;
            } else {
                if (idade < menorIdade) menorIdade = idade;
                if (idade > maiorIdade) maiorIdade = idade;
            }
        }

        if (contador > 0) {
            float media = soma_idades / contador;
            funcoesPrincipais.imprimir("Número de pessoas: " + contador);
            funcoesPrincipais.imprimir("Idade média do grupo: " + media);
            funcoesPrincipais.imprimir("Menor idade: " + menorIdade);
            funcoesPrincipais.imprimir("Maior idade: " + maiorIdade);
        } else {
            funcoesPrincipais.imprimir("Nenhuma idade válida foi inserida.");
        }
    }
}
