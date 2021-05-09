package com.project.teste.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.teste.Interface.iEnderecoService;
import com.project.teste.Model.Endereco;
import com.project.teste.Repositorio.EnderecoRepositorio;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	@Autowired
	private iEnderecoService cepService;

	@Autowired
	private EnderecoRepositorio repositorio;

	@PostMapping("/cadastrar")
	public Endereco cadastrar(@RequestHeader("cep") String cep, @RequestHeader("complemento") String complemento,
			@RequestHeader("numero") String numero) {

		Endereco endereco = cepService.buscarPeloCep(cep);
		if (endereco != null) {
			endereco.setNumero(numero);
			endereco.setComplemento(complemento);

			return repositorio.save(endereco);
		} else {
			return null;
		}

	}

	@GetMapping("/getCep")
	public ResponseEntity<Endereco> getCep(@RequestHeader("cep") String cep,
			@RequestHeader("complemento") String complemento, @RequestHeader("numero") String numero) {

		Endereco endereco = cepService.buscarPeloCep(cep);
		endereco.setNumero(numero);
		endereco.setComplemento(complemento);

		return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();

	}
}
