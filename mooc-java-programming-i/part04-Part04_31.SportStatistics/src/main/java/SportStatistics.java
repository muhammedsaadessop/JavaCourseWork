
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File:\n");
        String filename = scanner.nextLine();
        
        System.out.print("Team:\n");
        String teamName = scanner.nextLine();
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String homeTeam = parts[0];
                    String visitingTeam = parts[1];
                    int homePoints = Integer.parseInt(parts[2]);
                    int visitingPoints = Integer.parseInt(parts[3]);

                    if (homeTeam.equals(teamName) || visitingTeam.equals(teamName)) {
                        games++;
                        if ((homeTeam.equals(teamName) && homePoints > visitingPoints) ||
                            (visitingTeam.equals(teamName) && visitingPoints > homePoints)) {
                            wins++;
                        } else {
                            losses++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Reading the file " + filename + " failed.");
            return;
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
