/**
 * This class is use to solve the secret number to any GuessingGame
 * @author Dechabhol Kotheeranurak
 *
 */
public class GameSolver {
	
	/**
	 * Play a NumberGame and return the solution.
	 * The NumberGame will provide and display the messages from the method getMessage()
	 * containing the phrase "too small" and "too large".
	 * 
	 * @param game is the NumberGame too solve
	 * @return solution
	 */
	
	public int play(NumberGame game) {
		int sol = 0;
		for (int i = 0;i < game.getUpperBound();i++) {
			sol++;
			if (game.guess(i)) {
				break;
			}
		}
		return sol;
	}

}
