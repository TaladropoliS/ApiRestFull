package com.example.apirestfull.modelo.service;

import com.example.apirestfull.modelo.dao.UsuarioDAO;
import com.example.apirestfull.modelo.dto.Usuario;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> listar() {
        return usuarioDAO.findAll();
    }

    @Override
    public void agregar(Usuario usuario) {
        usuarioDAO.save(usuario);
    }

    @Override
    public void eliminar(Integer id) {
        usuarioDAO.deleteById(id);
    }

    @Override
    public void modificar(Usuario usuario) {
        usuarioDAO.save(usuario);
    }

    @Override
    public Usuario buscarPorId(Integer id) {
        return usuarioDAO.findById(id).orElse(null);
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarioDAO.save(usuario);
    }

    @Override
    public void editarUsuario(Usuario usuario) {
        if (usuarioDAO.findById(usuario.getId()).isEmpty()) {
            throw new EntityNotFoundException("Usuario no encontrado.");
        }
        usuarioDAO.save(usuario);
    }

    @Override
    public void eliminarUsuario(Integer id) {
        usuarioDAO.deleteById(id);
    }
}
