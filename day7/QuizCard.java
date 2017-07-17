package com.day7;

/**
 * Created by Administrator on 2017/7/17.
 */
public class QuizCard {
    String question;
    String answer;
    public QuizCard(String q, String a){
        question = q;
        answer = a;
    }
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
}
