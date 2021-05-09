package com.project.teste.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.teste.Model.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}
