package gestioninventario.main;

import javax.swing.SwingUtilities;

import gestioninventario.view.LoginFrame;

public class GestionInventario {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginFrame loginFrameInstance = new LoginFrame();
            loginFrameInstance.setVisible(true);
        });
    }
}
