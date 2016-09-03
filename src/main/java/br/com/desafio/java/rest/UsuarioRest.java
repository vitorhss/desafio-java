package br.com.desafio.java.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.java.domain.Usuario;
import br.com.desafio.java.exception.BusinessException;
import br.com.desafio.java.service.UsuarioService;
import br.com.desafio.java.vo.ErrorVO;
import br.com.desafio.java.vo.MessageVO;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRest extends AbstractRest {
	
	@Autowired
	UsuarioService usuarioService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> listar() {
		return responseOk(usuarioService.listar());
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<MessageVO> cadastrar(@RequestBody Usuario usuario){
		return responseOk(usuarioService.cadastrar(usuario));
	}
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<ErrorVO> validationError(BusinessException exception){
		return new ResponseEntity<ErrorVO>(new ErrorVO("Erro de negocio", exception.getMessage()), HttpStatus.BAD_REQUEST);
	}
}
