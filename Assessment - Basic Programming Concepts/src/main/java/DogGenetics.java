import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("What is the name of your dog?");
            String name = scanner.nextLine();

            System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.\n");
            System.out.println(name + " is:\n");

            Random randomNumber = new Random();

            String[] dogBreeds = new String[]{"Field Spaniel", "Dalmatian", "Great Pyreness", "Maltese", "Akbash"};

            int breed1 = randomNumber.nextInt(101);
            int breed2 = randomNumber.nextInt(101 - breed1);
            int breed3 = randomNumber.nextInt(101 - breed1 - breed2);
            int breed4 = randomNumber.nextInt(101 - breed1 - breed2 - breed3);
            int sum = 100 - breed1 - breed2 - breed3 - breed4;

            int[] randomPercentages = new int[]{breed1, breed2, breed3, breed4, sum};
            String dogName = "";
            for(int i = 0; i < 5; ++i) {
                System.out.println(dogName  + randomPercentages[i] + "% " + dogBreeds[i] + ".");
            }

        }

}

