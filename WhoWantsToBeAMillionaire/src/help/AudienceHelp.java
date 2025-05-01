// AudienceHelp.java
package help;

import model.Answer;
import model.Question;

import java.util.*;

public class AudienceHelp extends HelpOption {
    @Override
    public HelpAnswer[] getHelpAnswers(Question question) {
        if (isUsed) return new HelpAnswer[0];
        isUsed = true;

        List<Answer> allAnswers = new ArrayList<>(Arrays.asList(question.getAnswers()));
        Collections.shuffle(allAnswers);

        Answer correct = question.getCorrectAnswer();
        double remaining = 100.0;
        Map<Answer, Double> probabilities = new LinkedHashMap<>();

        // Acordăm cel mai mare procentaj răspunsului corect
        double correctPercentage = 40 + new Random().nextInt(21); // 40-60%
        probabilities.put(correct, correctPercentage);
        remaining -= correctPercentage;

        // Restul se distribuie aleator răspunsurilor greșite
        List<Answer> wrongs = new ArrayList<>();
        for (Answer a : allAnswers) {
            if (!a.isCorrect()) wrongs.add(a);
        }

        for (int i = 0; i < wrongs.size(); i++) {
            Answer w = wrongs.get(i);
            double val = (i == wrongs.size() - 1)
                    ? remaining
                    : new Random().nextDouble() * remaining;
            val = Math.round(val * 10) / 10.0;
            probabilities.put(w, val);
            remaining -= val;
        }

        List<HelpAnswer> result = new ArrayList<>();
        for (Map.Entry<Answer, Double> entry : probabilities.entrySet()) {
            result.add(new HelpAnswer(entry.getKey(), entry.getValue()));
        }

        return result.toArray(new HelpAnswer[0]);
    }
}