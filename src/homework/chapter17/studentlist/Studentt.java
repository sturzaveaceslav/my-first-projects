package homework.chapter17.studentlist;

import java.util.List;

public class Studentt {
    private String name;
    private List<Double> grades;

    public Studentt(String name, List<Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() { return name; }

    public List<Double> getGrades() { return grades; }

    public double getAverage() {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return name + " - media: " + String.format("%.2f", getAverage());
    }
}
