package com.example.user.weguide.logic;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 31/05/2019.
 */

public class Questions {

    static List<Question> questions = null;

    public static List<Question> generateQuestions(int languageNum){

        if(questions == null){

            questions = new LinkedList<>();
            questions.add(new Question1());
            questions.add(new Question2());
            questions.add(new Question3());
            questions.add(new Question4());
            questions.add(new Question5());
            questions.add(new Question6());
            questions.add(new Question7());
            questions.add(new Question8());
            questions.add(new Question9());
            questions.add(new Question10());
            questions.add(new Question11());
            questions.add(new Question12());

            /*
            for(int i = 0;i<questions.size();i++)
                for(int j = 0;j<questions.size()-i-1;j++){
                    if(questions.get(j).getQuestion().get(languageNum).compareTo(questions.get(j+1).getQuestion().get(languageNum)) > 0) {
                        Question temp = questions.get(j);
                        questions.set(j, questions.get(j + 1));
                        questions.set(j + 1, temp);
                    }
                }
            */
        }

        return questions;
    }


}
