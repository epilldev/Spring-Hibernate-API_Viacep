package com.project.teste.Repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.teste.Model.Usuario;


public interface UsuarioRepositorio extends JpaRepository<Usuario, String>{
		
	Optional<Usuario> findByCPF(String CPF);
}
