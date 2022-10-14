import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // gets users age
        System.out.println("How old are you?");
        int age = Integer.parseInt(scanner.nextLine());

        // calculates their maximum heart rate
       int maxHR = 220 - age;
       // calculate their target HR zone heart rate
       double hrZone1 = 0.5 * maxHR;
       double hrZone2 = 0.85 * maxHR;

       // prints the results
        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute");
        System.out.println("Your target HR Zone is " + hrZone1 + " to " + hrZone2 + " beats per minute.");

        }

    }
