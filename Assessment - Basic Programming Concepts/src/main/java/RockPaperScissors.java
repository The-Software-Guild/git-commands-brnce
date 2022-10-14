import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner playerChoice = new Scanner(System.in);
        Random random = new Random();

        int winCounter = 0;
        int lossCounter = 0;
        int tieCounter = 0;
        int timesPlayed = 10;

        while (true) {

            System.out.println("");
            System.out.println("Let's play ROCK - PAPER - SCISSORS\n");
            System.out.println("How many rounds of Rock-Paper-Scissors would you like to play? (1-10)");
            int rounds = playerChoice.nextInt();


            if (rounds > timesPlayed) {
                System.out.println("Invalid: You can only play a maximum of 10 rounds");
                System.exit(0);
                break;
            }

            for (int i = 0; i < rounds; i++) {
                System.out.println("Make a move! Hint: Type = 1 = Rock, 2 = Paper, 3 = Scissors");
                int playerMove = playerChoice.nextInt();
                switch (playerMove) {
                    case 1:
                        playerMove = 1;
                        System.out.println("You chose: Rock");
                        break;
                    case 2:
                        playerMove = 2;
                        System.out.println("You chose: Paper");
                        break;
                    case 3:
                        playerMove = 3;
                        System.out.println("You chose: Scissors");
                        break;
                }

                if (playerMove > 3 && playerMove < 1) {
                    System.out.println("Invalid: Choose a number between 0 and 2");
                    playerMove = playerChoice.nextInt();
                }


                int computerMove = random.nextInt(2) + 1;

                // Getting input from computer
                if (computerMove == 1) {
                    System.out.println("Computer chose: Rock");
                } else if (computerMove == 2) {
                    System.out.println("Computer chose: Paper");
                } else {
                    System.out.println("Computer chose: Scissors");
                }

                if (computerMove == 2 && playerMove == 1) {
                    System.out.println("Computer Wins!" + "\n");
                    ++lossCounter;
                }
                if (playerMove == 2 && computerMove == 1) {
                    System.out.println("You Win!" + "\n");
                    ++winCounter;
                }
                if (playerMove == 1 && computerMove == 1) {
                    System.out.println("Its a Tie!" + "\n");
                    ++tieCounter;
                }
                if (playerMove == 2 && computerMove == 2) {
                    System.out.println("Its a Tie!" + "\n");
                    ++tieCounter;
                }
                if (playerMove == 3 && computerMove == 3) {
                    System.out.println("Its a Tie!" + "\n");
                    ++tieCounter;
                }
                if (playerMove == 3 && computerMove == 2) {
                    System.out.println("You Win!" + "\n");
                    ++winCounter;
                }
                if (playerMove == 2 && computerMove == 3) {
                    System.out.println("Computer Wins!" + "\n");
                    ++lossCounter;
                }
                if (playerMove == 1 && computerMove == 3) {
                    System.out.println("You Win!" + "\n");
                    ++winCounter;
                }
                if (playerMove == 3 && computerMove == 1) {
                    System.out.println("Computer Wins!" + "\n");
                    ++lossCounter;
                }

            }
            break;

        }

        if (winCounter > lossCounter) {
            System.out.println("You Win! " + lossCounter + "\n");
        }
        if (winCounter < lossCounter) {
            System.out.println("You Lose! " + winCounter + "\n");
        } else {
            System.out.println("You Tied! " + tieCounter + "\n");
        }

        System.out.println("");
        System.out.println("You tied in " + tieCounter + " rounds!");
        System.out.println("You won in " + winCounter + " rounds!");
        System.out.println("You lost in " + lossCounter + " rounds!");
        System.out.println("");


        Scanner playAgain = new Scanner(System.in);
        System.out.println("Would you like to play again? (y/n)");
        String answer = playAgain.nextLine();

        if (answer.equals("y")) {
            System.out.println("Great! let's go!");
            playerChoice.nextLine();
//            System.out.println(playerChoice);
        } else if (answer.equals("n"))
            System.out.println("Thanks for playing!");
        System.exit(0);
    }
}

























