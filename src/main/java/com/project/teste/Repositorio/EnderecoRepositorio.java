package com.project.teste.Repositorio;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.teste.Model.Endereco;

public interface EnderecoRepositorio extends JpaRepository<Endereco, String> {
	
	List<Endereco> findAllByusuario(String usuario);

}
