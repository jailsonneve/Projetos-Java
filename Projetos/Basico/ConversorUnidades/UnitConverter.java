package Projetos.Iniciante.ConversorUnidades;
// Importações
import java.math.BigDecimal;
import java.math.RoundingMode;

public class UnitConverter {

    private static final int SCALE = 5; // Precisão para BigDecimal

    // --- Conversão de Temperatura ---

    /**
     * Converte Celsius para Fahrenheit.
     * Formula: F = C * 9/5 + 32
     * @param celsius Temperatura em Celsius.
     * @return Temperatura em Fahrenheit.
     */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Converte Fahrenheit para Celsius.
     * Formula: C = (F - 32) * 5/9
     * @param fahrenheit Temperatura em Fahrenheit.
     * @return Temperatura em Celsius.
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Converte Celsius para Kelvin.
     * Formula: K = C + 273.15
     * @param celsius Temperatura em Celsius.
     * @return Temperatura em Kelvin.
     */
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    /**
     * Converte Kelvin para Celsius.
     * Formula: C = K - 273.15
     * @param kelvin Temperatura em Kelvin.
     * @return Temperatura em Celsius.
     */
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // --- Conversão de Distância ---

    /**
     * Converte Metros para Quilômetros.
     * @param meters Distância em Metros.
     * @return Distância em Quilômetros.
     */
    public BigDecimal metersToKilometers(BigDecimal meters) {
        return meters.divide(new BigDecimal("1000"), SCALE, RoundingMode.HALF_UP);
    }

    /**
     * Converte Quilômetros para Metros.
     * @param kilometers Distância em Quilômetros.
     * @return Distância em Metros.
     */
    public BigDecimal kilometersToMeters(BigDecimal kilometers) {
        return kilometers.multiply(new BigDecimal("1000"));
    }

    /**
     * Converte Metros para Milhas.
     * 1 metro = 0.000621371 milhas
     * @param meters Distância em Metros.
     * @return Distância em Milhas.
     */
    public BigDecimal metersToMiles(BigDecimal meters) {
        return meters.multiply(new BigDecimal("0.000621371"), new java.math.MathContext(SCALE, RoundingMode.HALF_UP));
    }

    /**
     * Converte Milhas para Metros.
     * 1 milha = 1609.34 metros
     * @param miles Distância em Milhas.
     * @return Distância em Metros.
     */
    public BigDecimal milesToMeters(BigDecimal miles) {
        return miles.multiply(new BigDecimal("1609.34"));
    }

    /**
     * Converte Quilômetros para Milhas.
     * 1 km = 0.621371 milhas
     * @param kilometers Distância em Quilômetros.
     * @return Distância em Milhas.
     */
    public BigDecimal kilometersToMiles(BigDecimal kilometers) {
        return kilometers.multiply(new BigDecimal("0.621371"), new java.math.MathContext(SCALE, RoundingMode.HALF_UP));
    }

    /**
     * Converte Milhas para Quilômetros.
     * 1 milha = 1.60934 quilômetros
     * @param miles Distância em Milhas.
     * @return Distância em Quilômetros.
     */
    public BigDecimal milesToKilometers(BigDecimal miles) {
        return miles.multiply(new BigDecimal("1.60934"));
    }


    // --- Conversão de Moeda (Exemplo Simplificado - Taxas Fixas) ---
    // Em um aplicativo real, estas taxas seriam obtidas de uma API ou banco de dados.

    /**
     * Taxa de câmbio simulada: 1 USD = 5,65 BRL
     */
    private static final BigDecimal USD_TO_BRL_RATE = new BigDecimal("5,65");
    /**
     * Taxa de câmbio simulada: 1 EUR = 6,40 BRL
     */
    private static final BigDecimal EUR_TO_BRL_RATE = new BigDecimal("6,40");
    /**
     * Taxa de câmbio simulada: 1 JPY = 0,039 BRL
     */
    private static final BigDecimal JPY_TO_BRL_RATE = new BigDecimal("0,039");

    /**
     * Converte Dólar Americano (USD) para Real Brasileiro (BRL).
     * @param usd Valor em USD.
     * @return Valor em BRL.
     */
    public BigDecimal usdToBrl(BigDecimal usd) {
        return usd.multiply(USD_TO_BRL_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Converte Real Brasileiro (BRL) para Dólar Americano (USD).
     * @param brl Valor em BRL.
     * @return Valor em USD.
     */
    public BigDecimal brlToUsd(BigDecimal brl) {
        return brl.divide(USD_TO_BRL_RATE, SCALE, RoundingMode.HALF_UP);
    }

    /**
     * Converte Euro (EUR) para Real Brasileiro (BRL).
     * @param eur Valor em EUR.
     * @return Valor em BRL.
     */
    public BigDecimal eurToBrl(BigDecimal eur) {
        return eur.multiply(EUR_TO_BRL_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Converte Real Brasileiro (BRL) para Euro (EUR).
     * @param brl Valor em BRL.
     * @return Valor em EUR.
     */
    public BigDecimal brlToEur(BigDecimal brl) {
        return brl.divide(EUR_TO_BRL_RATE, SCALE, RoundingMode.HALF_UP);
    }

    /**
     * Converte Iene Japonês (JPY) para Real Brasileiro (BRL).
     * @param jpy Valor em JPY.
     * @return Valor em BRL.
     */
    public BigDecimal jpyToBrl(BigDecimal jpy) {
        return jpy.multiply(JPY_TO_BRL_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Converte Real Brasileiro (BRL) para Iene Japonês (JPY).
     * @param brl Valor em BRL.
     * @return Valor em JPY.
     */
    public BigDecimal brlToJpy(BigDecimal brl) {
        return brl.divide(JPY_TO_BRL_RATE, SCALE, RoundingMode.HALF_UP);
    }
}