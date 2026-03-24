package com.project.teste.Service;


import com.project.teste.Dto.EnderecoRequest;
import com.project.teste.Dto.EnderecoResponse;
import com.project.teste.Exception.RequisicaoNaoEncontradaException;
import com.project.teste.Interface.iEnderecoService;
import com.project.teste.Model.Endereco;
import com.project.teste.Model.Usuario;
import com.project.teste.Repositorio.EnderecoRepositorio;
import com.project.teste.Repositorio.UsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnderecoService {

    private final iEnderecoService cepService;
    private final EnderecoRepositorio enderecoRepositorio;
    private final UsuarioRepositorio usuarioRepositorio;

    public EnderecoService(iEnderecoService cepService,
                           EnderecoRepositorio enderecoRepositorio,
                           UsuarioRepositorio usuarioRepositorio) {
        this.cepService = cepService;
        this.enderecoRepositorio = enderecoRepositorio;
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public EnderecoResponse criarEndereco(EnderecoRequest request) {

        Usuario usuario = usuarioRepositorio.findByCPF(request.getCpf())
                .orElseThrow(() -> new RequisicaoNaoEncontradaException("Usuario", "CPF", request.getCpf()));

        Endereco endereco = cepService.buscarPeloCep(request.getCep());

        endereco.setNumero(request.getNumero());
        endereco.setComplemento(request.getComplemento());
        endereco.setUsuario(usuario);

        enderecoRepositorio.save(endereco);

        return new EnderecoResponse(endereco);
    }

    public EnderecoResponse buscarPorCep(String cep, String numero, String complemento) {

        Endereco endereco = cepService.buscarPeloCep(cep);

        if (endereco == null) {
            throw new RequisicaoNaoEncontradaException("Endereco", "CEP", cep);
        }

        endereco.setNumero(numero);
        endereco.setComplemento(complemento);

        return new EnderecoResponse(endereco);
    }

    public List<EnderecoResponse> buscarPorCpf(String cpf) {

        List<Endereco> enderecos = enderecoRepositorio.findAllByUsuarioCPF(cpf);

        if (enderecos == null || enderecos.isEmpty()) {
            throw new RequisicaoNaoEncontradaException("Usuario", "CPF", cpf);
        }

        List<EnderecoResponse> listaResponse = new ArrayList<EnderecoResponse>();

        for (Endereco endereco : enderecos) {
            EnderecoResponse response = new EnderecoResponse(endereco);
            listaResponse.add(response);
        }

        return listaResponse;
    }
}
