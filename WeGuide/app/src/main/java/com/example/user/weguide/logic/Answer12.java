package com.example.user.weguide.logic;

import com.example.user.weguide.R;
import com.example.user.weguide.util.AssetType;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;

class Answer12 extends Answer {

    public Answer12() {
        super();
        answer.set(Language.ENGLISH.ordinal(), new LinkedList<Asset>());
        answer.set(Language.עברית.ordinal(), new LinkedList<Asset>());
        answer.set(Language.عربى.ordinal(), new LinkedList<Asset>());
        answer.set(Language.русский.ordinal(), new LinkedList<Asset>());

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts_icon + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "A list of your contacts should appear"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "כעת תופיע רשימת אנשי הקשר שלך"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "يجب أن تظهر قائمة جهات الاتصال الخاصة بك"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Должен появиться список ваших контактов"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts_list + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts_list + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts_list + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts_list + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Choose a contact by clicking on its name"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "בחר איש קשר על-ידי לחיצה על השם שמופיע"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "اختر جهة اتصال من خلال النقر على اسمها"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Выберите контакт, нажав на его имя"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on Edit button"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לחץ על כפתור עריכה"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر على زر تحرير"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на кнопку Изменить"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.edit + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.edit + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.edit + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.edit + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Choose in the form the details you wish to edit"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "בחר מתוך הטופס את הפרטים אותם תרצה לערוך"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "اختر في النموذج التفاصيل التي ترغب في تعديلها"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Выберите в форме детали, которые вы хотите редактировать"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.edit_contact_form + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.edit_contact_form + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.edit_contact_form + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.edit_contact_form + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Type in the new details"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "הקלד את הפרטים החדשים"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "اكتب التفاصيل الجديدة"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Введите новые детали"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on Confirm and you're done"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לחץ על אישור"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر على تأكيد وانت القيام به"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на Подтвердить, и все готово"));




    }
}
