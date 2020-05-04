package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

public class Question6 extends Question {

	public Question6() {
		super();
		question.set(Language.ENGLISH.ordinal(), "How to take a photo?");
		question.set(Language.עברית.ordinal(), "איך לצלם תמונה?");
		question.set(Language.عربى.ordinal(), "كيف تلتقط صورة؟");
		question.set(Language.русский.ordinal(), "Как сделать фото？");
	}

	@Override
	public Answer answer() {
		return new Answer6();
	}
}
