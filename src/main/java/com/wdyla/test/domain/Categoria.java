package com.wdyla.test.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Categoria {

	private Integer Id;
	private String nome;
	private String descricao;

	private List<Livro> livros = new ArrayList<>();

	public Categoria() {
		super();
		
	}

	public Categoria(Integer id, String nome, String descricao) {
		super();
		Id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(Id, other.Id);
	}
	
}
