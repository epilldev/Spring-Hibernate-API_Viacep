package com.project.teste.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.BAD_REQUEST)

public class RequisicaoFailedException extends RuntimeException {
	   
	    String entidade;
	    private String atributo;
	    private Object valor;

	    public RequisicaoFailedException(String entidade, String atributo, Object valor) {
	        
	    super(String.format("Ocorreu um erro na requisição ao tentar localizar o %s não encontrado com %s : '%s'", entidade, atributo, valor));	
	    
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
