package gestioninventario.repository;


import java.util.ArrayList;
import java.util.List;

import gestioninventario.model.Usuario;

public class UsuarioRepositorio {
    // ArrayList estático para almacenar usuarios
    private static List<Usuario> usuarios = new ArrayList<>();

    // Método para crear un usuario al array
    public static void crearUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario agregado correctamente.");
    }

    // Método para modificar un usuario existente en el array
    public static void modificarUsuario(int id, Usuario usuarioModificado) {
        // Se usa el indice para hacer el set del usuario modificado
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                usuarios.set(i, usuarioModificado);
                System.out.println("Usuario modificado correctamente.");
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    // Método para obtener un usuario por correo electrónico
    public static Usuario obtenerUsuarioPorCorreo(String correo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equalsIgnoreCase(correo)) {
                return usuario;
            }
        }
        System.out.println("Usuario no encontrado.");
        return null;
    }

    // Método para obtener el listado de usuarios
    public static List<Usuario> obtenerListadoUsuarios() {
        return usuarios;
    }

    // Método para activar un usuario
    public static void activarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuario.setEstadoActivo(true);
                System.out.println("Usuario activado correctamente.");
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    // Método para inactivar un usuario
    public static void inactivarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuario.setEstadoActivo(false);
                System.out.println("Usuario inactivado correctamente.");
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }
}
