# Hw-for-Week-6
// Part 1

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



// Part 2
/*Exercise 3.1
a. public
b. class
c. new
d. type and name
e. default package
f. float and double
g. double precision
h. nextDouble
i. modifier
j. void
k. nextLine
l. java.lang
m. import declaration
n. floating-point number
o. single
p. %f
q. primitive and reference

Exercise 3.2
a. false. they start with lower case letters and all subsequent words in the name begin with a capital first letter
b. true
c. true
d. false. a reference to an object is required to invoke the object's methods
e. false. such variables are called local variables and can be used only in the method in which they are declared
f. true
g. false. primitive-type instance variables are initialized by default. Each local variable must explicitly be assigned a value
h. true
i. true
j. true
k. false. they are double by default

Exercise 3.3
A local variable is declared in the body of a method and can e used only from the point at which it is declared through the end of the method declaration. An instance variable is declared in a class, but not in the body of the class's methods. Also instance variable are accessible to all methods of the class.

Exercise 3.4
A parameter represents additional information that a method requries to perform its task. Each parameter required by a method is specified in the method's declaration. An argument is the actual value for a method parameter. When a method is called, the argument values are passed to the corresponding parameters of the method so that it can perform its task. */
