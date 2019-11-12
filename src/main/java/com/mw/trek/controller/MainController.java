package com.mw.trek.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mw.trek.model.Quiz;
import com.mw.trek.service.QuizServiceImpl;

@RestController
public class MainController {

		@Autowired
		private QuizServiceImpl quizServiceImpl;
		
		@CrossOrigin
		@PostMapping("/quizzes")
		public void saveQuiz(Quiz quiz) {
			quizServiceImpl.saveQuiz(quiz);
		}
		
		@CrossOrigin
		@GetMapping("/quiz/{id}")
		public Quiz getQuiz(@PathVariable Long id) {
			return quizServiceImpl.getQuizUsingId(id);
		}
		
		@CrossOrigin
		@GetMapping("/quizzes")
		public ArrayList<Quiz> getAllQuizzes() {
			return quizServiceImpl.getAll();
		}
		
		@CrossOrigin
		@DeleteMapping("/quiz/{id}")
		public void deleteQuiz(@PathVariable Long id) {
			quizServiceImpl.deleteQuizUsingId(id);
		}
		
		
}
