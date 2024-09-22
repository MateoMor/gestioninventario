package gestioninventario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionInventarioFrame extends JFrame {
    public GestionInventarioFrame(Usuario usuario) {
        setTitle("Gestión de Inventario");
        setSize(1000, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes
        JLabel labelBienvenido = new JLabel("Bienvenido, " + usuario.getNombre() + " " + usuario.getApellido(), SwingConstants.CENTER);
        JButton botonCerrarSesion = new JButton("Cerrar Sesión");

        // Panel
        JPanel panel = new JPanel();
        panel.add(labelBienvenido);
        panel.add(botonCerrarSesion);

        add(panel);

        // ActionListener para cerrar sesión
        botonCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginFrame loginFrame = new LoginFrame();
                loginFrame.setVisible(true);
                dispose();  // Cerrar la ventana principal
            }
        });
    }
}
