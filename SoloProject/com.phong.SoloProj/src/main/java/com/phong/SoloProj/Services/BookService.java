package com.phong.SoloProj.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phong.SoloProj.Models.Book;
import com.phong.SoloProj.Repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo; 
	
	public List<Book>allBooks() {
		return bookRepo.findAll(); 
	}
	
	public Book createBook(Book book) {
		return bookRepo.save(book); 
	}
	public void deleteShow(Long id) {
		bookRepo.deleteById(id);
	}
	
	public void delete(Long id) {
		bookRepo.deleteById(id);
	}
	
	
	
	public Book getOneBook(Long id) {
		return bookRepo.findById(id).orElse(null); 
	}
	public Book updateBook(Book book) {
		return bookRepo.save(book); 
	} 
}
