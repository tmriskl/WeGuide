package com.example.user.weguide.logic;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import com.example.user.weguide.util.Language;

public abstract class Answer implements Serializable{
	
	protected List<List<Asset>> answer;

	public Answer() {
		answer = new LinkedList<>();
		for (int i = 0; i < Language.values().length; i++) {
			answer.add(new LinkedList<Asset>());
		}
	}

	public List<List<Asset>> getAnswer() {
		return answer;
	}



}
