package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

public class Question11 extends Question {

    public Question11() {
        super();
        question.set(Language.ENGLISH.ordinal(), "How to send an SMS?");
        question.set(Language.עברית.ordinal(), "איך לשלוח SMS?");
        question.set(Language.عربى.ordinal(), "كيف ترسل رسالة قصيرة؟");
        question.set(Language.русский.ordinal(), "Как отправить смс?");
    }

    @Override
    public Answer answer() {
        return new Answer11();
    }
}
