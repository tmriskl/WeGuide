package com.example.user.weguide.logic;

import com.example.user.weguide.R;
import com.example.user.weguide.util.AssetType;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;

public class Answer6 extends Answer {

	public Answer6() {
		super();
		answer.set(Language.ENGLISH.ordinal(), new LinkedList<Asset>());
		answer.set(Language.עברית.ordinal(), new LinkedList<Asset>());
		answer.set(Language.عربى.ordinal(), new LinkedList<Asset>());
		answer.set(Language.русский.ordinal(), new LinkedList<Asset>());

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on the camera icon on the screen"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על אייקון המצלמה במסך"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر على أيقونة الكاميرا على الشاشة"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "нажмите на Значок камеры на экране"));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camera + ""));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camera + ""));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camera + ""));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camera + ""));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click in the center of the screen to focus"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לחץ במרכז המסך כדי לעשות פוקוס"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر في وسط الشاشة للتركيز"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите в центре экрана, чтобы сосредоточиться"));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camerafocus + ""));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camerafocus + ""));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camerafocus + ""));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camerafocus + ""));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click the large circular button at the bottom of the screen"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לחץ על הכפתור העגול הגדול בתחתית המסך"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر على زر دائري كبير في أسفل الشاشة"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите большую круглую кнопку внизу экрана"));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camerascreen + ""));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camerascreen + ""));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camerascreen + ""));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.camerascreen + ""));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "\nThat is it. You have finished taking a photo. Now you can see it in Photo Gallery\n"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "\nזהו. סיימת לצלם תמונה. עכשיו תוכל/י לראות אותה בגלריית התמונות\n"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "\nهذا هو. لقد انتهيت من التقاط صورة. يمكنك الآن رؤيته في معرض الصور\n"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "\nВот и все. Вы закончили фотографировать. Теперь вы можете увидеть это в фотогалерее\n"));
	}
}
