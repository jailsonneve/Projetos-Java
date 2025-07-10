package questoes;

public class AED2025_2B_Prova {

    public static int somar(int a, int b) {
        // Variáveis
        int soma;

        // Processamento
        soma = a + b;

        // Retorno do resultado calculado
        return soma;
    }

    public static int calcularPotencia(int b, int e) {
        // Variáveis
        int resp = 1;

        // Processamento
        // resp = (int) Math.pow(b, e);
        
        for (int i = 0; i < e; i++) {
            resp *= b;
        }

        // Retorno do Retorno Calculado
        return resp;
    }

    public static int somarMultiplosIntervalo(int x, int a, int b) {
        // Variáveis
        int soma = 0;

        // Processamento
        for (int i = a; i <= b; i++) {
            if (i % x == 0) {
                soma += i;
            }
        }

        // Retorno do Retorno Calculado
        return soma;
    }

    public static int inverterDigitos(int n) {
        

        return 0;
    }

    public static int somarPrimosIntervalo(int a, int b) {
        // Variáveis
        int soma = 0;
        
        // Processamento
        for (int i = a; i <= b; i++) {
            if (primo(i)) {
                soma += i;
            }
        }
        
        // Retorno do Retorno Calculado
        return soma;
    }

    public static boolean primo(int num){
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0 && num != 2) {
                    return false; // encontrou divisor, não é primo
                }
            }
            return true; // nenhum divisor encontrado, é primo   
        }
    }

    public static int obterEnesimoPrimo(int n) {
        int count = 0;
        int resp = 1;
        while (count < n) {
            resp++;
            if (primo(resp)) {
                count++;
            }
        }

        return resp;
    }
}
