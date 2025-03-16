package cursuriPractice;

public class Test {
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
