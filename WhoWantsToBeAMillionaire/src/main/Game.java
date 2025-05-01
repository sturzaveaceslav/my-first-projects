package main;

import model.Answer;
import model.Question;
import help.FiftyFiftyHelp;
import help.HelpAnswer;
import help.AudienceHelp;
import help.PhoneHelp;


import java.util.*;

public class Game {

    private static final Map<Integer, List<Question>> questionBank = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level = 1;
        int scoreTotal = 0;
        FiftyFiftyHelp fiftyFifty = new FiftyFiftyHelp();
        AudienceHelp audienceHelp = new AudienceHelp();
        PhoneHelp phoneHelp = new PhoneHelp();



        initQuestions(); // încarcă toate întrebările

        while (level <= 5) {
            Question question = getRandomQuestion(level); // obținem întrebare o singură dată
            if (question == null) {
                System.out.println("❌ Nu există întrebări pentru nivelul " + level);
                break;
            }

            boolean answered = false;
            HelpAnswer[] activeHelpAnswers = null; // pentru 50/50

            while (!answered) {
                System.out.println("\n🧠 Întrebarea nivel " + level + ": " + question.getText());

                Answer[] answers = question.getAnswers();

                // Afișare în funcție de activarea 50/50
                if (activeHelpAnswers != null) {
                    for (HelpAnswer ha : activeHelpAnswers) {
                        Answer a = ha.getAnswer();
                        System.out.println(a.getSequence() + ") " + a.getText());
                    }
                } else {
                    char litera = 'a';
                    for (Answer ans : answers) {
                        System.out.println(litera + ") " + ans.getText());
                        litera++;
                    }
                }

                System.out.println("🆘 Scrie F pentru 50/50, A pentru ajutorul publicului, P pentru sună un prieten");
                System.out.print("👉 Alege răspunsul (a/b/c/d sau F): ");
                String input = scanner.nextLine().trim().toLowerCase();

                // 🧠 Activare 50/50
                if (input.equals("f")) {
                    if (fiftyFifty.isUsed()) {
                        System.out.println("⚠️ Ai folosit deja 50/50.");
                    } else {
                        activeHelpAnswers = fiftyFifty.getHelpAnswers(question);
                        System.out.println("📢 50/50 activat! Variante rămase:");
                    }
                    continue; // nu procesăm încă răspunsul
                }

                if (input.equals("a")) {
                    if (audienceHelp.isUsed()) {
                        System.out.println("⚠️ Ai folosit deja ajutorul publicului.");
                    } else {
                        HelpAnswer[] publicAnswers = audienceHelp.getHelpAnswers(question);
                        System.out.println("📊 Publicul a votat:");
                        for (HelpAnswer ha : publicAnswers) {
                            System.out.println(" - " + ha.getAnswer().getSequence() + ") " +
                                    ha.getAnswer().getText() + " ➤ " + ha.getProbability() + "%");
                        }
                    }
                    continue;
                }
                if (input.equals("p")) {
                    if (phoneHelp.isUsed()) {
                        System.out.println("⚠️ Ai folosit deja sună un prieten.");
                    } else {
                        HelpAnswer[] sugestie = phoneHelp.getHelpAnswers(question);
                        System.out.println("📞 Prietenul tău crede că răspunsul corect este:");
                        for (HelpAnswer ha : sugestie) {
                            System.out.println(" - " + ha.getAnswer().getSequence() + ") " + ha.getAnswer().getText());
                        }
                    }
                    continue;
                }



                // 🔒 Validare input
                if (input.length() != 1 || input.charAt(0) < 'a' || input.charAt(0) > 'd') {
                    System.out.println("⚠️ Răspuns invalid. Încearcă din nou.");
                    continue;
                }

                // 🔐 Dacă 50/50 activat, verifică dacă input-ul este printre cele 2 opțiuni rămase
                if (activeHelpAnswers != null) {
                    boolean found = false;
                    for (HelpAnswer ha : activeHelpAnswers) {
                        if (ha.getAnswer().getSequence().equalsIgnoreCase(input)) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("⚠️ Această variantă nu e printre cele 2 rămase din 50/50.");
                        continue;
                    }
                }

                // ✅ Procesare răspuns
                int index = input.charAt(0) - 'a';
                Answer selected = answers[index];

                if (selected.isCorrect()) {
                    scoreTotal += question.getScore();
                    System.out.println("✅ Corect! +" + question.getScore() + " puncte. Total: " + scoreTotal);
                    level++;
                } else {
                    System.out.println("❌ Greșit! Răspunsul corect era: " + question.getCorrectAnswer().getText());
                    break;
                }

                // 🔁 Resetare după întrebare
                answered = true;
                activeHelpAnswers = null;
            }

        }

