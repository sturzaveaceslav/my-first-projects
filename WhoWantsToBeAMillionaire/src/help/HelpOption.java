package help;

public abstract class HelpOption {
    protected boolean isUsed = false;

    public boolean isUsed() {
        return isUsed;
    }

    public void reset() {
        isUsed = false;
    }

    public abstract HelpAnswer[] getHelpAnswers(model.Question question);
}
