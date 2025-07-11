package Projetos.Iniciante.PedraPapelTesouraV2;
// Importações
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingGame extends JFrame {

    private GameLogic gameLogic;

    private JLabel playerScoreLabel;
    private JLabel computerScoreLabel;
    private JLabel resultLabel;
    private JLabel playerChoiceLabel;
    private JLabel computerChoiceLabel;

    public SwingGame() {
        super("Pedra-Papel-Tesoura");
        gameLogic = new GameLogic();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setLocationRelativeTo(null); // Centraliza a janela
        setLayout(new BorderLayout(10, 10));

        // --- Painel de Pontuação ---
        JPanel scorePanel = new JPanel(new GridLayout(2, 2, 5, 5));
        scorePanel.setBorder(BorderFactory.createTitledBorder("Pontuação"));

        playerScoreLabel = new JLabel("Você: 0");
        playerScoreLabel.setFont(new Font("Arial", Font.BOLD, 16));
        computerScoreLabel = new JLabel("Computador: 0");
        computerScoreLabel.setFont(new Font("Arial", Font.BOLD, 16));

        scorePanel.add(playerScoreLabel);
        scorePanel.add(computerScoreLabel);
        add(scorePanel, BorderLayout.NORTH);

        // --- Painel de Jogo (Escolhas e Resultado) ---
        JPanel gamePanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Preenchimento entre componentes

        // Labels para mostrar as escolhas
        playerChoiceLabel = new JLabel("Sua escolha: ");
        playerChoiceLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        computerChoiceLabel = new JLabel("Computador escolheu: ");
        computerChoiceLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 3; gamePanel.add(playerChoiceLabel, gbc);
        gbc.gridy = 1; gamePanel.add(computerChoiceLabel, gbc);

        // Botões de Jogada
        JButton rockButton = new JButton("Pedra");
        JButton paperButton = new JButton("Papel");
        JButton scissorsButton = new JButton("Tesoura");

        // Adiciona ActionListener aos botões de jogada
        ActionListener playListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameLogic.Choice playerChoice;
                if (e.getSource() == rockButton) {
                    playerChoice = GameLogic.Choice.PEDRA;
                } else if (e.getSource() == paperButton) {
                    playerChoice = GameLogic.Choice.PAPEL;
                } else {
                    playerChoice = GameLogic.Choice.TESOURA;
                }
                playRound(playerChoice);
            }
        };

        rockButton.addActionListener(playListener);
        paperButton.addActionListener(playListener);
        scissorsButton.addActionListener(playListener);

        gbc.gridwidth = 1; // Reseta gridwidth
        gbc.gridy = 2;
        gbc.gridx = 0; gamePanel.add(rockButton, gbc);
        gbc.gridx = 1; gamePanel.add(paperButton, gbc);
        gbc.gridx = 2; gamePanel.add(scissorsButton, gbc);

        // Label de Resultado
        resultLabel = new JLabel("Faça sua jogada!");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridy = 3;
        gbc.gridx = 0; gbc.gridwidth = 3; // Ocupa 3 colunas
        gamePanel.add(resultLabel, gbc);

        add(gamePanel, BorderLayout.CENTER);

        // --- Painel de Controles (Reiniciar) ---
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton resetButton = new JButton("Reiniciar Jogo");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLogic.resetScores();
                updateScoreLabels();
                resultLabel.setText("Jogo reiniciado! Faça sua jogada!");
                playerChoiceLabel.setText("Sua escolha: ");
                computerChoiceLabel.setText("Computador escolheu: ");
            }
        });
        controlPanel.add(resetButton);
        add(controlPanel, BorderLayout.SOUTH);

        updateScoreLabels(); // Atualiza a pontuação inicial
        setVisible(true);
    }

    private void playRound(GameLogic.Choice playerChoice) {
        GameLogic.Choice computerChoice = gameLogic.getComputerChoice();

        playerChoiceLabel.setText("Sua escolha: " + playerChoice);
        computerChoiceLabel.setText("Computador escolheu: " + computerChoice);

        int result = gameLogic.determineWinner(playerChoice, computerChoice);
        gameLogic.updateScores(result);

        if (result == 0) {
            resultLabel.setText("Empate!");
        } else if (result == 1) {
            resultLabel.setText("Você Venceu!");
        } else {
            resultLabel.setText("Computador Venceu!");
        }
        updateScoreLabels();
    }

    private void updateScoreLabels() {
        playerScoreLabel.setText("Você: " + gameLogic.getPlayerScore());
        computerScoreLabel.setText("Computador: " + gameLogic.getComputerScore());
    }
}