//Data: 25/06/2025
//Conteúdo: Variáveis compostas

/**
 * 
 */

 package Aulas;

 import Utils.IO;
 
 public class Aula07 {
 
     public static void aula() {
         IO.imprimirString("## Aula 07 - VETORES ##");
 
         // Exercício 01
         exemploDeVetores01();
 
     }
 
     /**
      * Exemplo de vetores
      * Descrição do exercício
      */
     public static void exemploDeVetores01() {
         // Variáveis
         int[] idades;
         String[] nomes;
         char[] sexualidade;
         int qtdPessoas = 0;
 
         // Entrada
         IO.imprimirString("Quantas pessoas?");
         qtdPessoas = IO.lerInt();
         idades = new int[qtdPessoas];
         nomes = new String[qtdPessoas];
         sexualidade = new char[qtdPessoas];
 
         // Leitura dos valores
         IO.imprimirString("");
         for (int indice = 0; indice < qtdPessoas; indice++) {
             IO.imprimirString("----------------------" );
             IO.imprimirString("Pessoa " + (indice+1) );
             IO.imprimirString("Nome:");
             nomes[indice] = IO.lerString();
             IO.imprimirString("Idade: ");
             idades [indice] = IO.lerInt();
             IO.imprimirString("Sexo:");
             sexualidade[indice] = IO.lerChar();
         }
 
         
         // Processamento
         // Cálculos realizados
 
         // processar();
 
         // Saída
         for (int indice = 0; indice < qtdPessoas; indice++) {
             
             IO.imprimirString("==========================");
             IO.imprimirString("Nome:" + nomes[indice]);
             IO.imprimirString("Idade:" + idades[indice]);
             IO.imprimirString("Sexualidade:" + sexualidade[indice]);
         }
     }
 
     /**
      * Descrição do método/função
      * 
      * @param param_1 primeiro parâmetro
      * @param param_2 segundo parâmetro
      * @return valor retornado
      */
     public static int processar(int param_1, int param_2) {
 
         return 0;
     }
 
 }