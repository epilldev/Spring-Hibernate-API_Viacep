package com.project.teste.service;

import com.project.teste.dto.UsuarioRequest;
import com.project.teste.dto.UsuarioResponse;
import com.project.teste.entity.Usuario;
import com.project.teste.repository.UsuarioRepositorio;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepositorio repositorio;

    public UsuarioService(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public UsuarioResponse cadastrar(UsuarioRequest request) {

        Usuario usuario = new Usuario();

        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());
        usuario.setCpf(request.getCpf());
        usuario.setDataNascimento(request.getDataNascimento());

        usuario = repositorio.save(usuario);

        return new UsuarioResponse(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getCpf(),
                usuario.getDataNascimento()
        );
    }
}
