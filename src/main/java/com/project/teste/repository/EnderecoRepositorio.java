package com.project.teste.repository;

import com.project.teste.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnderecoRepositorio extends JpaRepository<Endereco, String> {


    List<Endereco> findAllByUsuarioCPF(String CPF);

}
