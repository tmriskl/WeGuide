package com.example.user.weguide.logic;

import com.example.user.weguide.R;
import com.example.user.weguide.util.AssetType;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;

/**
 * Created by User on 01/06/2019.
 */

class Answer4 extends Answer {

    public Answer4() {
        super();
        answer.set(Language.ENGLISH.ordinal(), new LinkedList<Asset>());
        answer.set(Language.עברית.ordinal(), new LinkedList<Asset>());
        answer.set(Language.عربى.ordinal(), new LinkedList<Asset>());
        answer.set(Language.русский.ordinal(), new LinkedList<Asset>());

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on this icon in your phone"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לחץ/י על סמל זה בטלפון שלך"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق هذا الرمز في هاتفك"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на этот значок в вашем телефоне"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "If you do not see it click on this icon in your phone"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "אם אינך רואה אותו, לחץ/י על סמל זה בטלפון שלך"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "إذا كنت لا ترى ذلك ، فانقر فوق هذا الرمز في هاتفك"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Если вы не видите его, нажмите на этот значок в вашем телефоне"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.apps_icon + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.apps_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.apps_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.apps_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "And search for this icon"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "וחפש את הסמל הזה"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "وابحث عن هذا الرمز"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "И искать эту иконку"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "It will open a screen like this"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "הוא יפתח מסך כזה"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "سيتم فتح شاشة مثل هذا"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Откроется такой экран"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_screen + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_screen + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_screen + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.call_screen + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Type the number you want to call and click on the phone icon at the bottom"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "הקלד את המספר שאליו ברצונך להתקשר ולחץ על סמל הטלפון בתחתית"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "اكتب الرقم الذي تريد الاتصال به وانقر على أيقونة الهاتف في الأسفل"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Введите номер, по которому хотите позвонить, и нажмите на значок телефона внизу"));

    }
}
