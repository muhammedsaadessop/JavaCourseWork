
import java.util.Scanner;

public class Program {

   
    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10); // Sleep for 10 milliseconds (100 hundredths of a second)
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Timer {

    private ClockHand hundredthsOfSecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredthsOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public String toString() {
        return seconds.toString() + ":" + hundredthsOfSecond.toString();
    }

    public void advance() {
        hundredthsOfSecond.advance();
        if (hundredthsOfSecond.value() == 0) {
            seconds.advance();
        }
    }
}