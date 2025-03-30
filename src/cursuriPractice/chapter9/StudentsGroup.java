package cursuriPractice.chapter9;

public class StudentsGroup {
    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();
        int n = studentGrades.readStudentCount();
        if (n > 0) {
            studentGrades.scanner.nextLine();
            Person[] students = new Person[n];
            double[] grades = new double[n];
            studentGrades.readStudentsNames(n, students, grades);
            double average = studentGrades.calculateAverage(grades);
            int bestStudentIndex = studentGrades.findBextStudent(grades);
            studentGrades.displayResults(average, students, bestStudentIndex, grades);
        } else {
            System.out.println("Ati introdus un numar invalid de studenti");
        }
    }
}

