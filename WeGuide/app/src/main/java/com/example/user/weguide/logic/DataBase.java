package com.example.user.weguide.logic;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by User on 03/06/2019.
 */

public class DataBase {

    private final static String fileName = "DataBase";
    private final static String textSizeKey = "TextSize";
    private final static String languageKey = "Language";

    static float textSizeDefault = 30;
    static int numLanguageDefault = -1;
    static SharedPreferences sharedPreferences;
    static Context context = null;

    public static void setContext(Context context) {
        DataBase.context = context;
    }

    public static float readTextSizeFromFile(){
        float textSize = textSizeDefault;
        sharedPreferences = context.getSharedPreferences(fileName,Context.MODE_PRIVATE);
        textSize = sharedPreferences.getFloat(textSizeKey, textSizeDefault);
        return textSize;
    }

    public static void writeTextSizeToFile(float textSize){
        sharedPreferences = context.getSharedPreferences(fileName,Context.MODE_PRIVATE);
        sharedPreferences.edit().putFloat(textSizeKey,textSize).apply();
    }


    public static int readLanguageNumFromFile(){
        int Language = numLanguageDefault;
        sharedPreferences = context.getSharedPreferences(fileName,Context.MODE_PRIVATE);
        Language = sharedPreferences.getInt(languageKey, numLanguageDefault);
        return Language;
    }

    public static void writeLanguageNumFToFile(int textSize){
        sharedPreferences = context.getSharedPreferences(fileName,Context.MODE_PRIVATE);
        sharedPreferences.edit().putInt(languageKey,textSize).apply();
    }

    /*public static void delete(){
        //sharedPreferences = context.getSharedPreferences(fileName,Context.MODE_PRIVATE);
        //context.deleteDatabase(fileName);
        //sharedPreferences.edit().remove(textSizeKey);
        //sharedPreferences.edit().remove(languageKey);
    }*/
}
