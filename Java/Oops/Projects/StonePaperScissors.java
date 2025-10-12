// Import necessary Java utility classes
import java.util.Random;   // For generating random choices for the computer
import java.util.Scanner;  // For reading user input from the keyboard

// Define the main class
public class StonePaperScissors {
    public static void main(String[] args) {
        
        // Create objects for user input and random number generation
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Array containing the possible choices
        String[] choices = {"stone", "paper", "scissors"};

        // Initialize score counters for user and computer
        int userScore = 0;
        int computerScore = 0;

        // Display the game title and ask the user how many rounds to play
        System.out.println("=== Stone Paper Scissors Game ===");
        System.out.print("Enter the number of rounds you want to play: ");
        int totalRounds = scanner.nextInt();  // Read number of rounds from user

        // Display basic game information
        System.out.println("\nYou will play " + totalRounds + " rounds against the computer!");
        System.out.println("Enter your choice: stone, paper, or scissors\n");

        // ============================
        // 🎮 Game Loop Starts Here
        // ============================
        for (int round = 1; round <= totalRounds; round++) {
            // Display round number
            System.out.println("Round " + round + ":");
            
            // Ask the user for their move
            System.out.print("Your choice: ");
            String userChoice = scanner.next().toLowerCase(); // Convert to lowercase for consistency

            // ----------------------------
            // ✅ Input Validation Section
            // ----------------------------
            // If user enters something other than stone/paper/scissors, ask again
            if (!userChoice.equals("stone") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Please choose stone, paper, or scissors.");
                round--;    // Decrease round count so the same round is repeated
                continue;   // Skip rest of loop and restart this round
            }

            // ----------------------------
            // 💻 Computer's Turn
            // ----------------------------
            // Randomly select an index (0–2) to pick computer’s move
            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // ----------------------------
            // ⚔️ Determine Round Winner
            // ----------------------------
            if (userChoice.equals(computerChoice)) {
                // Both chose the same → tie
                System.out.println("It's a tie!");
            } else if (
                // Player's winning conditions:
                (userChoice.equals("stone") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("stone")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win this round!");
                userScore++; // Increase player’s score
            } else {
                System.out.println("Computer wins this round!");
                computerScore++; // Increase computer’s score
            }

            // ----------------------------
            // 📊 Display Current Score
            // ----------------------------
            System.out.println("Score -> You: " + userScore + " | Computer: " + computerScore);
            System.out.println("--------------------------------");
        }

        // ============================
        // 🏁 Game Over – Final Result
        // ============================
        System.out.println("\n=== Final Result ===");

        // Compare scores to declare final winner
        if (userScore > computerScore) {
            System.out.println("🎉 Congratulations! You are the overall winner!");
        } else if (userScore < computerScore) {
            System.out.println("😢 Computer wins overall! Better luck next time!");
        } else {
            System.out.println("🤝 It's an overall tie!");
        }

        // Close scanner to prevent resource leak
        scanner.close();
    }
}
