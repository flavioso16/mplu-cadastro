package com.pontosmultiplus.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pontosmultiplus.api.model.Usuario;
import com.pontosmultiplus.api.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UserController {

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> listarUsuarios() {
		return new ResponseEntity<>(usuarioService.listarUsuarios(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Usuario> buscarUsuario(@PathVariable Long id) {
		return new ResponseEntity<>(usuarioService.buscarUsuarioPorId(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletarUsuario(@PathVariable Long id) {
		usuarioService.deletarUsuarioPorId(id);
        return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
		return new ResponseEntity<>(usuarioService.criarUsuario(usuario), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Usuario> alterarUsuario(@RequestBody Usuario usuario, @PathVariable Long id) {
		usuarioService.alterarUsuarioPorId(usuario, id);
		return ResponseEntity.noContent().build();
	}

}
