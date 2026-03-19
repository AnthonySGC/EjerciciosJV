package run;

import javax.swing.*;

public class EJ4 {
    public static void main(String[] args) {
        // Pide usuario y contraseña. Si coinciden con valores predefinidos, muestra 'Acceso permitido', de lo contrario 'Acceso denegado'.
        // Datos correctos (predefinidos)
        String usuarioCorrecto = "admin";
        String contraseñaCorrecta = "1234";

        // Pedir datos
        String usuario = JOptionPane.showInputDialog(null, "Ingresa tu usuario:");
        String contraseña = JOptionPane.showInputDialog(null, "Ingresa tu contraseña:");

        // Verificar
        if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
            JOptionPane.showMessageDialog(null, "Acceso permitido");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }
    }
}


