import java.util.ArrayList;
import java.util.List;

public class GradeRegister {
    private List<Integer> points;
    private List<Integer> grades;

    public GradeRegister() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(calculateGrade(points));
    }

    private int calculateGrade(int points) {
        if (points < 0 || points > 100) {
            return -1; // Invalid grade
        } else if (points >= 90) {
            return 5;
        } else if (points >= 80) {
            return 4;
        } else if (points >= 70) {
            return 3;
        } else if (points >= 60) {
            return 2;
        } else if (points >= 50) {
            return 1;
        } else {
            return 0;
        }
    }

    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        }
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public double averageOfPoints() {
        if (points.isEmpty()) {
            return -1;
        }
        return points.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public void printPoints() {
        for (int point : points) {
            System.out.println("Points: " + point);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");
            grade--;
        }
    }

    public int numberOfGrades(int grade) {
        return (int) grades.stream().filter(g -> g == grade).count();
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
