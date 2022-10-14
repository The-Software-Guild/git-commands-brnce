import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int timesPlayed = 10;
        System.out.println("Let's play ROCK - PAPER - SCISSORS");
        System.out.println("How many rounds of Rock-Paper-Scissors would you like to play? (1-10)");
        int rounds = Integer.parseInt(scanner.nextLine());

        if (rounds > timesPlayed) {
            System.out.println("Invalid: You can only play a maximum of 10 rounds");
            System.exit(0);
        } else getGameMoves();

        for (int i = 1; i < rounds; i++) {
            getGameMoves();
        }
    }

    public static void getGameMoves() {

        int rock = 0;
        int paper = 1;
        int scissors = 2;

        // Getting input from the user
        Scanner number = new Scanner(System.in);
        System.out.println("Make a move! Hint: 0 = Rock, 1 = Paper, 2 = Scissors");

        int playerMove = Integer.parseInt(number.nextLine());

        //if user chooses above 2
        while (playerMove > 2) {
            System.out.println("Invalid: Choose a number between 0 and 2");
            playerMove = number.nextInt();
        }

//        while (true) {
//            System.out.println("Would you like to play again? Answer (y/n)\n");
//            String answer = number.nextLine();
//            if (answer.equals("y")) {
//                System.out.println("Great! let's go!");
//            } else if (answer.equals("n")) {
//                System.out.println("Thanks for playing!");
//                System.exit(0);
//            } else {
//                System.out.println("Invalid response: Please try again.");
//            }

            if (playerMove == rock) {
                System.out.println("You chose: Rock");
            } else if (playerMove == paper) {
                System.out.println("You chose: Paper");
            } else {
                System.out.println("You chose: Scissors");
            }


            // generating computer moves using random
            Random random = new Random();
            int computerMove = random.nextInt(3);

            // Getting input from computer
            if (computerMove == rock) {
                System.out.println("Computer chose: Rock");
            } else if (computerMove == paper) {
                System.out.println("Computer chose: Paper");
            } else {
                System.out.println("Computer chose: Scissors");
            }

            // Print results
            if (computerMove == rock) {
                if (playerMove == paper) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer Wins");
                }
            } else if (computerMove == paper) {
                if (playerMove == rock) {
                    System.out.println("Computer Wins");
                } else {
                    System.out.println("You Win!");
                }
            } else if (playerMove == rock) {
                System.out.println("You Win");
            } else {
                System.out.println("Computer Wins");
            }
            if (playerMove == computerMove) {
                System.out.println("That's a tie");
            }
        }
    }


