        System.out.println("🏁 Joc terminat. Total acumulat: " + scoreTotal + " puncte.");
        scanner.close();
    }


    // 🔃 Extragere întrebare random pe nivel
    public static Question getRandomQuestion(int level) {
        List<Question> lista = questionBank.get(level);
        if (lista == null || lista.isEmpty()) return null;
        Random rand = new Random();
        return lista.get(rand.nextInt(lista.size()));
    }

    // 🏗 Inițializare întrebări pe niveluri
    public static void initQuestions() {
        // Nivel 1
        List<Question> nivel1 = new ArrayList<>();
        nivel1.add(new Question(
                "Prefixul „eco” vine de la un cuvânt grecesc care înseamnă:",
                new Answer[]{
                        new Answer("stat", false, "a"),
                        new Answer("casă", true, "b"),
                        new Answer("soare", false, "c"),
                        new Answer("viață", false, "d")
                },
                1, 100
        ));
        nivel1.add(new Question(
                "Câte continente există pe Pământ?",
                new Answer[]{
                        new Answer("5", false, "a"),
                        new Answer("6", false, "b"),
                        new Answer("7", true, "c"),
                        new Answer("8", false, "d")
                },
                1, 100
        ));
        questionBank.put(1, nivel1);

        // Nivel 2
        List<Question> nivel2 = new ArrayList<>();
        nivel2.add(new Question(
                "Care este cel mai mare ocean al lumii?",
                new Answer[]{
                        new Answer("Atlantic", false, "a"),
                        new Answer("Indian", false, "b"),
                        new Answer("Pacific", true, "c"),
                        new Answer("Arctic", false, "d")
                },
                2, 200
        ));
        nivel2.add(new Question(
                "Ce organ din corp produce insulina?",
                new Answer[]{
                        new Answer("Inima", false, "a"),
                        new Answer("Ficatul", false, "b"),
                        new Answer("Pancreasul", true, "c"),
                        new Answer("Rinichiul", false, "d")
                },
                2, 200
        ));
        questionBank.put(2, nivel2);

        // Nivel 3
        List<Question> nivel3 = new ArrayList<>();
        nivel3.add(new Question(
                "În ce an a avut loc Revoluția Franceză?",
                new Answer[]{
                        new Answer("1789", true, "a"),
                        new Answer("1776", false, "b"),
                        new Answer("1812", false, "c"),
                        new Answer("1848", false, "d")
                },
                3, 300
        ));
        nivel3.add(new Question(
                "Cine a pictat Mona Lisa?",
                new Answer[]{
                        new Answer("Vincent van Gogh", false, "a"),
                        new Answer("Leonardo da Vinci", true, "b"),
                        new Answer("Pablo Picasso", false, "c"),
                        new Answer("Claude Monet", false, "d")
                },
                3, 300
        ));
        questionBank.put(3, nivel3);

        // Nivel 4
        List<Question> nivel4 = new ArrayList<>();
        nivel4.add(new Question(
                "Ce element chimic are simbolul „O”?",
                new Answer[]{
                        new Answer("Aur", false, "a"),
                        new Answer("Oxigen", true, "b"),
                        new Answer("Argint", false, "c"),
                        new Answer("Fier", false, "d")
                },
                4, 500
        ));
        nivel4.add(new Question(
                "Care este capitala Canadei?",
                new Answer[]{
                        new Answer("Toronto", false, "a"),
                        new Answer("Montreal", false, "b"),
                        new Answer("Ottawa", true, "c"),
                        new Answer("Vancouver", false, "d")
                },
                4, 500
        ));
        questionBank.put(4, nivel4);

        // Nivel 5
        List<Question> nivel5 = new ArrayList<>();
        nivel5.add(new Question(
                "Cine a scris piesa de teatru „Hamlet”?",
                new Answer[]{
                        new Answer("Dante", false, "a"),
                        new Answer("Molière", false, "b"),
                        new Answer("Shakespeare", true, "c"),
                        new Answer("Goethe", false, "d")
                },
                5, 1000
        ));
        nivel5.add(new Question(
                "Ce planetă este cunoscută ca „Planeta Roșie”?",
                new Answer[]{
                        new Answer("Venus", false, "a"),
                        new Answer("Marte", true, "b"),
                        new Answer("Saturn", false, "c"),
                        new Answer("Jupiter", false, "d")
                },
                5, 1000
        ));
        questionBank.put(5, nivel5);

    }
}
