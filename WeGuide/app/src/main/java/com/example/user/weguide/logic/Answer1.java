package com.example.user.weguide.logic;

import java.util.LinkedList;

import com.example.user.weguide.R;
import com.example.user.weguide.util.AssetType;
import com.example.user.weguide.util.Language;

public class Answer1 extends Answer {

	public Answer1() {
		super();
		answer.set(Language.ENGLISH.ordinal(), new LinkedList<Asset>());
		answer.set(Language.עברית.ordinal(), new LinkedList<Asset>());
		answer.set(Language.عربى.ordinal(), new LinkedList<Asset>());
		answer.set(Language.русский.ordinal(), new LinkedList<Asset>());

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.TEXT, "Click on"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.TEXT, "תלחץ על"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.TEXT, "انقر فوق"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.TEXT, "Нажмите на"));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.URL, "http://www.google.com"));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.URL, "http://www.google.com"));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.URL, "http://www.google.com"));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.URL, "http://www.google.com"));

		answer.get(Language.ENGLISH.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.google + ""));
		answer.get(Language.עברית.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.google + ""));
		answer.get(Language.عربى.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.google + ""));
		answer.get(Language.русский.ordinal()).add(new Asset(AssetType.IMAGE, R.drawable.google + ""));
	}
}
