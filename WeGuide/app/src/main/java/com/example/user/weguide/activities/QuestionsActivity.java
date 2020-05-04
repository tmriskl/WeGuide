package com.example.user.weguide.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.user.weguide.R;
import com.example.user.weguide.logic.Answer;
import com.example.user.weguide.logic.Question;
import com.example.user.weguide.logic.Questions;
import com.example.user.weguide.logic.DataBase;
import com.example.user.weguide.util.Language;

import java.util.LinkedList;
import java.util.List;

public class QuestionsActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    List<Question> questions;
    Intent intent;
    EditText editText;
    int languageNum;
    float textSize = 30;
    float maxTextSize = 40;
    float minTextSize = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        linearLayout = (LinearLayout)findViewById(R.id.MainLayoutQuestions);
        Button b = (Button)findViewById(R.id.SearchButton);
        editText = (EditText)findViewById(R.id.SearchBox);
        intent = new Intent(this, AnswerActivity.class);
        languageNum = DataBase.readLanguageNumFromFile();//= getIntent().getExtras().getInt(Language.class.getCanonicalName());
        //textSize = getIntent().getExtras().getInt("textSize");
        questions = Questions.generateQuestions(languageNum);
        DataBase.setContext(this);
        textSize = DataBase.readTextSizeFromFile();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setQuestions(editText.getText().toString());
            }
        });
        b.requestFocus();
        ((Button)findViewById(R.id.SizeUp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textSize<maxTextSize) {
                    textSize += 1;
                }
                setQuestions(editText.getText().toString());
                DataBase.writeTextSizeToFile(textSize);
            }
        });
        ((Button)findViewById(R.id.SizeDown)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textSize>minTextSize) {
                    textSize -= 1;
                }
                setQuestions(editText.getText().toString());
                DataBase.writeTextSizeToFile(textSize);
            }
        });

        List<String> SearchButton = new LinkedList<>();
        SearchButton.add("Search");
        SearchButton.add("חיפוש");
        SearchButton.add("بحث");
        SearchButton.add("Поиск");
        b.setText(SearchButton.get(languageNum));

        List<String> SearchBoxHint = new LinkedList<>();
        SearchBoxHint.add("Write Your Question");
        SearchBoxHint.add("כתוב את השאלה שלך");
        SearchBoxHint.add("اكتب سؤالك");
        SearchBoxHint.add("все вопросы связанные");
        editText.setHint(SearchBoxHint.get(languageNum));

        setQuestions("");
    }

    private void setQuestions(String string) {
        Button b;

        editText.setTextSize(textSize);
        ((Button)findViewById(R.id.SizeUp)).setTextSize(textSize);
        ((Button)findViewById(R.id.SizeDown)).setTextSize(textSize);
        ((Button)findViewById(R.id.SearchButton)).setTextSize(textSize);
        String[] strings = string.split(" ");

        while(1<linearLayout.getChildCount())
            linearLayout.removeViewAt(1);
        TextView space = new TextView(this);
        space.setText(" ");
        linearLayout.addView(space);
        for (int i = 0; i < questions.size(); i++) {
            boolean contain = true;
            for(int j = 0; j<strings.length;j++)
                if (!questions.get(i).getQuestion().get(languageNum).toLowerCase().contains(strings[j].toLowerCase())) {
                    contain = false;
                }
            if (contain) {
                final int answerNum = i;
                b = new Button(this);
                b.setText(questions.get(i).getQuestion().get(languageNum));
                b.setTextSize(textSize);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent.putExtra(Language.class.getCanonicalName(), languageNum);
                        intent.putExtra(Answer.class.getCanonicalName(), answerNum);
                        intent.putExtra("textSize",textSize);
                        startActivity(intent);
                    }
                });
                linearLayout.addView(b);
            }
        }

        space = new TextView(this);
        space.setText(" ");
        linearLayout.addView(space);
        space = new TextView(this);
        space.setText(" ");
        linearLayout.addView(space);
    }

    @Override
    protected void onResume() {
        super.onResume();
        DataBase.setContext(this);
        textSize = DataBase.readTextSizeFromFile();
        setQuestions("");
    }

}
