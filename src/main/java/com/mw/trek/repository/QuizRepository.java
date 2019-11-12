package com.mw.trek.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mw.trek.model.Quiz;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long>{

	public Quiz findQuizById(Long id);
	
	public ArrayList<Quiz> findAll();

}
