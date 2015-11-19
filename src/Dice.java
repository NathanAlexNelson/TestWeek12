
public class Dice {
	private int Wins, PlayG;
	public int Throw (int dices){
		int DTotal = 0;
		
		for (int x = 1; x<=dices; x++){
			int D = 1 + (int) (Math.random() * 6);
			DTotal = DTotal + D; // Dice rolls are saved here to create the sum of dice.
		}
		return DTotal; // The DTotal is the sum of all the dice.
		}
	
	public int Guess(int Guess, int dices, int DSum){
		int Game = 0;
		int Win = 0;
		int Played = 0;
		if (Guess == 1){ //The guess is read here
			System.out.println("You have chosen the High values!");
			
			if ((DSum>=1*dices) && (DSum <=3*dices)){ //Checks to see validity of the guesses vs. the actual number.
				System.out.println("You have guessed wrong!");
				Game++;
				Played++;
			}
			else if ((DSum>3*dices) && (DSum <=6*dices)){
				System.out.println("You have guessed right!");
				Win++;
				Played++;
			}
			System.out.println("The sum of the dice is " + DSum);
			

		}
		
		else if (Guess == 2){ //The low numbers have been chosen
			System.out.println("You have chosen the Low values!");
			
			if ((DSum>=1*dices) && (DSum <=3*dices)){ // checking the dice roles to make sure the roles are high or low.
				System.out.println("You have guessed right!");
				Win++;
				Played++;
			}
			else if ((DSum>3*dices) && (DSum <=6*dices)){
				System.out.println("You have guessed wrong!");
				Game++;
				Played++;
			}
			
			System.out.println("The sum of the dice is " + DSum);
			
		}
		
		
		
		else { //Code terminated for improper guess
			System.out.println("Not a valid guess! Try again.");
		}
		Wins = Win;
		PlayG = Played;
		return Game;
	}
	public int getWin(){
		return Wins;
	}
	public int getPlayed(){
		return PlayG;
	}
	public int getGuess(int Guess){
	return Guess;
	}
}

