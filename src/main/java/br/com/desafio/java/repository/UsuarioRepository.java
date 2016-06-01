package br.com.desafio.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.java.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

}
