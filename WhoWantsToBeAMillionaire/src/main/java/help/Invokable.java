// Invokable.java
package help;

import model.Question;

public interface Invokable {
    HelpAnswer[] getHelpAnswers(Question question);
}