package run;

import javax.swing.*;

public class EJ10 {
    public static void main(String[] args) {
        //Un estudiante universitario ingresa sus 3 notas. Determina si aprueba (≥ 70) o reprueba.
        
        String nota1Texto = JOptionPane.showInputDialog(null, "Ingresa la nota 1:");
        String nota2Texto = JOptionPane.showInputDialog(null, "Ingresa la nota 2:");
        String nota3Texto = JOptionPane.showInputDialog(null, "Ingresa la nota 3:");

        try {
            double nota1 = Double.parseDouble(nota1Texto);
            double nota2 = Double.parseDouble(nota2Texto);
            double nota3 = Double.parseDouble(nota3Texto);

            double promedio = (nota1 + nota2 + nota3) / 3;

            if (promedio >= 70) {
                JOptionPane.showMessageDialog(null,
                        "Promedio: " + promedio + "\nResultado: Aprueba");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Promedio: " + promedio + "\nResultado: Reprueba");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa notas válidas");
        }
    }
}



