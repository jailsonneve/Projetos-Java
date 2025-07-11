package Projetos.Iniciante.PedraPapelTesouraV2;
// Importações
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Opções para o usuário escolher
        String[] options = {"Console", "GUI (Swing)"};
        int choice = JOptionPane.showOptionDialog(
            null,
            "Escolha o tipo de interface para jogar Pedra-Papel-Tesoura:",
            "Escolha de Interface",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        if (choice == 0) { // Escolheu Console
            ConsoleGame consoleGame = new ConsoleGame();
            consoleGame.start();
        } else if (choice == 1) { // Escolheu GUI (Swing)
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new SwingGame();
                }
            });
        } else {
            System.out.println("Nenhuma opção selecionada. O programa será encerrado.");
        }
    }
}