package com.example.user.weguide.logic;

import com.example.user.weguide.R;
import com.example.user.weguide.util.AssetType;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;

public class Answer8 extends Answer {

    public Answer8() {
        super();
        answer.set(Language.ENGLISH.ordinal(), new LinkedList<Asset>());
        answer.set(Language.עברית.ordinal(), new LinkedList<Asset>());
        answer.set(Language.عربى.ordinal(), new LinkedList<Asset>());
        answer.set(Language.русский.ordinal(), new LinkedList<Asset>());

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp+ ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on an image on left bottom similar to"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על כפתור מצד שמאל בתחתית המסך הדומה ל-"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر على صورة في أسفل اليسار مماثلة ل"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на изображение слева внизу, похожее на"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.new_msg_icon + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.new_msg_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.new_msg_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.new_msg_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Pick a contact from the list"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "בחר איש קשר מהרשימה"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "اختر جهة اتصال من القائمة"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Выберите контакт из списка"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Write the message in the writing line on bottom"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "רשום את ההודעה בשורת הכתיבה בתחתית המסך"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "اكتب الرسالة في سطر الكتابة في الأسفل"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Напишите сообщение в строке письма внизу"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "To send the message click on"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לשליחת ההודעה לחץ על"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "لإرسال الرسالة اضغط على"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Чтобы отправить сообщение, нажмите на"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.send + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.send + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.send + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.send + ""));

    }
}
