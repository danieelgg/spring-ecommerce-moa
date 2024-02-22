package com.moa.ecommerce.service;

import java.util.Optional;

import com.moa.ecommerce.model.Usuario;

public interface IUsuarioService {
	Optional<Usuario> findById(Integer Id);
	Usuario save (Usuario usuario);
	Optional<Usuario> findByEmail(String email);
	

}
