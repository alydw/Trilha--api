package com.wdyla.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdyla.test.domain.Livro;
import com.wdyla.test.repositories.LivroRepository;
import com.wdyla.test.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;

	@Autowired
	private CategoriaService categoriaService;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo" + Livro.class.getName()));
	}

	public List<Livro> findAll(Integer id_cat) {
		categoriaService.findById(id_cat);
		return repository.findAllByCategoria(id_cat);
}

	public Livro update(Integer id, Livro obj) {
		Livro newObj = findById(id);
		updateData(newObj, obj);
		return repository.save(newObj);
	}

	private void updateData(Livro newObj, Livro obj) {
		newObj.setTitulo(obj.getTitulo());
		newObj.setNomeAutor(obj.getNomeAutor());
		newObj.setTexto(obj.getTexto());
	}

}
	









	