package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

public class Question2 extends Question {

    public Question2() {
        super();
        question.set(Language.ENGLISH.ordinal(), "How to add contacts?");
        question.set(Language.עברית.ordinal(), "איך להוסיף אנשי קשר?");
        question.set(Language.عربى.ordinal(), "كيف تضيف جهات اتصال؟");
        question.set(Language.русский.ordinal(), "Как добавить контакты？");
    }

    @Override
    public Answer answer() {
        return new Answer2();
    }
}
