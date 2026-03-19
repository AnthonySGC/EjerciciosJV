package run;

import javax.swing.*;

public class EJ8 {
    public static void main(String[] args) {
        //Solicita dos números e indica cuál es mayor o si son iguales.
        String num1Texto = JOptionPane.showInputDialog(null, "Ingresa el primer número:");
        String num2Texto = JOptionPane.showInputDialog(null, "Ingresa el segundo número:");

        try {
            double num1 = Double.parseDouble(num1Texto);
            double num2 = Double.parseDouble(num2Texto);

            if (num1 > num2) {
                JOptionPane.showMessageDialog(null, "El número mayor es: " + num1);
            } else if (num2 > num1) {
                JOptionPane.showMessageDialog(null, "El número mayor es: " + num2);
            } else {
                JOptionPane.showMessageDialog(null, "Ambos números son iguales");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa números válidos");
        }
    }
}


