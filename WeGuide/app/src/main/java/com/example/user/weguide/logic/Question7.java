package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

public class Question7 extends Question {

	public Question7() {
		super();
		question.set(Language.ENGLISH.ordinal(), "How to see photos?");
		question.set(Language.עברית.ordinal(), "איך לראות תמונות?");
		question.set(Language.عربى.ordinal(), "كيف ترى الصور؟");
		question.set(Language.русский.ordinal(), "Как посмотреть фото？");
	}

	@Override
	public Answer answer() {
		return new Answer7();
	}
}
