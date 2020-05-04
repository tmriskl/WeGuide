package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

public class Question3 extends Question {

	public Question3() {
		super();
		question.set(Language.ENGLISH.ordinal(), "How to delete a contact?");
		question.set(Language.עברית.ordinal(), "איך למחוק איש קשר?");
		question.set(Language.عربى.ordinal(), "كيفية حذف جهة اتصال؟");
		question.set(Language.русский.ordinal(), "Как удалить контакт？");
	}

	@Override
	public Answer answer() {
		return new Answer3();
	}
}
