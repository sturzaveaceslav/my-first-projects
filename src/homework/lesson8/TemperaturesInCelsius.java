package homework.lesson8;

public class TemperaturesInCelsius {
    public static void main(String[] args) {
        System.out.println("Celsius/Fahrenheit");
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            double fahrenheit = (celsius * 9.0 / 5) + 32;
System.out.println("" +  celsius + " "+ fahrenheit);

        }
    }
}
