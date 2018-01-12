import java.util.Random;
/**
 * Game of guessing a secret number in between the range of  0 - 100;
 * 
 * @author Dechabhol Kotheeranurak
 */
public class FirstGame extends NumberGame {
	
	private int upperBound;
	private int secret;
	private int count;
	
	public FirstGame ( int upperbound ) {
		this.upperBound = upperbound;
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		this.secret = rand.nextInt(100) + 1;
		System.out.printf("I'm thinking of a number between 1 and %d.\n", upperBound);
		
	}
	
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
	
	public int getUpperBound() {
		return upperBound;
	}
	
	public int getCount() {
		return count;
	}
	
	public String toString() {
		return "Guess a secret number between 1 and 100";
	}
	
	
	
	

}
