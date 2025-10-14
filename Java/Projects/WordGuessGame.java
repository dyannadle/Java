import java.util.Arrays;
import java.util.Scanner;

// Define the Game Class
class WordGuessGame {
    // 1. Class Attributes (Data encapsulation)
    private String secretWord;
    private char[] guessedLetters;
    private char[] displayWord;
    private int lives;
    private boolean isGameOver;

    // Constructor to initialize the Object
    public WordGuessGame(String word) {
        // String and Array Initialization
        this.secretWord = word.toLowerCase(); // Ensure case consistency
        this.lives = 6; // Standard hangman lives
        this.isGameOver = false;

        // Initialize display array with underscores
        this.displayWord = new char[secretWord.length()];
        Arrays.fill(this.displayWord, '_');

        // Initialize array for tracking all guessed letters
        this.guessedLetters = new char[0]; 
    }

    // Method to display the current state of the game
    public void displayGameStatus() {
        System.out.println("\n--- Current Status ---");
        // Print the word display (using String from char array)
        System.out.println("Word: " + String.valueOf(this.displayWord));
        System.out.println("Lives Remaining: " + this.lives);
        // Print the guessed letters array as a String
        System.out.println("Guessed Letters: " + Arrays.toString(this.guessedLetters));
        System.out.println("----------------------");
    }

    // Method to handle a player's guess
    public void makeGuess(char guess) {
        if (isGameOver) {
            System.out.println("The game is already over! Start a new one.");
            return;
        }

        char lowerCaseGuess = Character.toLowerCase(guess);

        // Check if the letter was already guessed (String/Array check)
        if (String.valueOf(guessedLetters).contains(String.valueOf(lowerCaseGuess))) {
            System.out.println("You already guessed that letter: " + lowerCaseGuess);
            return;
        }

        // Add the new guess to the guessedLetters array (simulating dynamic array resizing)
        this.guessedLetters = addToArray(this.guessedLetters, lowerCaseGuess);
        
        boolean correctGuess = false;
        
        // Check if the letter is in the secret word
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == lowerCaseGuess) {
                this.displayWord[i] = lowerCaseGuess;
                correctGuess = true;
            }
        }

        if (correctGuess) {
            System.out.println("Good guess! " + lowerCaseGuess + " is in the word.");
            checkWinCondition();
        } else {
            this.lives--;
            System.out.println("Wrong guess! " + lowerCaseGuess + " is NOT in the word.");
            checkLossCondition();
        }
    }

    // Private utility method to simulate dynamic array growth (not efficient, but demonstrates array manipulation)
    private char[] addToArray(char[] original, char element) {
        char[] newArray = Arrays.copyOf(original, original.length + 1);
        newArray[original.length] = element;
        return newArray;
    }

    // Check if the player has won
    private void checkWinCondition() {
        if (String.valueOf(this.displayWord).equals(this.secretWord)) {
            System.out.println("\n*** CONGRATULATIONS! You guessed the word: " + this.secretWord + " ***");
            this.isGameOver = true;
        }
    }

    // Check if the player has lost
    private void checkLossCondition() {
        if (this.lives <= 0) {
            System.out.println("\n*** GAME OVER! You ran out of lives. ***");
            System.out.println("The secret word was: " + this.secretWord);
            this.isGameOver = true;
        }
    }

    public boolean isGameOver() {
        return this.isGameOver;
    }
}

// Main Class to run the game
public class Main {
    public static void main(String[] args) {
        // String array of possible words
        String[] possibleWords = {"java", "programming", "oop", "class", "object", "array"};
        
        // Select a random word
        int randomIndex = (int) (Math.random() * possibleWords.length);
        String selectedWord = possibleWords[randomIndex];

        // 2. Create an Object (Instantiation)
        WordGuessGame game = new WordGuessGame(selectedWord); 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Word! (Hangman style)");
        System.out.println("The word has " + selectedWord.length() + " letters.");

        // Game Loop
        while (!game.isGameOver()) {
            game.displayGameStatus();
            
            System.out.print("Enter a letter guess: ");
            String input = scanner.nextLine().trim();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Invalid input. Please enter a single letter.");
                continue;
            }

            // Pass the first character of the input String as the guess
            game.makeGuess(input.charAt(0));
        }

        scanner.close();
    }
}
