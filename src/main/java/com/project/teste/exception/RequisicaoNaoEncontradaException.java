package com.project.teste.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class RequisicaoNaoEncontradaException extends RuntimeException {

    String entidade;
    private String atributo;
    private Object valor;

    public RequisicaoNaoEncontradaException(String entidade, String atributo, Object valor) {

        super(String.format("%s não encontrado com %s : '%s'", entidade, atributo, valor));

        this.entidade = entidade;
        this.atributo = atributo;
        this.valor = valor;
    }

    public String getEntidade() {
        return entidade;
    }

    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }


}
