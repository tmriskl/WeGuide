package com.example.user.weguide.logic;

import com.example.user.weguide.R;
import com.example.user.weguide.util.AssetType;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;

class Answer2 extends Answer {

    public Answer2() {
        super();
        answer.set(Language.ENGLISH.ordinal(), new LinkedList<Asset>());
        answer.set(Language.עברית.ordinal(), new LinkedList<Asset>());
        answer.set(Language.عربى.ordinal(), new LinkedList<Asset>());
        answer.set(Language.русский.ordinal(), new LinkedList<Asset>());

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon+ ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Type a phone number using the digits"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "הקלד מספר טלפון בעזרת מקשי הספרות "));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "اكتب رقم الهاتف باستخدام الأرقام"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Введите номер телефона, используя цифры"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.keyboard+ ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.keyboard + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.keyboard + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.keyboard + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on New Contact"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על איש קשר חדש"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق جهة اتصال جديدة"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на новый контакт"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Fill the details of your contact in the following form"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "מלא את הפרטים של איש הקשר שלך בטופס הבא"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "ملء تفاصيل الاتصال الخاصة بك في النموذج التالي"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Заполните данные вашего контакта в следующей форме"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contact_form+ ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contact_form + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contact_form + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contact_form + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Press the V on the top of the screen. That is it. The contact saved"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לחץ על ה-V למעלה במסך. זהו איש הקשר נשמר"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "اضغط على الخامس في الجزء العلوي من الشاشة. هذا هو. تم حفظ جهة الاتصال"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите V в верхней части экрана. Вот и все. контакт сохранен"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contactdone+ ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contactdone + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contactdone + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contactdone + ""));
    }

}
