package gestioninventario.service;

import gestioninventario.model.Usuario;
import gestioninventario.repository.UsuarioRepositorio;

public class UsuarioServicio {
    public UsuarioServicio() {
        // Crear un usuario de prueba
        Usuario usuarioPrueba = new Usuario();
        usuarioPrueba.setId(1);
        usuarioPrueba.setNombre("Mateo");
        usuarioPrueba.setApellido("Morales");
        usuarioPrueba.setCorreo("mateo@example.com");
        usuarioPrueba.setPassword("123");
        usuarioPrueba.setEstadoActivo(true);

        // Agregar el usuario al repositorio
        UsuarioRepositorio.crearUsuario(usuarioPrueba);
    }

    // Método para validar usuario
    public boolean validarUsuario(String correo, String password) {
        Usuario usuario = UsuarioRepositorio.obtenerUsuarioPorCorreo(correo);
        return usuario != null && usuario.getPassword().equals(password);
    }

    
}
