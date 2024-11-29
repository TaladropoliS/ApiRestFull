package com.example.apirestfull.modelo.dao;

import com.example.apirestfull.modelo.dto.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {

}