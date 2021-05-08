package com.project.teste.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.teste.Model.Usuario;
import com.project.teste.Service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	Usuario usuario;
	
	@SuppressWarnings("unused")
	@Autowired
    private UsuarioService service;	
	
	
	@PostMapping("/cadastrar")
    public String cadastrar(Model model, Usuario usuario){
		
	//	Usuario cadastro = service.calcular(usuario);
		
    //model.addAttribute("cadastro",cadastro);
        return "/chamadas/calculo";
	}
}
