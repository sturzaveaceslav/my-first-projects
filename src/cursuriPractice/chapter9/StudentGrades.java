package cursuriPractice.chapter9;
import java.util.Scanner;

public class StudentGrades {
    Scanner scanner = new Scanner(System.in);

    public void displayResults(double average, Person[] students, int bestStudentIndex, double[] grades) {
        System.out.println("\nMedia tuturor notelor: " + average);
        System.out.println("Studentul cu cea mai mare notă: " + students[bestStudentIndex].name + " - " + grades[bestStudentIndex]);

        System.out.println("\nLista studenților și notele lor:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " - " + grades[i]);
        }
    }

    public int findBextStudent(double[] grades) {
        int bestIndex = 0;
        double maxGrade = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
                bestIndex = i;
            }
        }
        return bestIndex;
    }

    public double calculateAverage(double[] grades) {
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }

    public int readStudentCount() {
        System.out.print("Introduceți numărul de studenți: ");
        return scanner.nextInt();
    }

    public void readStudentsNames(int nr, Person[] students, double[] grades) {
        for (int i = 0; i < nr; i++) {
            System.out.print("Introduceți numele studentului " + (i + 1) + ": ");
            students[i] = new Person(scanner.nextLine());
            System.out.print("Introduceți nota studentului " + students[i].name + ": ");
            grades[i] = scanner.nextDouble();
            scanner.nextLine();
        }

    }
}

