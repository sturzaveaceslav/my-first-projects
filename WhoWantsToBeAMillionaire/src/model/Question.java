// Question.java
package model;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String text;
    private int level;
    private int score;
    private Answer[] answers;

    public Question(String text, Answer[] answers, int level, int score) {
        this.text = text;
        this.answers = answers;
        this.level = level;
        this.score = score;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public Answer getCorrectAnswer() {
        for (Answer a : answers) {
            if (a.isCorrect()) return a;
        }
        return null;
    }

    public Answer[] getWrongAnswers() {
        List<Answer> wrongList = new ArrayList<>();
        for (Answer a : answers) {
            if (!a.isCorrect()) wrongList.add(a);
        }
        return wrongList.toArray(new Answer[0]);
    }
}