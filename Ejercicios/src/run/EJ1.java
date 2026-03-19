package run;
import javax.swing.JOptionPane;
public class EJ1 {
    public static void main(String[] args) {
        // Pide la edad de una persona y muestra si es mayor o menor de edad (≥ 18).
        String edadTexto = JOptionPane.showInputDialog(null, "Ingresa tu edad:");

        int edad = Integer.parseInt(edadTexto);

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Eres mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad");
        }
    }
}
