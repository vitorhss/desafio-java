package br.com.desafio.java.service;

import java.util.List;

import br.com.desafio.java.domain.Usuario;
import br.com.desafio.java.vo.MessageVO;

public interface UsuarioService {
	List<Usuario> listar();
	MessageVO cadastrar(Usuario usuario);
}
