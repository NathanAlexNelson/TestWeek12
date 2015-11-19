import java.util.Scanner;
import java.util.Arrays;

public class TestWeek12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*The ranges in the game should be 1-3, 4-6, 2-6, 7-12, 3-9, 10-18*/
		
		int c=0;
		int dices;
		int DSum;
		int Guess;
		int Played;
		int Score = 0;
		int PlayG = 0;
		int Success;
		int n = 0;
		
		int[] Scoreboard = new int[100]; //I created a 100 game scoreboard to print on the guesses of the game.
		
		/*The main program is set up to read
		 the variables that are given to the
		 program and provide the frame of the game.*/
		System.out.println("Welcome to a game of hi-low stakes!");
		
		while (n < 1){

		System.out.println("Would you like the high or the low values? \n 1. High \n 2. Low");
		Guess = input.nextInt();
		
		System.out.println("How many dice would you like to throw? \n 1 \n 2 \n 3");
		dices = input.nextInt();

		Dice Roll = new Dice(); //Initialize the dice class to roll
		
		DSum = Roll.Throw(dices); //Sum of the dice is returned here
		
		Played = Roll.Guess(Guess,dices,DSum);
		
		Success = Roll.getWin();
		
		Score = Score + (Success - Played);
		
		System.out.println("Your score: " + Score);
		
		PlayG = Roll.getPlayed() + PlayG;
		
		System.out.println(PlayG);
		System.out.println(c);
		
		

		Scoreboard[c] = Roll.getGuess(Guess);
		
		System.out.println("Your guess this round: " + Scoreboard[c]);
		
		/*The range is determined with a double if
		 statement that first checks what is guessed
		 then checks what the actual sum of the number
		 is compared to the guess.*/
		System.out.println("Would you like to play again \n 1. Yes \n 2. No");
		int q = input.nextInt();
		
		if (q == 1){
			System.out.println("You have chosen to play again!");
			n = 0;
		}
		else{
			System.out.println("You have chosen to quit playing...");
			n = 1;
			System.out.print(Arrays.toString(Scoreboard));
		}
		c++;
		}
	}
}