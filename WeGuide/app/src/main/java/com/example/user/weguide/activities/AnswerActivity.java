package com.example.user.weguide.activities;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.example.user.weguide.R;
import com.example.user.weguide.logic.Answer;
import com.example.user.weguide.logic.Asset;
import com.example.user.weguide.logic.Question;
import com.example.user.weguide.logic.Questions;
import com.example.user.weguide.logic.DataBase;
import com.example.user.weguide.util.AssetType;

import java.util.List;

public class AnswerActivity extends AppCompatActivity {


    LinearLayout linearLayout;
    List<Question> questions;
    Intent browserIntent;
    float textSize = 30;
    float maxTextSize = 40;
    float minTextSize = 10;
    int answerNum;
    int languageNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        linearLayout = (LinearLayout)findViewById(R.id.MainLayoutAnswer);
        languageNum = DataBase.readLanguageNumFromFile();//= getIntent().getExtras().getInt(Language.class.getCanonicalName());
        questions = Questions.generateQuestions(languageNum);
        answerNum = getIntent().getExtras().getInt(Answer.class.getCanonicalName());
        DataBase.setContext(this);
        //textSize = getIntent().getExtras().getInt("textSize");
        textSize = DataBase.readTextSizeFromFile();

        ((TextView)findViewById(R.id.Question)).setText(questions.get(answerNum).getQuestion().get(languageNum));
        ((Button)findViewById(R.id.SizeUp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textSize<maxTextSize) {
                    textSize += 1;
                }
                setAssets();
                DataBase.writeTextSizeToFile(textSize);

            }
        });
        ((Button)findViewById(R.id.SizeDown)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textSize>minTextSize) {
                    textSize -= 1;
                }
                setAssets();
                DataBase.writeTextSizeToFile(textSize);

            }
        });

        setAssets();
    }

    private void setAssets() {

        final List<Asset> assets = questions.get(answerNum).answer().getAnswer().get(languageNum);
        View view = null;

        ((Button)findViewById(R.id.SizeUp)).setTextSize(textSize);
        ((Button)findViewById(R.id.SizeDown)).setTextSize(textSize);
        ((TextView)findViewById(R.id.Question)).setTextSize(textSize);
        ((TextView)findViewById(R.id.Question)).setTextColor(Color.BLACK);

        while(1<linearLayout.getChildCount())
            linearLayout.removeViewAt(1);

        for (int i = 0; i < assets.size(); i++) {
            Asset asset = assets.get(i);
            if(asset.getType().equals(AssetType.TEXT)){
                view = new TextView(this);
                ((TextView)view).setText(asset.getAsset());
                ((TextView)view).setTextSize(textSize);
                ((TextView)view).setTextColor(Color.BLACK);
            }
            else if(asset.getType().equals(AssetType.IMAGE)){
                view = new ImageView(this);
                ((ImageView)view).setImageResource(Integer.valueOf(asset.getAsset()));

            }
            else if(asset.getType().equals(AssetType.URL)){
                view = new Button(this);
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(asset.getAsset()));
                ((Button)view).setText(asset.getAsset());
                ((Button)view).setTextSize(textSize);
                ((Button)view).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(browserIntent);
                    }
                });
            }
            else if(asset.getType().equals(AssetType.VIDEO)){
                view = new VideoView(this);
            }
            else if(asset.getType().equals(AssetType.AUDIO)){

            }
            else if(asset.getType().equals(AssetType.FILE)){

            }

            if(view != null) {
                if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams p = ((ViewGroup.MarginLayoutParams) view.getLayoutParams());
                    p.setMargins(0, 0, 0, 0);
                    view.setPadding(0, 0, 0, 0);
                    view.requestLayout();
                }
                linearLayout.addView(view);
                view = null;
            }
        }

        TextView space = new TextView(this);
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
        setAssets();
    }
}
