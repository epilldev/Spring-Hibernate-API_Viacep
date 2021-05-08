package com.project.teste.Interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.teste.Model.Endereco;

@FeignClient(url= "https://viacep.com.br/ws/" , name = "viacep")
public interface iEnderecoService {

	 @GetMapping("{cep}/json")
	  Endereco buscarPeloCep(@PathVariable("cep") String cep);
}