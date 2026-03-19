package run;
import javax.swing.*;

public class EJ3 {
    public static void main(String[] args) {
        // Pedir número y determinar si es positivo, negativo o cero.
        String numeroTexto = JOptionPane.showInputDialog(null, "Ingresa un número:");

        try {
            double numero = Double.parseDouble(numeroTexto);

            // Evaluar
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El número es positivo");
            } else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El número es negativo");
            } else {
                JOptionPane.showMessageDialog(null, "El número es cero");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un número válido");
        }
    }
}

