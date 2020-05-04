package com.example.user.weguide.logic;

import java.util.LinkedList;
import java.util.List;

import com.example.user.weguide.util.Language;

public abstract class Question {
	
	protected List<String> question;
	
	public Question() {
		question = new LinkedList<>();
		for (int i = 0; i < Language.values().length; i++) {
			question.add(Language.values()[i].name().toUpperCase());
		}
	}
	
	public abstract Answer answer();

	public List<String> getQuestion() {
		return question;
	}

	public void setQuestion(List<String> question) {
		this.question = question;
	}

}
