package com.example.user.weguide.logic;

import com.example.user.weguide.R;
import com.example.user.weguide.util.AssetType;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;

/**
 * Created by User on 01/06/2019.
 */

class Answer5 extends Answer {

    public Answer5() {
        super();
        answer.set(Language.ENGLISH.ordinal(), new LinkedList<Asset>());
        answer.set(Language.עברית.ordinal(), new LinkedList<Asset>());
        answer.set(Language.عربى.ordinal(), new LinkedList<Asset>());
        answer.set(Language.русский.ordinal(), new LinkedList<Asset>());

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Touch the top of the main phone screen and move your finger down while touching the screen"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "גע בחלק העליון של מסך הטלפון הראשי והזז את האצבע למטה תוך כדי נגיעה במסך"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "المس الجزء العلوي من شاشة الهاتف الرئيسية وحرك إصبعك لأسفل أثناء لمس الشاشة"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Коснитесь верхней части основного экрана телефона и переместите палец вниз, касаясь экрана."));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Search for one of these icons"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "חפש/י את אחד מהסמלים האלה"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "ابحث عن أحد هذه الرموز"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Искать одну из этих иконок"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.ringtone_icon + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.ringtone_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.ringtone_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.ringtone_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.vibrate_icon + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.vibrate_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.vibrate_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.vibrate_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.silence_icon + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.silence_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.silence_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.silence_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Touch on the icon and it will change to one of the others"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "גע בסמל והוא ישתנה לאחד מהאחרים"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "المس الرمز وسوف يتغير إلى واحد من الآخرين"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на значок, и он изменится на один из других"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Touch the icon until it change to this icon"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "גע בסמל עד שישתנה לסמל זה"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "المس الرمز حتى يتغير إلى هذا الرمز"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Коснитесь значка, пока он не изменится на этот значок"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.vibrate_icon + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.vibrate_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.vibrate_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.vibrate_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "If you want the phone to vibrate when someone calls you"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "אם את/ה רוצה שהטלפון ירטוט כאשר מישהו מתקשר אלייך"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "إذا كنت تريد أن يهتز الهاتف عندما يتصل بك شخص ما"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Если вы хотите, чтобы телефон вибрировал, когда вам звонят"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Or to this icon"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "או לסמל זה"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "أو إلى هذا الرمز"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Или к этой иконке"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.silence_icon + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.silence_icon + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.silence_icon + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.silence_icon + ""));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "If you want the phone to be completely silence when someone calls you"));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "אם את/ה רוצה שהטלפון יהיה שקט לחלוטין כאשר מישהו מתקשר אלייך"));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "إذا كنت تريد أن يكون الهاتف صامتًا تمامًا عندما يتصل بك شخص ما"));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Если вы хотите, чтобы телефон был совершенно беззвучным, когда вам звонят"));

    }
}
