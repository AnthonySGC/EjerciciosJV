package run;

import javax.swing.*;

public class EJ6 {
    public static void main(String[] args) {
        // Si un trabajador gana menos de 8000 córdobas, recibe un bono de 500; si gana más, no recibe bono.
        // Pedir salario
        String salarioTexto = JOptionPane.showInputDialog(null, "Ingresa tu salario:");

        try {
            double salario = Double.parseDouble(salarioTexto);
            double salarioFinal;

            // Evaluar bono
            if (salario < 8000) {
                salarioFinal = salario + 500;

                JOptionPane.showMessageDialog(null,
                        "Recibes un bono de 500 córdobas\nSalario final: " + salarioFinal);
            } else {
                salarioFinal = salario;

                JOptionPane.showMessageDialog(null,
                        "No recibes bono\nSalario final: " + salarioFinal);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un número válido");
        }
    }
}


