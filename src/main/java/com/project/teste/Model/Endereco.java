package com.project.teste.Model;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECO")
public class Endereco extends AbstractEntity<Long> {

		
	@Column(nullable = false, unique = false)
	private String logradouro;

	@Column(nullable = false, unique = false)
	private String numero;

	@Column(nullable = false, unique = false)
	private String complemento;

	@Column(nullable = false, unique = false)
	private String bairro;

	@Column(nullable = false, unique = false)
	private String localidade;

	@Column(nullable = false, unique = false)
	private String uf;

	@Column(nullable = false, unique = false)
	private String cep;

	@ManyToOne
	@JoinColumn(name = "CPF")
	private Usuario usuario;

	
	public Endereco(String logradouro, String numero, String complemento, String bairro, String localidade, String uf,
			String cep, Usuario usuario) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.cep = cep;
		this.usuario = usuario;
	}
	public Endereco(){
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Optional<Usuario> getUsuario() {
		return Optional.ofNullable(usuario);
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}
