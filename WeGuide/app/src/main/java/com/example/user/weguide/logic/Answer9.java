
package com.example.user.weguide.logic;

import com.example.user.weguide.R;
import com.example.user.weguide.util.AssetType;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;

class Answer9 extends Answer {

    public Answer9() {
        super();
        answer.set(Language.ENGLISH.ordinal(), new LinkedList<Asset>());
        answer.set(Language.עברית.ordinal(), new LinkedList<Asset>());
        answer.set(Language.عربى.ordinal(), new LinkedList<Asset>());
        answer.set(Language.русский.ordinal(), new LinkedList<Asset>());

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_new_msg+ ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_new_msg + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_new_msg + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_new_msg + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "The following screen of WhatsApp appears"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "עכשיו מופיע המסך הבא של WhatsApp"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "تظهر شاشة WhatsApp التالية"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Появится следующий экран WhatsApp"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_list+ ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_list + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_list + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_list + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on the line that has a small camera icon in it"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לחץ על השורה בה מופיעה תמונה קטנה של מצלמה"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق السطر الذي يحتوي على رمز كاميرا صغيرة فيه"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на строку с маленьким значком камеры"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_camera_icon+ ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_camera_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_camera_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.whatsapp_camera_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "The picture should appear now in your screen. click on it to maximize its size."));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "התמונה אמורה להופיע כעת במסך שלך. לחץ עליה כדי להגדיל אותה."));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "يجب أن تظهر الصورة الآن على الشاشة. اضغط عليها لزيادة حجمها."));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Изображение должно появиться на вашем экране. нажмите на него, чтобы увеличить его размер"));

    }
}