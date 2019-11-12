package com.mw.trek.service;

import java.util.ArrayList;

import com.mw.trek.model.Quiz;

public interface QuizServiceInt {

	public void saveQuiz(Quiz quiz);

	public Quiz getQuizUsingId(Long id);

	public ArrayList<Quiz> getAll();

}
