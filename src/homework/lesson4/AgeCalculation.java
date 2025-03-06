package homework.lesson4;

public class AgeCalculation {
    public static void main(String[] args) {
        int yearOfBirth1 = 1990;
        int yearOfBirth2 = 2000;
        int yearNow = java.time.LocalDate.now().getYear();
        int age1 = yearNow - yearOfBirth1;
        int age2 = yearNow - yearOfBirth2;

        System.out.println("John: " + age1);
        System.out.println("Anna: " + age2);


    }

}
