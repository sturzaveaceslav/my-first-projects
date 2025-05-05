public class TemperaturaMaxima {
    public static void main(String[] args) {
        // 1. Declararea a două temperaturi
        Double tempCamera1 = 21.5;
        Double tempCamera2 = 23.8;

        // 2. Aflarea temperaturii maxime folosind Double.max()
        Double temperaturaMaxima = Double.max(tempCamera1, tempCamera2);

        // 3. Afișarea rezultatului în consolă
        System.out.println("Temperatura maximă este: " + temperaturaMaxima + "°C");
    }
}
