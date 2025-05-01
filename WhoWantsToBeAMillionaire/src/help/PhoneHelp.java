// PhoneHelp.java
package help;

import model.Answer;
import model.Question;

public class PhoneHelp extends HelpOption {
    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        if (isUsed) return new HelpAnswer[0];
        isUsed = true;

        Answer correct = question.getCorrectAnswer();
        return new HelpAnswer[] { new HelpAnswer(correct, 100.0) };
    }
}