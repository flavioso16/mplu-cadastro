package com.pontosmultiplus.api.service;

import java.util.List;

import com.pontosmultiplus.api.model.Usuario;

public interface UsuarioService {

	public List<Usuario> listarUsuarios();

	public Usuario buscarUsuarioPorId(Long id);

	public void deletarUsuarioPorId(Long id);
	
	public Usuario criarUsuario(Usuario usuario);
	
	public Usuario alterarUsuarioPorId(Usuario usuario, Long id);
	
}
