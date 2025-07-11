package Projetos.Iniciante.Calculadora;
// Importações
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame implements ActionListener {

    // Componentes da interface
    private JTextField display;
    private JButton[] botoesNumeros;
    private JButton[] botoesOperacoes;
    private JButton botaoIgual, botaoLimpar, botaoHistorico; // Adicionado botaoHistorico
    private JPanel painelBotoes;
    private JTextArea historicoDisplay; // Adicionado JTextArea para o histórico
    private JScrollPane scrollHistorico; // Para ter barra de rolagem no histórico
    private JPanel painelPrincipal; // Painel principal para organizar tudo

    // Variáveis para lógica da calculadora
    private double num1, num2, resultado;
    private char operador;
    private ArrayList<String> historicoCalculos; // Lista para armazenar o histórico
    public Calculadora() {
        // Configurações da janela
        setTitle("Calculadora Java");
        setSize(600, 500); // Aumenta a largura para o histórico
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Centraliza a janela

        historicoCalculos = new ArrayList<>(); // Inicializa o histórico

        // Painel Principal para organizar a calculadora e o histórico
        painelPrincipal = new JPanel(new BorderLayout());
        add(painelPrincipal, BorderLayout.CENTER);

        // Display da Calculadora
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 40));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBackground(Color.LIGHT_GRAY);
        display.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        painelPrincipal.add(display, BorderLayout.NORTH);

        // Painel para os botões da calculadora
        painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(5, 4, 10, 10)); // 5 linhas, 4 colunas, espaçamento de 10px
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Margem interna
        painelPrincipal.add(painelBotoes, BorderLayout.CENTER);

        // Componentes do Histórico
        historicoDisplay = new JTextArea();
        historicoDisplay.setFont(new Font("Arial", Font.PLAIN, 18));
        historicoDisplay.setEditable(false);
        historicoDisplay.setBackground(new Color(230, 230, 250)); // Cor suave para o histórico
        historicoDisplay.setBorder(BorderFactory.createTitledBorder("Histórico de Calculos")); // Título do histórico

        scrollHistorico = new JScrollPane(historicoDisplay);
        scrollHistorico.setPreferredSize(new Dimension(200, 0)); // Largura fixa para o histórico
        add(scrollHistorico, BorderLayout.EAST); // Adiciona o histórico à direita

        // Inicializa botões de números
        botoesNumeros = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botoesNumeros[i] = new JButton(String.valueOf(i));
            botoesNumeros[i].setFont(new Font("Arial", Font.BOLD, 30));
            botoesNumeros[i].addActionListener(this);
            botoesNumeros[i].setBackground(new Color(240, 240, 240)); // Cor de fundo suave
            botoesNumeros[i].setForeground(Color.BLACK);
            botoesNumeros[i].setFocusPainted(false); // Remove o foco visual ao clicar
        }

        // Inicializa botões de operações
        botoesOperacoes = new JButton[4]; // +, -, *, /
        botoesOperacoes[0] = new JButton("+");
        botoesOperacoes[1] = new JButton("-");
        botoesOperacoes[2] = new JButton("*");
        botoesOperacoes[3] = new JButton("/");

        for (int i = 0; i < 4; i++) {
            botoesOperacoes[i].setFont(new Font("Arial", Font.BOLD, 30));
            botoesOperacoes[i].addActionListener(this);
            botoesOperacoes[i].setBackground(new Color(255, 165, 0)); // Laranja para operações
            botoesOperacoes[i].setForeground(Color.WHITE);
            botoesOperacoes[i].setFocusPainted(false);
        }

        // Botão de igual
        botaoIgual = new JButton("=");
        botaoIgual.setFont(new Font("Arial", Font.BOLD, 30));
        botaoIgual.addActionListener(this);
        botaoIgual.setBackground(new Color(0, 128, 0)); // Verde para igual
        botaoIgual.setForeground(Color.WHITE);
        botaoIgual.setFocusPainted(false);

        // Botão de limpar (Clear)
        botaoLimpar = new JButton("C");
        botaoLimpar.setFont(new Font("Arial", Font.BOLD, 30));
        botaoLimpar.addActionListener(this);
        botaoLimpar.setBackground(new Color(220, 20, 60)); // Vermelho para limpar
        botaoLimpar.setForeground(Color.WHITE);
        botaoLimpar.setFocusPainted(false);

        // Botão para limpar histórico (Opcional, mas útil)
        botaoHistorico = new JButton("Limpar Histórico");
        botaoHistorico.setFont(new Font("Arial", Font.BOLD, 16));
        botaoHistorico.addActionListener(this);
        botaoHistorico.setBackground(new Color(100, 149, 237)); // Azul para o botão de histórico
        botaoHistorico.setForeground(Color.WHITE);
        botaoHistorico.setFocusPainted(false);

        // Adiciona os botões ao painel
        // Linha 1
        painelBotoes.add(botoesNumeros[7]);
        painelBotoes.add(botoesNumeros[8]);
        painelBotoes.add(botoesNumeros[9]);
        painelBotoes.add(botoesOperacoes[0]); // +

        // Linha 2
        painelBotoes.add(botoesNumeros[4]);
        painelBotoes.add(botoesNumeros[5]);
        painelBotoes.add(botoesNumeros[6]);
        painelBotoes.add(botoesOperacoes[1]); // -

        // Linha 3
        painelBotoes.add(botoesNumeros[1]);
        painelBotoes.add(botoesNumeros[2]);
        painelBotoes.add(botoesNumeros[3]);
        painelBotoes.add(botoesOperacoes[2]); // *

        // Linha 4
        painelBotoes.add(new JLabel("")); // Espaço vazio para alinhar
        painelBotoes.add(botoesNumeros[0]);
        painelBotoes.add(new JLabel("")); // Espaço vazio para alinhar
        painelBotoes.add(botoesOperacoes[3]); // /

        // Linha 5
        painelBotoes.add(botaoLimpar);
        painelBotoes.add(new JLabel("")); // Espaço vazio para alinhar
        painelBotoes.add(new JLabel("")); // Espaço vazio para alinhar
        painelBotoes.add(botaoIgual);

        // Adiciona o botão de limpar histórico em um painel separado para melhor layout
        JPanel painelHistoricoBotao = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelHistoricoBotao.add(botaoHistorico);
        add(painelHistoricoBotao, BorderLayout.SOUTH); // Adiciona na parte inferior da janela

        setVisible(true); // Torna a janela visível
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        // Se for um número
        for (int i = 0; i < 10; i++) {
            if (comando.equals(String.valueOf(i))) {
                display.setText(display.getText() + comando);
                return;
            }
        }

        // Se for uma operação
        if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
            if (!display.getText().isEmpty()) { // Evita erro se o display estiver vazio
                num1 = Double.parseDouble(display.getText());
                operador = comando.charAt(0);
                display.setText(""); // Limpa o display para o próximo número
            }
            return;
        }

        // Se for o botão de igual
        if (comando.equals("=")) {
            if (display.getText().isEmpty()) { // Evita erro se não houver segundo número
                return;
            }
            num2 = Double.parseDouble(display.getText());

            try {
                switch (operador) {
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            display.setText("Erro: Divisão por zero!");
                            return;
                        }
                        resultado = num1 / num2;
                        break;
                    default:
                        // Caso o operador não tenha sido definido (ex: usuário digitou só número e apertou =)
                        resultado = num2; // Mostra o próprio número como resultado
                }

                String entradaHistorico = String.format("%.2f %c %.2f = %.2f", num1, operador, num2, resultado);
                historicoCalculos.add(entradaHistorico); // Adiciona ao ArrayList
                atualizarHistoricoDisplay(); // Atualiza o JTextArea

                display.setText(String.valueOf(resultado));
                num1 = resultado; // Permite continuar calculando com o resultado
                String.valueOf(resultado);
            } catch (NumberFormatException ex) {
                display.setText("Erro: Entrada inválida!");
            }
            return;
        }

        // Se for o botão de limpar
        if (comando.equals("C")) {
            display.setText("");
            num1 = 0;
            num2 = 0;
            operador = ' ';
            return;
        }

        // Se for o botão de limpar histórico
        if (comando.equals("Limpar Histórico")) {
            historicoCalculos.clear(); // Limpa o ArrayList
            atualizarHistoricoDisplay(); // Atualiza o JTextArea para refletir a lista vazia
        }
    }

    // Método para atualizar o JTextArea do histórico
    private void atualizarHistoricoDisplay() {
        StringBuilder sb = new StringBuilder();
        for (String calculo : historicoCalculos) {
            sb.append(calculo).append("\n"); // Adiciona cada cálculo com uma nova linha
        }
        historicoDisplay.setText(sb.toString());
        // Rola automaticamente para o final do histórico
        historicoDisplay.setCaretPosition(historicoDisplay.getDocument().getLength());
    }

    public static void main(String[] args) {
        // Garante que a GUI seja criada na thread de despacho de eventos (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculadora();
            }
        });
    }
}