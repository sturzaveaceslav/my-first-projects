// HelpOption.java
package help;

import model.Question;

public abstract class HelpOption implements Invokable {
    protected boolean isUsed = false;

    public boolean isUsed() {
        return isUsed;
    }
}