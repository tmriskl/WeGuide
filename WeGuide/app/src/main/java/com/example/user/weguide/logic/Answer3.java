package com.example.user.weguide.logic;

import com.example.user.weguide.R;
import com.example.user.weguide.util.AssetType;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;

public class Answer3 extends Answer {

	public Answer3() {
		super();
		answer.set(Language.ENGLISH.ordinal(), new LinkedList<Asset>());
		answer.set(Language.עברית.ordinal(), new LinkedList<Asset>());
		answer.set(Language.عربى.ordinal(), new LinkedList<Asset>());
		answer.set(Language.русский.ordinal(), new LinkedList<Asset>());

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on the contacts icon on the screen"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על אייקון אנשי הקשר במסך"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر على أيقونة جهات الاتصال على الشاشة"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на значок контактов на экране"));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts + ""));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts + ""));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts + ""));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contacts + ""));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on the search bar and write the contact's name"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לחץ על סרגל החיפוש וכתוב את שם איש הקשר"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر على شريط البحث واكتب اسم جهة الاتصال"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на строку поиска и напишите имя контакта"));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.searchbar + ""));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.searchbar + ""));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.searchbar + ""));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.searchbar + ""));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Long press on the contact's name"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לחץ לחיצה ארוכה על שם איש הקשר"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "الضغط لفترة طويلة على اسم جهة الاتصال\n"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Длительное нажатие на имя контакта"));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contactslist + ""));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contactslist + ""));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contactslist + ""));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.contactslist + ""));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click delete"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "לחץ מחיקה"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق حذف"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "нажмите удалить"));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.deletecontact + ""));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.deletecontact + ""));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.deletecontact + ""));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.deletecontact + ""));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "That is it. The contact is deleted\n"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "זהו. איש הקשר נמחק\n"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "هذا هو. يتم حذف جهة الاتصال\n"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Вот и все. Контакт удален\n"));
	}
}
