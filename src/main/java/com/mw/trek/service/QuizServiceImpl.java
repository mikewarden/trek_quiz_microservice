package com.mw.trek.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mw.trek.model.Quiz;
import com.mw.trek.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizServiceInt{
	
	@Autowired
	private QuizRepository quizRepository;

	@Override
	public void saveQuiz(Quiz quiz) {
		quizRepository.save(quiz);
		
	}

	@Override
	public Quiz getQuizUsingId(Long id) {
		return quizRepository.findQuizById(id);
	}

	@Override
	public ArrayList<Quiz> getAll() {
		// TODO Auto-generated method stub
		return quizRepository.findAll();
	}

	public void deleteQuizUsingId(Long id) {
		quizRepository.deleteById(id);
		
	}

	

}
