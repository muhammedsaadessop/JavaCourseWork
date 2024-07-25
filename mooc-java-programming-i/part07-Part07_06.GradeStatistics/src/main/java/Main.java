
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();
        
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) break;
            if (point >= 0 && point <= 100) {
                points.add(point);
            }
        }
        
        double allAverage = calculateAverage(points);
        System.out.println("Point average (all): " + allAverage);
        
        ArrayList<Integer> passingPoints = new ArrayList<>();
        for (int point : points) {
            if (point >= 50) {
                passingPoints.add(point);
            }
        }

        if (passingPoints.isEmpty()) {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        } else {
            double passingAverage = calculateAverage(passingPoints);
            System.out.println("Point average (passing): " + passingAverage);
            double passPercentage = 100.0 * passingPoints.size() / points.size();
            System.out.println("Pass percentage: " + passPercentage);
        }
        
        printGradeDistribution(points);
    }

    private static double calculateAverage(ArrayList<Integer> points) {
        if (points.isEmpty()) return 0.0;
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return (double) sum / points.size();
    }



    private static void printGradeDistribution(ArrayList<Integer> points) {
        int[] gradeCounts = new int[6]; // index 0 for failed, 1 for grade 1, ..., 5 for grade 5

        for (int point : points) {
            if (point < 50) gradeCounts[0]++;
            else if (point < 60) gradeCounts[1]++;
            else if (point < 70) gradeCounts[2]++;
            else if (point < 80) gradeCounts[3]++;
            else if (point < 90) gradeCounts[4]++;
            else if (point >= 90) gradeCounts[5]++;
        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeCounts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
