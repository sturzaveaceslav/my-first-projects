package homework.lesson5;

public class Rectangle {
    public static void main(String[] args) {
        double width1 = 1.5;
        double height1 = 3.5;
        double area1 = width1 * height1;
        System.out.println("Area: " + area1);

        double width2 = 2.5;
        double height2 = 4.5;
        double area2 = width2 * height2;
        System.out.println("Area: " + area2);

        if (area1 == area2) {
            System.out.println("The first rectangel is larger " + area1);

        } else {
            System.out.println("The second rectangle is larger:  " + area2);
        }
    }
}
