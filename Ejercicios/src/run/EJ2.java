package run;
import javax.swing.JOptionPane;
public class EJ2 {
    public static void main(String[] args) {
        // Solicitar año y determinar si es bisiesto o no.
        String añoTexto = JOptionPane.showInputDialog(null, "Ingresa un año:");

        try {
            int año = Integer.parseInt(añoTexto);

            // Lógica de año bisiesto
            if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                JOptionPane.showMessageDialog(null, "El año " + año + " es bisiesto");
            } else {
                JOptionPane.showMessageDialog(null, "El año " + año + " no es bisiesto");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un número válido");
        }
    }
}

