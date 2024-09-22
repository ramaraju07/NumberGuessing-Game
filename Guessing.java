import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 1000;
        int random = min + (int) (Math.random() * (max - min + 1));
        int Tries = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between " + min + " and " + max + ". Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int Guess = scanner.nextInt();
            Tries++;

            if (Guess == random) {
                System.out.println("Congratulations! You guessed the correct number: " + random);
                System.out.println("Total tries: " + Tries);
                break;
            } else if (Guess < random) {
                System.out.println("Too low! Try a higher number.");
            } else { 
                System.out.println("Too high! Try a lower number.");
            }
        }
    }
}