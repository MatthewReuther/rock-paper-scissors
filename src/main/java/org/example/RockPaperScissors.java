package org.example;

//Import Util Random
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {

            String[] rps = {"r", "p", "s"};

            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            System.out.println("Please Enter Your Move (r, p, or s)");

            while (true) {
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move");
            }

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You Lose!");
                }
                if (computerMove.equals("s")) {
                    System.out.println("You Win!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("You Lose!");
                }
                if (computerMove.equals("r")) {
                    System.out.println("You Win!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("You Lose!");
                }
                if (computerMove.equals("p")) {
                    System.out.println("You Win!");
                }
            }

            System.out.println("Play again? (y/n)");

            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
            }
            
            scanner.close();
        }
    }
}