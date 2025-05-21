package Projetos.Iniciante.ConversorUnidades;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class UnitConverterGUI extends JFrame {

    private UnitConverter converter;
    private JTextField inputValueField;
    private JLabel resultLabel;
    private JComboBox<String> unitTypeComboBox;
    private JPanel conversionPanel;

    public UnitConverterGUI() {
        super("Conversor de Unidades Moderno");
        converter = new UnitConverter();

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); // Tema mais moderno
        } catch (Exception e) {
            System.out.println("Não foi possível aplicar o tema Nimbus.");
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 350);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(240, 245, 250)); // Cor de fundo clara

        // Painel Superior
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        topPanel.setBackground(new Color(240, 245, 250));
        JLabel title = new JLabel("Selecione o Tipo de Unidade:");
        title.setFont(new Font("Segoe UI", Font.BOLD, 14));
        topPanel.add(title);

        String[] unitTypes = {"Temperatura", "Distância", "Moeda"};
        unitTypeComboBox = new JComboBox<>(unitTypes);
        unitTypeComboBox.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        unitTypeComboBox.addActionListener(e -> updateConversionPanel());
        topPanel.add(unitTypeComboBox);
        add(topPanel, BorderLayout.NORTH);

        // Painel de Conversão
        conversionPanel = new JPanel();
        conversionPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 220), 1),
                "Painel de Conversão",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("Segoe UI", Font.PLAIN, 13)
        ));
        conversionPanel.setBackground(Color.WHITE);
        add(conversionPanel, BorderLayout.CENTER);

        // Painel Inferior
        JPanel bottomPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        bottomPanel.setBackground(new Color(240, 245, 250));

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        inputPanel.setBackground(new Color(240, 245, 250));
        JLabel valorLabel = new JLabel("Valor:");
        valorLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        inputValueField = new JTextField(15);
        inputValueField.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        inputPanel.add(valorLabel);
        inputPanel.add(inputValueField);
        bottomPanel.add(inputPanel);

        JPanel resultDisplayPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        resultDisplayPanel.setBackground(new Color(240, 245, 250));
        resultLabel = new JLabel("Resultado: ");
        resultLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        resultDisplayPanel.add(resultLabel);
        bottomPanel.add(resultDisplayPanel);
        add(bottomPanel, BorderLayout.SOUTH);

        updateConversionPanel();
        setVisible(true);
    }

    private void updateConversionPanel() {
        conversionPanel.removeAll();
        String selectedType = (String) unitTypeComboBox.getSelectedItem();

        switch (selectedType) {
            case "Temperatura":
                setupTemperaturePanel();
                break;
            case "Distância":
                setupDistancePanel();
                break;
            case "Moeda":
                setupCurrencyPanel();
                break;
        }
        conversionPanel.revalidate();
        conversionPanel.repaint();
    }

    private void styleButton(JButton button) {
        button.setBackground(new Color(100, 149, 237));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
    }

    private void setupTemperaturePanel() {
        conversionPanel.setLayout(new GridLayout(3, 2, 10, 10));
        String[] tempUnits = {"Celsius (°C)", "Fahrenheit (°F)", "Kelvin (K)"};
        JComboBox<String> fromTemp = new JComboBox<>(tempUnits);
        JComboBox<String> toTemp = new JComboBox<>(tempUnits);
        JButton convertButton = new JButton("Converter");
        styleButton(convertButton);

        conversionPanel.add(new JLabel("De:"));
        conversionPanel.add(fromTemp);
        conversionPanel.add(new JLabel("Para:"));
        conversionPanel.add(toTemp);
        conversionPanel.add(new JLabel(""));
        conversionPanel.add(convertButton);

        convertButton.addActionListener(e -> {
            try {
                double value = Double.parseDouble(inputValueField.getText());
                double result = 0;
                String fromUnit = (String) fromTemp.getSelectedItem();
                String toUnit = (String) toTemp.getSelectedItem();

                if (fromUnit.equals("Celsius (°C)") && toUnit.equals("Fahrenheit (°F)")) {
                    result = converter.celsiusToFahrenheit(value);
                } else if (fromUnit.equals("Fahrenheit (°F)") && toUnit.equals("Celsius (°C)")) {
                    result = converter.fahrenheitToCelsius(value);
                } else if (fromUnit.equals("Celsius (°C)") && toUnit.equals("Kelvin (K)")) {
                    result = converter.celsiusToKelvin(value);
                } else if (fromUnit.equals("Kelvin (K)") && toUnit.equals("Celsius (°C)")) {
                    result = converter.kelvinToCelsius(value);
                } else if (fromUnit.equals(toUnit)) {
                    result = value;
                } else {
                    resultLabel.setText("Combinação não suportada.");
                    return;
                }

                resultLabel.setText(String.format("Resultado: %.2f", result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Insira um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void setupDistancePanel() {
        conversionPanel.setLayout(new GridLayout(3, 2, 10, 10));
        String[] distUnits = {"Metros (m)", "Quilômetros (km)", "Milhas (mi)"};
        JComboBox<String> fromDist = new JComboBox<>(distUnits);
        JComboBox<String> toDist = new JComboBox<>(distUnits);
        JButton convertButton = new JButton("Converter");
        styleButton(convertButton);

        conversionPanel.add(new JLabel("De:"));
        conversionPanel.add(fromDist);
        conversionPanel.add(new JLabel("Para:"));
        conversionPanel.add(toDist);
        conversionPanel.add(new JLabel(""));
        conversionPanel.add(convertButton);

        convertButton.addActionListener(e -> {
            try {
                BigDecimal value = new BigDecimal(inputValueField.getText());
                BigDecimal result = BigDecimal.ZERO;
                String fromUnit = (String) fromDist.getSelectedItem();
                String toUnit = (String) toDist.getSelectedItem();

                if (fromUnit.equals("Metros (m)") && toUnit.equals("Quilômetros (km)")) {
                    result = converter.metersToKilometers(value);
                } else if (fromUnit.equals("Quilômetros (km)") && toUnit.equals("Metros (m)")) {
                    result = converter.kilometersToMeters(value);
                } else if (fromUnit.equals("Metros (m)") && toUnit.equals("Milhas (mi)")) {
                    result = converter.metersToMiles(value);
                } else if (fromUnit.equals("Milhas (mi)") && toUnit.equals("Metros (m)")) {
                    result = converter.milesToMeters(value);
                } else if (fromUnit.equals("Quilômetros (km)") && toUnit.equals("Milhas (mi)")) {
                    result = converter.kilometersToMiles(value);
                } else if (fromUnit.equals("Milhas (mi)") && toUnit.equals("Quilômetros (km)")) {
                    result = converter.milesToKilometers(value);
                } else if (fromUnit.equals(toUnit)) {
                    result = value;
                } else {
                    resultLabel.setText("Combinação não suportada.");
                    return;
                }

                resultLabel.setText("Resultado: " + result.stripTrailingZeros().toPlainString());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Insira um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void setupCurrencyPanel() {
        conversionPanel.setLayout(new GridLayout(3, 2, 10, 10));
        String[] currUnits = {"USD", "BRL", "EUR", "JPY"};
        JComboBox<String> fromCurr = new JComboBox<>(currUnits);
        JComboBox<String> toCurr = new JComboBox<>(currUnits);
        JButton convertButton = new JButton("Converter");
        styleButton(convertButton);

        conversionPanel.add(new JLabel("De:"));
        conversionPanel.add(fromCurr);
        conversionPanel.add(new JLabel("Para:"));
        conversionPanel.add(toCurr);
        conversionPanel.add(new JLabel(""));
        conversionPanel.add(convertButton);

        convertButton.addActionListener(e -> {
            try {
                BigDecimal value = new BigDecimal(inputValueField.getText());
                BigDecimal result = BigDecimal.ZERO;
                String fromUnit = (String) fromCurr.getSelectedItem();
                String toUnit = (String) toCurr.getSelectedItem();

                if (fromUnit.equals("USD") && toUnit.equals("BRL")) result = converter.usdToBrl(value);
                else if (fromUnit.equals("BRL") && toUnit.equals("USD")) result = converter.brlToUsd(value);
                else if (fromUnit.equals("EUR") && toUnit.equals("BRL")) result = converter.eurToBrl(value);
                else if (fromUnit.equals("BRL") && toUnit.equals("EUR")) result = converter.brlToEur(value);
                else if (fromUnit.equals("JPY") && toUnit.equals("BRL")) result = converter.jpyToBrl(value);
                else if (fromUnit.equals("BRL") && toUnit.equals("JPY")) result = converter.brlToJpy(value);
                else if (fromUnit.equals(toUnit)) result = value;
                else {
                    BigDecimal inBRL;
                    if (fromUnit.equals("USD") && toUnit.equals("EUR")) {
                        inBRL = converter.usdToBrl(value);
                        result = converter.brlToEur(inBRL);
                    } else if (fromUnit.equals("EUR") && toUnit.equals("USD")) {
                        inBRL = converter.eurToBrl(value);
                        result = converter.brlToUsd(inBRL);
                    } else if (fromUnit.equals("USD") && toUnit.equals("JPY")) {
                        inBRL = converter.usdToBrl(value);
                        result = converter.brlToJpy(inBRL);
                    } else if (fromUnit.equals("JPY") && toUnit.equals("USD")) {
                        inBRL = converter.jpyToBrl(value);
                        result = converter.brlToUsd(inBRL);
                    } else if (fromUnit.equals("EUR") && toUnit.equals("JPY")) {
                        inBRL = converter.eurToBrl(value);
                        result = converter.brlToJpy(inBRL);
                    } else if (fromUnit.equals("JPY") && toUnit.equals("EUR")) {
                        inBRL = converter.jpyToBrl(value);
                        result = converter.brlToEur(inBRL);
                    } else {
                        resultLabel.setText("Combinação não suportada.");
                        return;
                    }
                }
                resultLabel.setText("Resultado: " + result.setScale(2, RoundingMode.HALF_UP).toPlainString());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Insira um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}