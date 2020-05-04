package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

public class Question8 extends Question {

    public Question8() {
        super();
        question.set(Language.ENGLISH.ordinal(), "How to send a WhatsApp message?");
        question.set(Language.עברית.ordinal(), "איך לשלוח הודעת וואטסאפ?");
        question.set(Language.عربى.ordinal(), "كيفية إرسال رسالة WhatsApp؟");
        question.set(Language.русский.ordinal(), "Как отправить сообщение WhatsApp?？");
    }

    @Override
    public Answer answer() {
        return new Answer8();
    }
}
