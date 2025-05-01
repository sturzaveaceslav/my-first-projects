public class ComparareStringuri {
    public static void main(String[] args) {
        int limita = 10_000;

        // 1. Cu String
        long startString = System.currentTimeMillis();
        String rezultat1 = construiesteCuString(limita);
        long endString = System.currentTimeMillis();
        System.out.println(" Timp cu String: " + (endString - startString) + " ms");

        // 2. Cu StringBuilder
        long startSB = System.currentTimeMillis();
        String rezultat2 = construiesteCuStringBuilder(limita);
        long endSB = System.currentTimeMillis();
        System.out.println(" Timp cu StringBuilder: " + (endSB - startSB) + " ms");
    }

    // Funcție cu String (+)
    public static String construiesteCuString(int limita) {
        String text = "";
        for (int i = 1; i <= limita; i++) {
            text += i + " ";
        }
        return text;
    }

    // Funcție cu StringBuilder
    public static String construiesteCuStringBuilder(int limita) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= limita; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }
}
