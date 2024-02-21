package com.moa.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moa.ecommerce.model.Usuario;
import com.moa.ecommerce.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public Optional<Usuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}
	
	

}
