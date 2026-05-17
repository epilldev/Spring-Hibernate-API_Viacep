package com.project.teste.dto;

import java.time.LocalDate;

public class UsuarioResponse {

    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataNascimento;

    public UsuarioResponse() {
    }

    public UsuarioResponse(Long id,
                           String nome,
                           String email,
                           String cpf,
                           LocalDate dataNascimento) {

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
