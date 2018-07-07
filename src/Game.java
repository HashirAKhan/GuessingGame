import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Guessing Game! Enter a number to choose a level.");
		System.out.println();
		
		System.out.println("1. Beginner (between 1 and 10).");
		System.out.println("2. Intermediate (between 1 and 100).");
		System.out.println("3. Advanced (between 1 and 1,000).");
		System.out.println("4. Expert (between 1 and 10,000).");
		int level = input.nextInt();
		
		while (level < 1 || level > 4) {
			System.out.println("Sorry! That's not a level. Please enter a number from 1 to 4.");
			level = input.nextInt();
		}
		
		int targetNum = (int) (Math.random() * Math.pow(10, level)) + 1;
		System.out.println(targetNum);
		int guesses = 0;
		System.out.println("Enter a number to start guessing!");
		int userGuess = input.nextInt();
		
		while (userGuess != targetNum){
			System.out.println("Sorry! That's not it, try again.");
			 
			if (userGuess > targetNum) {
				System.out.println("That guess is too high!");
				userGuess = input.nextInt();
			} else {
				System.out.println("That guess is too low!");
				userGuess = input.nextInt();
			}			
			guesses++;
		}
		
		System.out.println("You've guessed the target number in " + guesses + " tries.");
	}
}	
