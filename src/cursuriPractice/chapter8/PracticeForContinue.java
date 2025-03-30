package cursuriPractice.chapter8;


public class PracticeForContinue {
    public static void main (String[] args) {
        String[] programmers = {"Ion", "Valeria", "Silvia"};
        for (String name : programmers) {
            for (String firstname : programmers) {
                if (firstname.equals("Silvia")) continue;
                System.out.println(firstname);
            }
        }
    }
}
