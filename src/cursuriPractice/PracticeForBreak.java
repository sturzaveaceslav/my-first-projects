package cursuriPractice;

public class PracticeForBreak {
    public static void main(String[] args) {
        String[] programmers = {"Ion", "Anna"};
        for (String name : programmers) {
            for (String firstname : programmers) {

                if (firstname.equals("Anna")) break;
                System.out.println(firstname); // executia de aici va afisa doar Ion Ion
            }
            System.out.println(name); // executia de aici va afisa Ion Ion Ion Anna
        }
    }
}

