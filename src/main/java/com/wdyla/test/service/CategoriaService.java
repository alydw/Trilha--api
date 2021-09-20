package com.wdyla.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wdyla.test.domain.Categoria;
import com.wdyla.test.repositories.CategoriaRepository;
import com.wdyla.test.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo" + Categoria.class.getName()));
	}
	
	public List<Categoria> findAll(){
		return repository.findAll();
	}

	}

