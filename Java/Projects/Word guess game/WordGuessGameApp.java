import java.util.Arrays; // Imports the Arrays utility class for array manipulation (e.g., fill, copyOf, toString)
import java.util.Scanner; // Imports the Scanner class for reading user input

// Define the Game Class, responsible for all game logic and state
class WordGuessGame {
    // 1. Class Attributes (Data encapsulation: private visibility restricts direct external access)
    private String secretWord;      // The actual word to be guessed (e.g., "java")
    private char[] guessedLetters;  // Array to track all letters the player has guessed (correct or incorrect)
    private char[] displayWord;     // Array representing the word shown to the player (e.g., ['_', 'a', '_', 'a'])
    private int lives;              // Counter for remaining lives
    private boolean isGameOver;     // Flag to indicate if the game has ended

    // Constructor to initialize the Object (Instantiation)
    public WordGuessGame(String word) {
        // String and Array Initialization
        this.secretWord = word.toLowerCase(); // Stores the secret word in lowercase for case consistency
        this.lives = 6;                       // Sets standard hangman lives to 6
        this.isGameOver = false;              // Initializes game status as not over

        // Initialize display array with underscores (size is length of secretWord)
        this.displayWord = new char[secretWord.length()];
        Arrays.fill(this.displayWord, '_'); // Fills the display array with underscore characters

        // Initialize array for tracking all guessed letters as an empty array
        this.guessedLetters = new char[0]; 
    }

    // Method to display the current state of the game
    public void displayGameStatus() {
        System.out.println("\n--- Current Status ---");
        // Prints the current state of the word, converting the char array to a String
        System.out.println("Word: " + String.valueOf(this.displayWord));
        System.out.println("Lives Remaining: " + this.lives);
        // Prints the array of guessed letters as a formatted String
        System.out.println("Guessed Letters: " + Arrays.toString(this.guessedLetters));
        System.out.println("----------------------");
    }

    // Method to handle a player's guess
    public void makeGuess(char guess) {
        if (isGameOver) {
            System.out.println("The game is already over! Start a new one.");
            return; // Exits the method if the game is over
        }

        char lowerCaseGuess = Character.toLowerCase(guess); // Converts the input guess to lowercase

        // Check if the letter was already guessed (uses String contains() method on the char array)
        if (String.valueOf(guessedLetters).contains(String.valueOf(lowerCaseGuess))) {
            System.out.println("You already guessed that letter: " + lowerCaseGuess);
            return; // Exits the method as the guess is redundant
        }

        // Add the new guess to the guessedLetters array (simulating dynamic array resizing)
        this.guessedLetters = addToArray(this.guessedLetters, lowerCaseGuess);
        
        boolean correctGuess = false; // Flag to track if the guess was correct in this turn
        
        // Loop through the secret word to check for the guessed letter
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == lowerCaseGuess) {
                this.displayWord[i] = lowerCaseGuess; // Update the display array at the correct position
                correctGuess = true;
            }
        }

        if (correctGuess) {
            System.out.println("Good guess! " + lowerCaseGuess + " is in the word.");
            checkWinCondition(); // Check if the player has won after a correct guess
        } else {
            this.lives--; // Deduct a life for an incorrect guess
            System.out.println("Wrong guess! " + lowerCaseGuess + " is NOT in the word.");
            checkLossCondition(); // Check if the player has lost after an incorrect guess
        }
    }

    // Private utility method to simulate dynamic array growth
    private char[] addToArray(char[] original, char element) {
        // Creates a new array one element longer than the original
        char[] newArray = Arrays.copyOf(original, original.length + 1);
        // Adds the new element to the last position of the new array
        newArray[original.length] = element;
        return newArray; // Returns the newly created array
    }

    // Check if the player has won
    private void checkWinCondition() {
        // Converts the displayWord array to a String and compares it to the secretWord
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

    // Public getter method for the game state
    public boolean isGameOver() {
        return this.isGameOver;
    }
}

// Main Class to run the game
public class WordGuessGameApp {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the Scanner is automatically closed (Resource Management)
        try (Scanner scanner = new Scanner(System.in)) {
            
            // String array of possible words
            String[] possibleWords = {"java", "programming", "oop", "class", "object", "array"};
            
            // Select a random word (Math.random() generates [0.0, 1.0), casts to int for index)
            int randomIndex = (int) (Math.random() * possibleWords.length);
            String selectedWord = possibleWords[randomIndex];

            // 2. Create an Object (Instantiation): Initializes the game state
            WordGuessGame game = new WordGuessGame(selectedWord); 

            System.out.println("Welcome to Guess the Word! (Hangman style)");
            System.out.println("The word has " + selectedWord.length() + " letters.");

            // Game Loop: runs as long as the game is not over
            while (!game.isGameOver()) {
                game.displayGameStatus(); // Displays the current word, lives, and guesses
                
                System.out.print("Enter a letter guess: ");
                String input = scanner.nextLine().trim(); // Reads the entire line and removes whitespace

                // Robust Input Validation: Check if input is exactly one letter
                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    System.out.println("Invalid input. Please enter a single letter.");
                    continue; // Skips the rest of the loop and prompts for input again
                }

                // Pass the first character of the input String as the guess to the game logic
                game.makeGuess(input.charAt(0));
            }
        } // The scanner is closed automatically here
    }
}