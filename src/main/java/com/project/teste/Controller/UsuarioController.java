package com.project.teste.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import com.project.teste.Model.Usuario;
import com.project.teste.Repositorio.UsuarioRepositorio;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepositorio repositorio;

	@PutMapping("/cadastrar")
	public ResponseEntity<Usuario> cadastrar(@RequestHeader("nome") String nome, @RequestHeader("email") String email,
			@RequestHeader("CPF") String CPF, @RequestHeader("dataNascimento") String dataNascimento) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(dataNascimento, formatter);

		try {
			Usuario cadastro = new Usuario(nome, email, CPF, date);

			cadastro = repositorio.save(cadastro);

			if (cadastro != null) {
				return new ResponseEntity<>(cadastro, HttpStatus.CREATED);
			}
		} catch (Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}

	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	try {
		if (CPF != null) {
			return new ResponseEntity<Usuario>(repositorio.findByCPF(CPF), HttpStatus.OK);
		}
	} catch (Exception ex) {
		return new ResponseEntity<Usuario>(repositorio.findById(CPF) .orElseThrow(() -> new
					 RequisicaoNaoEncontradaException("Usuario", "CPF", CPF)), HttpStatus.BAD_REQUEST);
		
	}
	return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
*/
