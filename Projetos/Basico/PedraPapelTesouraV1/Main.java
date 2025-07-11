// Importações
import java.io.Console; // Importa a classe Console para entrada oculta
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void Menu() {
        System.out.println("---------------------------");
        System.out.println("-- PEDRA PAPEL E TESOURA --");
        System.out.println("---------------------------");
        System.out.println("1- Pedra");
        System.out.println("2- Papel");
        System.out.println("3- Tesoura");
        System.out.println("4- Sair do Jogo");
    }

    public static void jogarPedraPapelTesoura(String nomeJogador1, String nomeJogador2) {
        Console console = System.console();

        if (console == null) {
            System.err.println("------------------------------------------------------------------");
            System.err.println("ATENÇÃO: Não foi possível acessar o console para ocultar a entrada.");
            System.err.println("Isso geralmente acontece ao executar em algumas IDEs.");
            System.err.println("A entrada dos jogadores ficará VISÍVEL. Joguem com honestidade!");
            System.err.println("------------------------------------------------------------------");
            // Chama a versão com Scanner se o console não estiver disponível
            jogarPedraPapelTesouraComScanner(nomeJogador1, nomeJogador2);
            return;
        }

        int escolhaJogador1 = 0;
        int escolhaJogador2 = 0;

        Menu(); // Mostra o menu antes de cada jogador escolher

        // Jogador 1 escolhe
        boolean escolhaValida1 = false;
        while (!escolhaValida1) {
            System.out.print(nomeJogador1 + ", digite sua escolha (1-4): ");
            // readPassword retorna um char[], então convertemos para String e depois para int
            char[] inputChars = console.readPassword();
            String inputStr = (inputChars != null) ? new String(inputChars).trim() : "";

            try {
                escolhaJogador1 = Integer.parseInt(inputStr);
                if (escolhaJogador1 >= 1 && escolhaJogador1 <= 3) {
                    escolhaValida1 = true;
                } else if (escolhaJogador1 == 4) {
                    System.out.println("Saindo do jogo...");
                    return; // Sai da função se escolher 4
                } else {
                    System.out.println("Escolha inválida. Por favor, digite 1, 2, 3 ou 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            }
        }

        // Adiciona uma pausa e "limpa" a tela para o próximo jogador
        System.out.println("\n-----------------------------------------------------");
        System.out.println(nomeJogador2 + ", pressione Enter para fazer sua escolha...");
        new Scanner(System.in).nextLine(); // Espera o Enter
        clearScreen(); // Tenta limpar a tela (pode não funcionar em todas as plataformas)

        Menu(); // Mostra o menu novamente para o segundo jogador

        // Jogador 2 escolhe
        boolean escolhaValida2 = false;
        while (!escolhaValida2) {
            System.out.print(nomeJogador2 + ", digite sua escolha (1-4): ");
            char[] inputChars = console.readPassword();
            String inputStr = (inputChars != null) ? new String(inputChars).trim() : "";

            try {
                escolhaJogador2 = Integer.parseInt(inputStr);
                if (escolhaJogador2 >= 1 && escolhaJogador2 <= 3) {
                    escolhaValida2 = true;
                } else if (escolhaJogador2 == 4) {
                    System.out.println("Saindo do jogo...");
                    return; // Sai da função se escolher 4
                } else {
                    System.out.println("Escolha inválida. Por favor, digite 1, 2, 3 ou 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            }
        }

        System.out.println("\n--- REVELANDO AS ESCOLHAS ---");
        System.out.println(nomeJogador1 + " escolheu: " + converterEscolha(escolhaJogador1));
        System.out.println(nomeJogador2 + " escolheu: " + converterEscolha(escolhaJogador2));

        determinarVencedor(escolhaJogador1, escolhaJogador2, nomeJogador1, nomeJogador2);
    }

    // --- Métodos Auxiliares ---

    // Este método é um fallback caso System.console() não funcione
    public static void jogarPedraPapelTesouraComScanner(String nomeJogador1, String nomeJogador2) {
        Scanner scanner = new Scanner(System.in); // Scanner local para este método
        int escolhaJogador1 = 0;
        int escolhaJogador2 = 0;

        Menu();

        // Jogador 1
        boolean escolhaValida1 = false;
        while (!escolhaValida1) {
            System.out.print(nomeJogador1 + ", digite sua escolha (1-4): ");
            try {
                escolhaJogador1 = scanner.nextInt();
                if (escolhaJogador1 >= 1 && escolhaJogador1 <= 3) {
                    escolhaValida1 = true;
                } else if (escolhaJogador1 == 4) {
                    System.out.println("Saindo do jogo...");
                    return;
                } else {
                    System.out.println("Escolha inválida. Por favor, digite 1, 2, 3 ou 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Consome a entrada inválida para evitar loop infinito
            }
        }
        clearScreen(); // Limpa a tela após a escolha do Jogador 1

        System.out.println("\n-----------------------------------------------------");
        System.out.println(nomeJogador2 + ", pressione Enter para fazer sua escolha...");
        scanner.nextLine(); // Consome a quebra de linha pendente após nextInt()
        scanner.nextLine(); // Espera o Enter para o Jogador 2
        clearScreen(); // Limpa a tela novamente antes do Jogador 2

        Menu();

        // Jogador 2
        boolean escolhaValida2 = false;
        while (!escolhaValida2) {
            System.out.print(nomeJogador2 + ", digite sua escolha (1-4): ");
            try {
                escolhaJogador2 = scanner.nextInt();
                if (escolhaJogador2 >= 1 && escolhaJogador2 <= 3) {
                    escolhaValida2 = true;
                } else if (escolhaJogador2 == 4) {
                    System.out.println("Saindo do jogo...");
                    return;
                } else {
                    System.out.println("Escolha inválida. Por favor, digite 1, 2, 3 ou 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Consome a entrada inválida
            }
        }
        // Não é necessário clearScreen após a segunda escolha, pois o resultado será exibido

        System.out.println("\n--- REVELANDO AS ESCOLHAS ---");
        System.out.println(nomeJogador1 + " escolheu: " + converterEscolha(escolhaJogador1));
        System.out.println(nomeJogador2 + " escolheu: " + converterEscolha(escolhaJogador2));

        determinarVencedor(escolhaJogador1, escolhaJogador2, nomeJogador1, nomeJogador2);
        // scanner.close(); // Não feche System.in em um método que pode ser chamado múltiplas vezes ou do qual o main depende
    }

    private static String converterEscolha(int escolha) {
        switch (escolha) {
            case 1: return "Pedra";
            case 2: return "Papel";
            case 3: return "Tesoura";
            default: return "Inválida"; // Não deveria acontecer com a validação
        }
    }

    private static void determinarVencedor(int escolha1, int escolha2, String nome1, String nome2) {
        if (escolha1 == escolha2) {
            System.out.println("Empate!");
        } else if ((escolha1 == 1 && escolha2 == 3) || // Pedra vs Tesoura
                   (escolha1 == 2 && escolha2 == 1) || // Papel vs Pedra
                   (escolha1 == 3 && escolha2 == 2)) { // Tesoura vs Papel
            System.out.println(nome1 + " venceu!");
        } else {
            System.out.println(nome2 + " venceu!");
        }
    }

    // Tenta limpar a tela. Funcionalidade dependente do sistema operacional.
    private static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Sequência de escape ANSI para limpar a tela e mover o cursor para o início
                System.out.print("\033[H\033[2J");
                System.out.flush(); // Garante que o buffer seja esvaziado
            }
        } catch (final Exception e) {
            // Se não conseguir limpar, apenas informa ao usuário
            System.out.println("\n\n-----------------------------------------------------");
            System.out.println("Não foi possível limpar a tela automaticamente. Role para cima.");
            System.out.println("-----------------------------------------------------\n\n");
        }
    }

    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in); // Seu Scanner principal
        String nomeJogador1, nomeJogador2;

        System.out.println("Digite seu Nome Jogador 1:");
        nomeJogador1 = batata.nextLine();
        System.out.println("Digite seu Nome Jogador 2:");
        nomeJogador2 = batata.nextLine();

        // Chama o método que gerencia o jogo com a lógica de ocultação
        jogarPedraPapelTesoura(nomeJogador1, nomeJogador2);

        batata.close(); // Fecha o Scanner principal quando o programa termina
    }
}