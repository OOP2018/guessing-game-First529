/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100;
		NumberGame game = new FirstGame(upperBound);
		GameConsole ui = new GameConsole( );
		GameSolver s = new GameSolver();
		int solution = ui.play( game );
		System.out.printf("The secret number is %d and the total guesse(s) is %d", solution, game.getCount() );
		System.out.println(s.play(game));
	}
}
