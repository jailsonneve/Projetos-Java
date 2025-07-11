package Projetos.Iniciante.PedraPapelTesouraV2;
// Importações
import java.util.Random;

public class GameLogic {

    public enum Choice {
        PEDRA, PAPEL, TESOURA
    }

    private int playerScore;
    private int computerScore;
    private Random random;

    public GameLogic() {
        this.playerScore = 0;
        this.computerScore = 0;
        this.random = new Random();
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public int getComputerScore() {
        return this.computerScore;
    }

    public void resetScores() {
        this.playerScore = 0;
        this.computerScore = 0;
    }

    /**
     * Gera uma escolha aleatória para o computador.
     * @return A escolha do computador.
     */
    public Choice getComputerChoice() {
        return Choice.values()[random.nextInt(Choice.values().length)];
    }

    /**
     * Determina o vencedor de uma rodada de Pedra-Papel-Tesoura.
     * @param playerChoice A escolha do jogador.
     * @param computerChoice A escolha do computador.
     * @return 0 se for empate, 1 se o jogador vencer, -1 se o computador vencer.
     */
    public int determineWinner(Choice playerChoice, Choice computerChoice) {
        if (playerChoice == computerChoice) {
            return 0; // Empate
        }

        switch (playerChoice) {
            case PEDRA -> {
                return (computerChoice == Choice.TESOURA) ? 1 : -1;
            }
            case PAPEL -> {
                return (computerChoice == Choice.PEDRA) ? 1 : -1;
            }
            case TESOURA -> {
                return (computerChoice == Choice.PAPEL) ? 1 : -1;
            }
        }
        return 0; // Isso não deve acontecer
    }

    /**
     * Atualiza a pontuação com base no resultado da rodada.
     * @param result O resultado da rodada (0 para empate, 1 para vitória do jogador, -1 para vitória do computador).
     */
    public void updateScores(int result) {
        if (result == 1) {
            this.playerScore++;
        } else if (result == -1) {
            this.computerScore++;
        }
    }
}