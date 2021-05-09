package com.project.teste.Controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import com.project.teste.Exception.RequisicaoNaoEncontradaException;
import com.project.teste.Model.Usuario;
import com.project.teste.Repositorio.UsuarioRepositorio;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepositorio repositorio;

	@PostMapping("/cadastrar")
	public Usuario cadastrar(@RequestHeader("nome") String nome, @RequestHeader("email") String email,
			@RequestHeader("CPF") String CPF, @RequestHeader("dataNascimento") LocalDate dataNascimento) {

		Usuario cadastro = new Usuario(nome, email, CPF, dataNascimento);

		return repositorio.save(cadastro);
	}

	@GetMapping("/buscar")
	public Usuario buscarPeloId(@RequestHeader("CPF") Long CPF) {
		if (CPF != null) {
			return repositorio.findById(CPF).orElseThrow(() -> new RequisicaoNaoEncontradaException("Usuario", "CPF", CPF));
		} 
		else {
			return null;
		}
	}
}
