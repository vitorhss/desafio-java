package br.com.desafio.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.java.domain.Usuario;
import br.com.desafio.java.exception.BusinessException;
import br.com.desafio.java.repository.UsuarioRepository;
import br.com.desafio.java.service.UsuarioService;
import br.com.desafio.java.vo.MessageVO;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}

	@Override
	public MessageVO cadastrar(Usuario usuario) {
		if (usuarioRepository.findByEmail(usuario.getEmail()) !=null){
			throw new BusinessException("Já existe um usuário para o e-mail informado");
		}
		usuarioRepository.save(usuario);
		return new MessageVO("Sucesso", "Usuario Cadastrado com Sucesso");
	}
}
