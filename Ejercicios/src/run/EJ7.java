package run;

import javax.swing.*;

public class EJ7 {
    public static void main(String[] args) {
        //Dado un puntaje (0–100), clasifica: 90–100 Excelente, 70–89 Bueno, 60–69 Regular, <60 Deficiente.
        String puntajeTexto = JOptionPane.showInputDialog(null, "Ingresa tu puntaje (0-100):");

        try {
            int puntaje = Integer.parseInt(puntajeTexto);
            String resultado;

            if (puntaje >= 90 && puntaje <= 100) {
                resultado = "Excelente";
            } else if (puntaje >= 70 && puntaje <= 89) {
                resultado = "Bueno";
            } else if (puntaje >= 60 && puntaje <= 69) {
                resultado = "Regular";
            } else if (puntaje < 60 && puntaje >= 0) {
                resultado = "Deficiente";
            } else {
                resultado = "Puntaje inválido";
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un número válido");
        }
    }
}


