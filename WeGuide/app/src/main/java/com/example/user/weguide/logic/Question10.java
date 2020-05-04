package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

public class Question10 extends Question {

    public Question10() {
        super();
        question.set(Language.ENGLISH.ordinal(), "How to send an image in WhatsApp?");
        question.set(Language.עברית.ordinal(), "איך לשלוח תמונה בוואטספ?");
        question.set(Language.عربى.ordinal(), "كيفية إرسال صورة في WhatsApp؟");
        question.set(Language.русский.ordinal(), "Как отправить изображение в WhatsApp?");
    }

    @Override
    public Answer answer() {
        return new Answer10();
    }
}
