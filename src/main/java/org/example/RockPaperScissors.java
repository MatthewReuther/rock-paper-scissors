package org.example;

//Import Util Random
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //Accept A Move From Player:
            //Rock, Paper, or Scissors from the keyboard
        //Computer Will need to select move at Random to play
            //Computer randomly gets from list of rock paper or scissors
        //Then get those answers
            //And Compare them

        //Computer Gets Random Input from Rock, Paper, Scissor String Array
            //Create rps String Array

        Scanner scanner = new Scanner(System.in);
        //while play again is y
        while (true) {

            String[] rps = {"r", "p", "s"};
            //Array Index's "0"  "1"  "2"

            //Set equal to a (Random) index from rpsArray
            // when you pass 3 into random.nextInt method it is going to give random number between 0 and 1 less than the given number were passing in
            // so it is going to give us a number between the rps index 0,1,2
            String computerMove = rps[new Random().nextInt(rps.length)];

            //Get move from user keyboard
            String playerMove;
            System.out.println("Please Enter Your Move (r, p, or s)");

            //while loop: only exit the loop if valid input is met
            while (true) {
                //gets next line from the input of the user
                playerMove = scanner.nextLine();
                //check to see if valid input was met
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }

                //if not print error message
                System.out.println(playerMove + " is not a valid move");
            }

            //Check player move vs computer move
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

            //play again?
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            //if it is not yes then leave program
            if (!playAgain.equals("y")) {
                break;
            }
            //close scanner
            scanner.close();
        }
    }
}