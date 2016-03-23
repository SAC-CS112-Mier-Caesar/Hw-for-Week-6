import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userChoice;
		int computerNum;
		int playAgain;
		computerNum = 1 + (int) (Math.random() * 3);

		System.out.println("Lets play Rock, Paper, Scissors! Ready?..");
		do {
			System.out.print("Rock, Paper, or Scissors?(1=Rock, 2=Paper, 3=Scissors): ");

			userChoice = input.nextInt();

			if (userChoice == computerNum)
				System.out.println("Tie!");
			else if (userChoice == 1 && computerNum == 2)
				System.out.println("You Lose!");
			else if (userChoice == 1 && computerNum == 3)
				System.out.println("You win!");
			else if (userChoice == 2 && computerNum == 1)
				System.out.println("You win!");
			else if (userChoice == 2 && computerNum == 3)
				System.out.println("You Lose");
			else if (userChoice == 3 && computerNum == 1)
				System.out.println("You Lose");
			else if (userChoice == 3 && computerNum == 2)
				System.out.println("You win!");
			else
				System.out.println("You did not enter a valid value! Try again!");

			System.out.print("Want to play again? (1=Yes, 2=No): ");
			playAgain = input.nextInt();
		} while (playAgain == 1);
	}
}
