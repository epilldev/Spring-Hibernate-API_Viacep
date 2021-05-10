package com.project.teste.Model;

import java.time.LocalDate;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.project.teste.Controller.UsuarioController;

@SuppressWarnings("serial")
@Entity
@Table(name = "USUARIO")
public class Usuario extends AbstractEntity<Long> {

		
	@Column(nullable = false, unique = false)
	private String nome;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, unique = true)
	private String CPF;
	
	@Column(name= "data_nascimento", nullable = false, columnDefinition = "DATE")
	private LocalDate dataNascimento;
	
	public Usuario(){
	}	
	
	public Usuario(String nome, String email, String cpf, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.CPF = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	
}
