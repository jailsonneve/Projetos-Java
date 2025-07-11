package Projetos.Iniciante.PedraPapelTesouraV2;
// Importações
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleGame {

    private GameLogic gameLogic;
    private Scanner scanner;

    public ConsoleGame() {
        gameLogic = new GameLogic();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("--- Bem-vindo ao Pedra-Papel-Tesoura (Console)! ---");
        int choice;

        do {
            System.out.println("\nEscolha sua jogada:");
            System.out.println("1. Pedra");
            System.out.println("2. Papel");
            System.out.println("3. Tesoura");
            System.out.println("4. Ver Pontuação");
            System.out.println("5. Reiniciar Jogo");
            System.out.println("6. Sair");
            System.out.print("Digite sua opção: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (choice) {
                    case 1:
                    case 2:
                    case 3:
                        playRound(choice);
                        break;
                    case 4:
                        displayScores();
                        break;
                    case 5:
                        gameLogic.resetScores();
                        System.out.println("Jogo reiniciado! Pontuações zeradas.");
                        break;
                    case 6:
                        System.out.println("Obrigado por jogar!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpar o buffer
                choice = 0; // Para continuar o loop
            }

        } while (choice != 6);

        scanner.close();
    }

    private void playRound(int playerChoiceInt) {
        GameLogic.Choice playerChoice = null;
        switch (playerChoiceInt) {
            case 1: playerChoice = GameLogic.Choice.PEDRA; break;
            case 2: playerChoice = GameLogic.Choice.PAPEL; break;
            case 3: playerChoice = GameLogic.Choice.TESOURA; break;
        }

        GameLogic.Choice computerChoice = gameLogic.getComputerChoice();

        System.out.println("\nVocê escolheu: " + playerChoice);
        System.out.println("O computador escolheu: " + computerChoice);

        int result = gameLogic.determineWinner(playerChoice, computerChoice);
        gameLogic.updateScores(result);

        if (result == 0) {
            System.out.println("Empate!");
        } else if (result == 1) {
            System.out.println("Você venceu a rodada!");
        } else {
            System.out.println("O computador venceu a rodada!");
        }
        displayScores();
    }

    private void displayScores() {
        System.out.println("\n--- Pontuação ---");
        System.out.println("Você: " + gameLogic.getPlayerScore());
        System.out.println("Computador: " + gameLogic.getComputerScore());
        System.out.println("-----------------");
    }
}