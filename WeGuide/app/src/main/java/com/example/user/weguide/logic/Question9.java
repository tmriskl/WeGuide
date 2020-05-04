package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

public class Question9 extends Question {

    public Question9() {
        super();
        question.set(Language.ENGLISH.ordinal(), "How to receive a picture in WhatsApp?");
        question.set(Language.עברית.ordinal(), "איך לקבל תמונה בוואטסאפ?");
        question.set(Language.عربى.ordinal(), "كيفية الحصول على صورة في WhatsApp؟");
        question.set(Language.русский.ordinal(), "Как получить картинку в WhatsApp?");
    }

    @Override
    public Answer answer() {
        return new Answer9();
    }
}