package com.example.user.weguide.logic;

import com.example.user.weguide.util.Language;

public class Question12 extends Question {

    public Question12() {
        super();
        question.set(Language.ENGLISH.ordinal(), "How to edit a phone number  of a contact?");
        question.set(Language.עברית.ordinal(), "איך לערוך מספר באנשי קשר?");
        question.set(Language.عربى.ordinal(), "كيفية تعديل رقم هاتف جهة اتصال؟");
        question.set(Language.русский.ordinal(), "Как редактировать номер телефона контакта?");
    }


    @Override
    public Answer answer() {
        return new Answer12();
    }
}
