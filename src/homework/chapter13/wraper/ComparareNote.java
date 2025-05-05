public class ComparareNote {
    public static void main(String[] args) {
        // 1. Declararea a două note
        Integer notaStudent1 = 8;
        Integer notaStudent2 = 9;

        // 2. Compararea folosind Integer.compare()
        int rezultatComparare = Integer.compare(notaStudent1, notaStudent2);

        // 3. Afișarea rezultatului
        if (rezultatComparare > 0) {
            System.out.println("Studentul 1 are nota mai mare: " + notaStudent1);
        } else if (rezultatComparare < 0) {
            System.out.println("Studentul 2 are nota mai mare: " + notaStudent2);
        } else {
            System.out.println("Ambii studenți au aceeași notă: " + notaStudent1);
        }
    }
}
