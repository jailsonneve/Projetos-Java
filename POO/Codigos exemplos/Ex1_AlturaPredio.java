import java.util.Scanner;

public class Ex1_AlturaPredio {

    public static Scanner tecladoScanner = new Scanner(System.in);

    // método que recebe um texto e imprime na tela
    public static void imprimir(String texto){ 
        System.out.println(texto);
    } 

    public static double lerValorReal(){
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static int lerValorInteiro(){
        int valor;
        valor  = tecladoScanner.nextInt();
        return valor;
    }

    public static double calcularAlturaPredio(double alturaAndares, int qntAndares){
        double resultado;
        resultado = alturaAndares * qntAndares;
        return resultado;
    }

    /*
    Algoritmo prédio Elaborar um algoritmo em fluxograma que leia a altura 
    dos andares de um prédio e o número de andares, calcule e imprima a altura 
    do prédio.
    */
    public static void main(String[] args) {
        double alturaAndares;
        int qntAndares;
        double alturaPredio;
        String saida;

        // entrada
        imprimir("Informe a altura dos andares");
        alturaAndares = lerValorReal();

        imprimir("Informe a quantidade de andares");
        qntAndares = lerValorInteiro();

        //processamento 
        alturaPredio = calcularAlturaPredio(alturaAndares, qntAndares);

        //saida
        saida = "A altura do prédio é "+ alturaPredio;
        imprimir(saida);
        
    }
}
