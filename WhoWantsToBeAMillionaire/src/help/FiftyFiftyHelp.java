// FiftyFiftyHelp.java
package help;

import model.Answer;
import model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FiftyFiftyHelp extends HelpOption {
    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        if (isUsed) return new HelpAnswer[0];
        isUsed = true;

        Answer correct = question.getCorrectAnswer();
        Answer[] wrong = question.getWrongAnswers();

        Random rand = new Random();
        Answer randomWrong = wrong[rand.nextInt(wrong.length)];

        List<HelpAnswer> result = new ArrayList<>();
        result.add(new HelpAnswer(correct, 0));
        result.add(new HelpAnswer(randomWrong, 0));

        return result.toArray(new HelpAnswer[0]);
    }
}
