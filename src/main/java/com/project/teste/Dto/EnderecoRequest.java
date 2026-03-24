package com.project.teste.Dto;

import javax.validation.constraints.NotBlank;


public class EnderecoRequest {

    @NotBlank
    private String cep;

    @NotBlank
    private String numero;

    private String complemento;

    @NotBlank
    private String cpf;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}