package src.javaLearning.programs;

import java.util.Scanner;

public class FunGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String replay = "";
        do {
            runGame(); //run method to guess number
            System.out.println("Play again? Enter Yes or No");
            replay = in.nextLine().toLowerCase();
        }
        while (!replay.equals("no"));
    }

    private static void runGame() {
        Scanner in = new Scanner(System.in); //create scanner object
        int maxNumber = 0; //declare variables
        int userGuess = 0;
        int totalGuesses = 0;
        int secretNumber = 0;

        System.out.println("Welcome to the Secret Number Generator!");
        System.out.println("Please input a maximum value for the secret number and press enter."); //prompt user to input a maximum value
        maxNumber = in.nextInt();

        secretNumber = (int) ((Math.random() * maxNumber) + 1); //generate the secret number
        System.out.println("The secret number is " + secretNumber); //print the secret number to the console for testing purposes

        System.out.println("A new secret number has been chosen!" + "\nWhat do you think it is? Input your guess and press enter."); //prompt user to input a guess
        userGuess = in.nextInt();

        while (userGuess != secretNumber) {
            if (userGuess < secretNumber) {
                System.out.println("That's too SMALL!!! Lol!!! Please try again."); //prompt user to input another guess; increment total number of guesses by 1
            } else if (userGuess > secretNumber) {
                System.out.println("That's what she said. Yeeeaaahhh!!!"); //prompt user to input another guess; increment total number of guesses by 1
            } else {
                System.out.println("Sorry, but that's not right. Try again...");
            }
            totalGuesses++;
            userGuess = in.nextInt();
        }
        System.out.println("You guessed it! After " + totalGuesses + "   tries.");
    }
}
