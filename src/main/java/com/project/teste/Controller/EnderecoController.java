package com.project.teste.Controller;

import com.project.teste.Dto.EnderecoRequest;
import com.project.teste.Dto.EnderecoResponse;
import com.project.teste.Service.EnderecoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    /*
     * Criar endereço
     */
    @PostMapping
    public ResponseEntity<EnderecoResponse> criar(@RequestBody EnderecoRequest request) {

        EnderecoResponse response = enderecoService.criarEndereco(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    /*
     * Buscar endereço por CEP
     */
    @GetMapping("/cep/{cep}")
    public ResponseEntity<EnderecoResponse> buscarPorCep(
            @PathVariable String cep,
            @RequestParam String numero,
            @RequestParam(required = false) String complemento) {

        EnderecoResponse response = enderecoService.buscarPorCep(cep, numero, complemento);

        return ResponseEntity.ok(response);
    }

    /*
     * Buscar endereços por CPF
     */
    @GetMapping
    public ResponseEntity<List<EnderecoResponse>> buscarPorCpf(
            @RequestParam String cpf) {

        List<EnderecoResponse> lista = enderecoService.buscarPorCpf(cpf);

        return ResponseEntity.ok(lista);
    }
}