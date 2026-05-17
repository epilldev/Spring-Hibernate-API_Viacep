package com.project.teste.Service;

import com.project.teste.Dto.UsuarioRequest;
import com.project.teste.Dto.UsuarioResponse;
import com.project.teste.Model.Usuario;
import com.project.teste.Repositorio.UsuarioRepositorio;
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
        usuario.setCPF(request.getCpf());
        usuario.setDataNascimento(request.getDataNascimento());

        usuario = repositorio.save(usuario);

        return new UsuarioResponse(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getCPF(),
                usuario.getDataNascimento()
        );
    }
}
