// Answer.java
package model;

public class Answer {
    private String text;
    private boolean isCorrect;
    private String sequence;

    public Answer(String text, boolean isCorrect, String sequence) {
        this.text = text;
        this.isCorrect = isCorrect;
        this.sequence = sequence;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
