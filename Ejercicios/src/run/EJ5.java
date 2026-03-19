package run;

import javax.swing.*;

public class EJ5 {
    public static void main(String[] args) {
        //Si el total de compra es mayor a 1000 córdobas, aplica un 10% de descuento; si no, no aplica descuento.

        // Pedir total
        String totalTexto = JOptionPane.showInputDialog(null, "Ingresa el total de la compra:");

        try {
            double total = Double.parseDouble(totalTexto);
            double totalFinal;

            // Aplicar descuento
            if (total > 1000) {
                double descuento = total * 0.10;
                totalFinal = total - descuento;

                JOptionPane.showMessageDialog(null,
                        "Se aplicó un 10% de descuento\nTotal final: " + totalFinal + " córdobas");
            } else {
                totalFinal = total;

                JOptionPane.showMessageDialog(null,
                        "No aplica descuento\nTotal a pagar: " + totalFinal + " córdobas");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un número válido");
        }
    }
}


