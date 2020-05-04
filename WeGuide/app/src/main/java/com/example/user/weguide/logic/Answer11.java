package com.example.user.weguide.logic;

import com.example.user.weguide.R;
import com.example.user.weguide.util.AssetType;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;

class Answer11 extends Answer {

    public Answer11() {
        super();
        answer.set(Language.ENGLISH.ordinal(), new LinkedList<Asset>());
        answer.set(Language.עברית.ordinal(), new LinkedList<Asset>());
        answer.set(Language.عربى.ordinal(), new LinkedList<Asset>());
        answer.set(Language.русский.ordinal(), new LinkedList<Asset>());

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.sms_button + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.sms_button + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.sms_button + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.sms_button + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.new_sms + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.new_sms + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.new_sms + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.new_sms + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Pick a contact and write your message"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "בחר איש קשר ורשום את ההודעה"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "اختر جهة اتصال واكتب رسالتك"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Выберите контакт и напишите ваше сообщение"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on Send"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לחץ על שליחה"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق إرسال"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на Отправить"));



    }
}
