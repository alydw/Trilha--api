package com.wdyla.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wdyla.test.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
