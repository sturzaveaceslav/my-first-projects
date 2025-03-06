package homework.lesson4;

public class MinutesConverter {

    public static void main(String[] args) {
        long minutes = 654563;
        double days = minutes / 60;
        double years = days / 365;

        System.out.println(days + " days");
        System.out.println(years + " years");
    }
}
