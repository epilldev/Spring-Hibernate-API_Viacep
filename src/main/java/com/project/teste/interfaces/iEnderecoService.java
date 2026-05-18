package com.project.teste.interfaces;

import com.project.teste.entity.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
 * Client responsável pela integração com a API ViaCEP.
 */
@FeignClient(
        url = "https://viacep.com.br/ws/",
        name = "viacep"
)
public interface iEnderecoService {

    /*
     * Realiza consulta de endereço pelo CEP.
     */
    @GetMapping("{cep}/json")
    Endereco buscarPeloCep(
            @PathVariable("cep") String cep
    );
}