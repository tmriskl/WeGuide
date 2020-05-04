package com.example.user.weguide.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.user.weguide.R;
import com.example.user.weguide.logic.DataBase;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;
import java.util.List;

//import androidx.room.Room;


public class LanguageActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    Intent intent;
    float textSize = 30;
    float maxTextSize = 40;
    float minTextSize = 10;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        linearLayout = (LinearLayout)findViewById(R.id.MainLayoutLanguage);
        intent = new Intent(this, QuestionsActivity.class);
        DataBase.setContext(this);
        textSize = DataBase.readTextSizeFromFile();

        int numLanguage = DataBase.readLanguageNumFromFile();
        if(!(numLanguage == -1))
            startActivity(intent);

        ((Button)findViewById(R.id.SizeUp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textSize<maxTextSize) {
                    textSize += 1;
                }
                setLanguages();
                DataBase.writeTextSizeToFile(textSize);
            }
        });
        ((Button)findViewById(R.id.SizeDown)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textSize>minTextSize) {
                    textSize -= 1;
                }
                setLanguages();
                DataBase.writeTextSizeToFile(textSize);
            }
        });

        setLanguages();
        TextView space = new TextView(this);
        space.setText(" ");
        linearLayout.addView(space);
        space = new TextView(this);
        space.setText(" ");
        linearLayout.addView(space);
    }

    private void setLanguages() {

        while(1<linearLayout.getChildCount())
            linearLayout.removeViewAt(1);
        int numLanguage = DataBase.readLanguageNumFromFile();
        List<String> opens = new LinkedList<>();
        /*opens.add("Choose Language");
        opens.add("בחר שפה");
        opens.add("اختر اللغة");
        opens.add("выбрать язык");
        String open = "";
        if(numLanguage == -1)
            for(int i = 0; i<opens.size(); i++){
                open += opens.get(i) + "\n";
            }
        else{
            open = opens.get(numLanguage);
        }*/

        //((TextView)findViewById(R.id.open)).setText(open);
        ((Button)findViewById(R.id.SizeUp)).setTextSize(textSize);
        ((Button)findViewById(R.id.SizeDown)).setTextSize(textSize);
        ((TextView)findViewById(R.id.open)).setTextSize(textSize);
        Button b;
        for(int i = 0; i < Language.values().length; i++) {
            final int languageNum = i;
            b = new Button(this);
            b.setText(Language.values()[i].name());
            b.setTextSize(textSize);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DataBase.writeLanguageNumFToFile(languageNum);
                    //intent.putExtra(Language.class.getCanonicalName(),languageNum);
                    //intent.putExtra("textSize",textSize);
                    startActivity(intent);
                }
            });
            linearLayout.addView(b);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        DataBase.setContext(this);
        textSize = DataBase.readTextSizeFromFile();
        setLanguages();
    }
}
