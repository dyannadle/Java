import java.util.Random;
import java.util.Scanner;

public class StonePaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"stone", "paper", "scissors"};
        int userScore = 0;
        int computerScore = 0;

        System.out.println("=== Stone Paper Scissors Game ===");
        System.out.print("Enter the number of rounds you want to play: ");
        int totalRounds = scanner.nextInt();

        System.out.println("\nYou will play " + totalRounds + " rounds against the computer!");
        System.out.println("Enter your choice: stone, paper, or scissors\n");

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("Round " + round + ":");
            System.out.print("Your choice: ");
            String userChoice = scanner.next().toLowerCase();

            // Validate user input
            if (!userChoice.equals("stone") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Please choose stone, paper, or scissors.");
                round--; // repeat the same round
                continue;
            }

            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // Determine round winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (userChoice.equals("stone") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("stone")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win this round!");
                userScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }

            System.out.println("Score -> You: " + userScore + " | Computer: " + computerScore);
            System.out.println("--------------------------------");
        }

        // Final result
        System.out.println("\n=== Final Result ===");
        if (userScore > computerScore) {
            System.out.println("🎉 Congratulations! You are the overall winner!");
        } else if (userScore < computerScore) {
            System.out.println("😢 Computer wins overall! Better luck next time!");
        } else {
            System.out.println("🤝 It's an overall tie!");
        }

        scanner.close();
    }
}
