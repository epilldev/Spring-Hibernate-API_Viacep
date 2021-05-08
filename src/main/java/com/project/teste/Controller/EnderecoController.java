package com.project.teste.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.teste.Interface.iEnderecoService;
import com.project.teste.Model.Endereco;
import com.project.teste.Service.EnderecoService;




@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	
	
	Endereco endereco;

	@Autowired
    private iEnderecoService cepService;
	
	@SuppressWarnings("unused")
	@Autowired
    private EnderecoService service;
	
	
	@PostMapping("/cadastrar")
    public String cadastrar(@RequestHeader("cep")String cep, @RequestHeader("complemento")String complemento, @RequestHeader("numero")String numero){
		Endereco endereco = cepService.buscarPeloCep(cep);
		if(endereco != null) {
		   endereco.setNumero(numero);
	       endereco.setComplemento(complemento);
		}
		else {
			return null;
		}		
		
        return endereco.getCep();
	}
	

    @GetMapping("/getCep")
    public ResponseEntity<Endereco> getCep(@RequestHeader("cep")String cep, @RequestHeader("complemento")String complemento, @RequestHeader("numero")String numero) {

        Endereco endereco = cepService.buscarPeloCep(cep);
        endereco.setNumero(numero);
        endereco.setComplemento(complemento);

    return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build(); 
   
    }
}
