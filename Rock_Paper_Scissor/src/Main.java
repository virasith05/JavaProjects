import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        boolean yn = true;
        System.out.println("Welcome to Rock Paper Scissor Game");

        while (yn) {
            System.out.println("###################################");
            System.out.print("Do you want to play this game (yes/no): ");
            String game = scanner.next().toLowerCase();

            switch (game) {
                case "yes" -> playGame();
                case "no" -> {
                    yn = false;
                    System.out.println("Thank you for playing!");
                }
                default -> System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
        scanner.close();
    }

    static void playGame() {
        String[] com = {"rock", "paper", "scissor"};

        System.out.print("Enter your move (rock/paper/scissor): ");
        String guess = scanner.next().toLowerCase();

        String comChoice = com[random.nextInt(3)];
        System.out.println("Computer move: " + comChoice);

        if (guess.equals(comChoice)) {
            System.out.println("It's a tie!");
        } else if (guess.equals("rock") && comChoice.equals("scissor")) {
            System.out.println("You win!");
        } else if (guess.equals("rock") && comChoice.equals("paper")) {
            System.out.println("You lose!");
        } else if (guess.equals("paper") && comChoice.equals("scissor")) {
            System.out.println("You lose!");
        } else if (guess.equals("paper") && comChoice.equals("rock")) {
            System.out.println("You win!");
        } else if (guess.equals("scissor") && comChoice.equals("rock")) {
            System.out.println("You lose!");
        } else if (guess.equals("scissor") && comChoice.equals("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("Invalid input. Please enter rock, paper, or scissor.");
        }
    }
}
