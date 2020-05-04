package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

/**
 * Created by User on 01/06/2019.
 */

public class Question4 extends Question {

    public Question4() {
        super();
        question.set(Language.ENGLISH.ordinal(), "How to call?");
        question.set(Language.עברית.ordinal(), "איך להתקשר?");
        question.set(Language.عربى.ordinal(), "كيف تتصل؟");
        question.set(Language.русский.ordinal(), "Как позвонить？");
    }

    @Override
    public Answer answer() {
        return new Answer4();
    }
}
