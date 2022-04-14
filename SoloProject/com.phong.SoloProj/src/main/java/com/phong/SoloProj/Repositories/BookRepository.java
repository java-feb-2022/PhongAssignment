package com.phong.SoloProj.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phong.SoloProj.Models.Book;

@Repository 
public interface BookRepository extends CrudRepository <Book, Long>{
	List<Book>findAll();

}
