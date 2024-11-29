package com.example.apirestfull.modelo.service;

import com.example.apirestfull.modelo.dto.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> listar();

    public void agregar(Usuario usuario);

    public void eliminar(Integer id);

    public void modificar(Usuario usuario);

    public Usuario buscarPorId(Integer id);

    public void agregarUsuario(Usuario usuario);

    public void editarUsuario(Usuario usuario);

    public void eliminarUsuario(Integer id);
}
