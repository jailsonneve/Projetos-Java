import questoes.AED2025_2B_Prova;

public class Test {
    public static void main(String[] args) {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        loader.setDefaultAssertionStatus(true);

        AssertExample teste = new AssertExample();

        if(args[0].equals("somar")){
            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);
            int r = Integer.parseInt(args[3]);
            teste.somar(a, b, r, args);
            return;
        }

        if(args[0].equals("calcularPotencia")){
            int b = Integer.parseInt(args[1]);
            int e = Integer.parseInt(args[2]);
            int r = Integer.parseInt(args[3]);
            teste.calcularPotencia(b, e, r, args);
            return;
        }

        if(args[0].equals("somarMultiplosIntervalo")){
            int x = Integer.parseInt(args[1]);
            int a = Integer.parseInt(args[2]);
            int bVal = Integer.parseInt(args[3]);
            int r = Integer.parseInt(args[4]);
            teste.somarMultiplosIntervalo(x, a, bVal, r, args);
            return;
        }

        if(args[0].equals("inverterDigitos")){
            int n = Integer.parseInt(args[1]);
            int r = Integer.parseInt(args[2]);
            teste.inverterDigitos(n, r, args);
            return;
        }

        if(args[0].equals("somarPrimosIntervalo")){
            int a = Integer.parseInt(args[1]);
            int bVal = Integer.parseInt(args[2]);
            int r = Integer.parseInt(args[3]);
            teste.somarPrimosIntervalo(a, bVal, r, args);
            return;
        }

        if(args[0].equals("obterEnesimoPrimo")){
            int n = Integer.parseInt(args[1]);
            int r = Integer.parseInt(args[2]);
            teste.obterEnesimoPrimo(n, r, args);
            return;
        }

        System.err.println(args[0] + ": Funcao desconhecida.");
    }
}

class AssertExample {
    String retorno_str;

    public void somar(int a, int b, int r, String[] args){
        try {
            int retorno = AED2025_2B_Prova.somar(a, b);
            retorno_str = ""+retorno;
            assert retorno == r : "Retorno incorreto";
        } catch (AssertionError err) {
            System.err.println(err.getMessage());
            printParams(args, retorno_str);
            System.exit(1);
        }
    }

    public void calcularPotencia(int b, int e, int r, String[] args){
        try {
            int retorno = AED2025_2B_Prova.calcularPotencia(b, e);
            retorno_str = ""+retorno;
            assert retorno == r : "Retorno incorreto";
        } catch (AssertionError err) {
            System.err.println(err.getMessage());
            printParams(args, retorno_str);
            System.exit(1);
        }
    }

    public void somarMultiplosIntervalo(int x, int a, int bVal, int r, String[] args){
        try {
            int retorno = AED2025_2B_Prova.somarMultiplosIntervalo(x, a, bVal);
            retorno_str = ""+retorno;
            assert retorno == r : "Retorno incorreto";
        } catch (AssertionError err) {
            System.err.println(err.getMessage());
            printParams(args, retorno_str);
            System.exit(1);
        }
    }

    public void inverterDigitos(int n, int r, String[] args){
        try {
            int retorno = AED2025_2B_Prova.inverterDigitos(n);
            retorno_str = ""+retorno;
            assert retorno == r : "Retorno incorreto";
        } catch (AssertionError err) {
            System.err.println(err.getMessage());
            printParams(args, retorno_str);
            System.exit(1);
        }
    }

    public void somarPrimosIntervalo(int a, int bVal, int r, String[] args){
        try {
            int retorno = AED2025_2B_Prova.somarPrimosIntervalo(a, bVal);
            retorno_str = ""+retorno;
            assert retorno == r : "Retorno incorreto";
        } catch (AssertionError err) {
            System.err.println(err.getMessage());
            printParams(args, retorno_str);
            System.exit(1);
        }
    }

    public void obterEnesimoPrimo(int n, int r, String[] args){
        try {
            int retorno = AED2025_2B_Prova.obterEnesimoPrimo(n);
            retorno_str = ""+retorno;
            assert retorno == r : "Retorno incorreto";
        } catch (AssertionError err) {
            System.err.println(err.getMessage());
            printParams(args, retorno_str);
            System.exit(1);
        }
    }

    public void printParams(String[] args, String r){
        int i;
        System.err.println(args[0]);
        System.err.println("Entradas:");
        for(i=1; i<args.length-1; i++){
            System.err.println("\t" + args[i]);
        }
        System.err.println("Retornou:");
        System.err.println("\t"+r);
        System.err.println("Esperado: ");
        System.err.println("\t"+args[args.length-1]);
        System.err.println();
    }
}
