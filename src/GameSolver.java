/**
 * This class is use to solve the secret number to any GuessingGame
 * @author Dechabhol Kotheeranurak
 *
 */
public class GameSolver {
	
	/**
	 * Play a NumberGame and return the solution.
	 * The NumberGame will provide the messages from the method getMessage()
	 * containing the phrase "too small" and "too large".
	 * 
	 * @param game is the NumberGame too solve
	 * @return solution
	 */
	
	public int play(NumberGame game) {

		
		int max = game.getUpperBound();
		int min = 0;
		int solution;
		boolean a = false;
		do {
			solution = (max + min)/2;
			a = game.guess(solution);
			if (game.getMessage().contains("small")) {
				min = solution;
			}
			if (game.getMessage().contains("large")) {
				max = solution;
			}
		} while (!a);
		return solution;
	
	}

}
