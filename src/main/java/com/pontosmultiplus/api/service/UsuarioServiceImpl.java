package com.pontosmultiplus.api.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.pontosmultiplus.api.model.Genero;
import com.pontosmultiplus.api.model.Parceiro;
import com.pontosmultiplus.api.model.Pontos;
import com.pontosmultiplus.api.model.TipoTransacao;
import com.pontosmultiplus.api.model.Usuario;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {
	
	@Override
	public List<Usuario> listarUsuarios() {
		
		Usuario contato = new Usuario("Contato", "Um", "123.456.789-00", "contato.um@gmail.com",
				LocalDate.of(2000, 1, 1), Genero.MASCULINO, null);
		contato.setId(1L);
		
		Parceiro parceiro = new Parceiro(contato, Lists.newArrayList(), "Parceiro", "43.273.931/0001-76");
		parceiro.setId(2L);
		
		Pontos pontos1 = new Pontos(parceiro, LocalDate.now(), LocalDate.now(), 3000L, TipoTransacao.ACUMULO);
		pontos1.setId(3L);
		
		Pontos pontos2 = new Pontos(parceiro, LocalDate.now(), LocalDate.now(), 2000L, TipoTransacao.ACUMULO);
		pontos2.setId(4L);
		
		Pontos pontos3 = new Pontos(parceiro, LocalDate.now(), LocalDate.now(), 500L, TipoTransacao.RESGATE);
		pontos3.setId(5L);

		Usuario usuario1 = new Usuario("Usuario", "Um", "123.456.789-00", "usuario.um@gmail.com",
				LocalDate.of(2000, 1, 1), Genero.MASCULINO, Lists.newArrayList(pontos1, pontos2, pontos3));
		usuario1.setId(6L);
		
		Usuario usuario2 = new Usuario("Usuario", "Dois", "987.654.321-99", "usuario.dois@gmail.com",
				LocalDate.of(2000, 1, 2), Genero.MASCULINO, Lists.newArrayList(pontos1));
		usuario2.setId(7L);

		return Lists.newArrayList(usuario1, usuario2);
	}

	@Override
	public Usuario buscarUsuarioPorId(Long id) {
		return this.listarUsuarios().get(0);
	}

	@Override
	public void deletarUsuarioPorId(Long id) {
		// Não implementado
	}

	@Override
	public Usuario criarUsuario(Usuario usuario) {
		return this.listarUsuarios().get(0);
	}

	@Override
	public Usuario alterarUsuarioPorId(Usuario usuario, Long id) {
		return this.listarUsuarios().get(0);
	}

}
