package br.com.rafaelmaia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelmaia.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}
