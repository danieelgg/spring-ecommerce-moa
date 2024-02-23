package com.moa.ecommerce.service;

import java.util.List;

import com.moa.ecommerce.model.Orden;
import com.moa.ecommerce.model.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Orden save(Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);

}
