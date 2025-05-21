package Projetos.Iniciante.ConversorUnidades;
// Importações
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Garante que a GUI seja criada na Thread de Despacho de Eventos (Event Dispatch Thread - EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UnitConverterGUI();
            }
        });
    }
}