package com.example.user.weguide.logic;

import com.example.user.weguide.R;
import com.example.user.weguide.util.AssetType;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;

public class Answer7 extends Answer {

	public Answer7() {
		super();
		answer.set(Language.ENGLISH.ordinal(), new LinkedList<Asset>());
		answer.set(Language.עברית.ordinal(), new LinkedList<Asset>());
		answer.set(Language.عربى.ordinal(), new LinkedList<Asset>());
		answer.set(Language.русский.ordinal(), new LinkedList<Asset>());

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on the gallery icon on the screen"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על אייקון גלריית התמונות במסך"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر على أيقونة المعرض على الشاشة"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на значок галереи на экране"));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.gallery + ""));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.gallery + ""));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.gallery + ""));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.gallery + ""));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Choose album to view"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "בחר אלבום להצגה"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "اختيار الألبوم لعرضه"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Выберите альбом для просмотра"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.albums + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.albums + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.albums + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.albums + ""));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "\nClick on the image you want"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "\nלחץ על התמונה הרצויה"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "\nانقر على الصورة التي تريدها"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "\nНажмите на изображение, которое вы хотите"));

        answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.selectphoto + ""));
        answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.selectphoto + ""));
        answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.selectphoto + ""));
        answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.selectphoto + ""));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "\nBrowse through photos with pleasure\n"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "\nדפדף בתמונות בהנאה\n"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "\nتصفح الصور بسرور\n"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "\nПросматривайте фотографии с удовольствием\n"));
	}
}
