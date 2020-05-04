package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

public class Question1 extends Question {

	public Question1() {
		super();
		question.set(Language.ENGLISH.ordinal(), "How to connect to the internet?");
		question.set(Language.עברית.ordinal(), "איך להתחבר לאינטרנט?");
		question.set(Language.عربى.ordinal(), "كيفية الاتصال بالإنترنت؟");
		question.set(Language.русский.ordinal(), "Как настраивать для подключения к Интернету？");
	}

	@Override
	public Answer answer() {
		return new Answer1();
	}
}
