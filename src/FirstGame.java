import java.util.Random;
/**
 * Game of guessing a secret number in between the range of  0 - 100;
 * 
 * @author Dechabhol Kotheeranurak
 */
public class FirstGame extends NumberGame {
	/** upper bound for secret number */
	private int upperBound;
	 /** the solution to the game */
	private int secret;
	/** count the number of guesses*/
	private int count;
	
	/** 
	 * initialize the game
	 * @param upperbound
	 */
	public FirstGame ( int upperbound ) {
		this.upperBound = upperbound;
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		this.secret = rand.nextInt(upperbound) + 1;
		setMessage(String.format("I'm thinking of a number between 1 and %d.", upperBound));
		
	}
	
	/**
	 * Evaluate what the user have guess
	 * @param number is the user's guess
	 * @return true if correct or false if it isn't
	 */
	public boolean guess(int number) {
		count++;
		if (number == secret) {
			setMessage("Correct!");
			return true;
		}
		if (number > secret) {
			setMessage("Woah! Your answer is too large.");
		}
		else if (number < secret){
			setMessage("Woah! Your answer is too small.");
		}
		return false;
		
	}
	
	/**
	 * get the largest possible value for the solution
	 * It should be the upper bound of the secret number for the game
	 * @return upper bound
	 */
	public int getUpperBound() {
		return upperBound;
	}
	
	/**
	 * This method will return the number of times that the user has guess(es)
	 * @return count
	 */
	public int getCount() {
		return count;
	}
	
	/**
	 * The description of the game
	 *@return message 
	 */
	public String toString() {
		return "Guess a secret number between 1 and 100";
	}
	
	
	
	

}
