package com.project.teste.repository;

import com.project.teste.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {

    Optional<Usuario> findByCPF(String CPF);
}
