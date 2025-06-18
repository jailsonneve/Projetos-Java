package Teste;
import Aulas.Aula04;

public class TesteAula04 {
    
    public static void main(String[] args) {
        
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        loader.setDefaultAssertionStatus(true);
        
        testeEx01();
    }

    public static void testeEx01(){
        float valor1 = 0, valor2 = 0, saidaEsperada = 0, saidaObtida = 0;
        String textoErro = "--- Saída Incorreta ---";
        try {
            // Teste 01
            valor1 = 5;
            valor2 = 10;
            saidaEsperada = 10;

            saidaObtida = Aula04.maiorNum(valor1, valor2);
            assert saidaEsperada == saidaObtida : textoErro;

            // Teste 02
            valor1 = 6;
            valor2 = 2;
            saidaEsperada = 6;

            saidaObtida = Aula04.maiorNum(valor1, valor2);
            assert saidaEsperada == saidaObtida : textoErro;

            // Teste 03
            valor1 = 7;
            valor2 = 1;
            saidaEsperada = 7;

            saidaObtida = Aula04.maiorNum(valor1, valor2);
            assert saidaEsperada == saidaObtida : textoErro;

            // Teste 04
            valor1 = 7;
            valor2 = 7;
            saidaEsperada = 7;

            saidaObtida = Aula04.maiorNum(valor1, valor2);
            assert saidaEsperada == saidaObtida : textoErro;

        } catch (AssertionError error) {
            System.err.println("Valor 1: " + valor1);
            System.err.println("Valor 2: " + valor2);
            System.err.println("Saida Esperada: " + saidaEsperada);
            System.err.println("Saida Obtida: " + saidaObtida);
            
            System.err.println(error.getMessage());
            System.exit(1);
        }
    }
}
