package persoana1;

public class Person {
    public static void main(String[] args) {

        int a = 25;
        a = a++ + a + a-- - a-- + ++a;
        System.out.println(a);

    }
}