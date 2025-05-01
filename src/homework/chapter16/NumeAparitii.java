import java.util.*;

public class NumeAparitii {
    public static void main(String[] args) {

        List<String> nume = Arrays.asList(
                "Ana", "Ion", "Maria", "Ion", "Ana", "George", "Maria",
                "Ion", "Ana", "Ion", "Elena", "Ion"
        );


        Map<String, Integer> aparitii = new HashMap<>();


        for (String n : nume) {
            aparitii.put(n, aparitii.getOrDefault(n, 0) + 1);
        }


        System.out.println("Număr de apariții ale fiecărui nume:");
        for (Map.Entry<String, Integer> entry : aparitii.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " apariție" +
                    (entry.getValue() > 1 ? "i" : ""));
        }
    }
}
