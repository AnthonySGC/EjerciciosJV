package run;

import javax.swing.*;

public class EJ9 {
    public static void main(String[] args) {
        //Solicita un número entero y determina si es par o impar.
        String numeroTexto = JOptionPane.showInputDialog(null, "Ingresa un número entero:");

        try {
            int numero = Integer.parseInt(numeroTexto);

            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número es par");
            } else {
                JOptionPane.showMessageDialog(null, "El número es impar");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un número válido");
        }
    }
}


