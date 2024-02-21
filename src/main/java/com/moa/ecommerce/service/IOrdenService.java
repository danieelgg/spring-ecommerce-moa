package com.moa.ecommerce.service;

import java.util.List;

import com.moa.ecommerce.model.Orden;

public interface IOrdenService {
	List<Orden> findAll();
	Orden save(Orden orden);

}
