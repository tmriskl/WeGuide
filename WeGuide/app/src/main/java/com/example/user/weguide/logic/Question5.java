package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

/**
 * Created by User on 01/06/2019.
 */

public class Question5 extends Question {

    public Question5() {
        super();
        question.set(Language.ENGLISH.ordinal(), "How to mute the ringtone?");
        question.set(Language.עברית.ordinal(), "איך להשתיק את הצלצול?");
        question.set(Language.عربى.ordinal(), "كيفية كتم النغمة؟");
        question.set(Language.русский.ordinal(), "Как отключить мелодию？");
    }

    @Override
    public Answer answer() {
        return new Answer5();
    }
}
