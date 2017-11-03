import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PigGame {

	public static void main(String[] args) {
		if (args.length == 1 && (Integer.parseInt(args[0]) == 2 || Integer.parseInt(args[0]) == 3 || Integer.parseInt(args[0]) == 4)) {
			// For possible rematches.
			Scanner playerSetUp = new Scanner(System.in);
			// Determine players 2-4
			int playerSize = Integer.parseInt(args[0]) ;
			ArrayList<Integer> score = new ArrayList<Integer>(playerSize);
			int indexCreate = 1;
			while (indexCreate <= playerSize) {
				score.add(0);
				indexCreate++;
			}
			System.out.println(" ");
			System.out.println("Welcome to PigGame, where each person rolls a single dice and reach for 100.\n"
							+"Each player can keep throwing the dice by entering \"Roll\". To win the game, a player must reach 100 points.\n"
							+"Players can try to get 100 in one round or end their turn to add their current round score to thier total.\n"
							+"If the player rolls a 1, the current score for their round is lost and the next player goes.\n"
							+"During each players round they choose to keep their current score per round to their total\n"
							+"if they enter \"Hold\", but that means their turn is over.\n"
							+"Players can also check the current scores by entering \"Print\". \n"
							+"If any player wishes to quit, they can enter \"quit\", but this also means the entire game is forefiet.\n"
							+"Now that instuctions have been provided, game on!!!");
			System.out.println(" ");
		
			// Establish Players, Scores and other objects.
			boolean playing = true;
			boolean winner = false;
			
			Scanner action = new Scanner(System.in);
			String decision = "";
			int scorePerRound = 0;
			int dice = 0;
			int turnRotate;
			
			
			
			while (playing == true) {
				
				
			
				OUTER:
				for (turnRotate = 1; turnRotate <= playerSize; turnRotate+=0  ) {
					System.out.println("\tPlayer" + turnRotate + "'s turn.");
					System.out.println("What is your next move?");
					decision = action.nextLine();
					// For the score to resume from their current total each round.
					if (scorePerRound == 0) {
						scorePerRound = score.get(turnRotate-1);
					}
					switch (decision) {
						case "ROLL": case "Roll": case "roll": 
								dice = diceRoll(dice);
								System.out.println("\tDice is " + dice);
								if (dice == 1) {
									scorePerRound = 0;
									System.out.println("Player " + turnRotate + "'s turn has ended and score is back to: " + scorePerRound + ".");
									System.out.println("Now it's time for the next player's turn.");
									turnRotate++;
								}
								else {
									scorePerRound += dice;
									System.out.println("Current total this round: " + (scorePerRound - score.get(turnRotate-1)));
									System.out.println("If player holds now: " + scorePerRound);
									if (scorePerRound >= 100) {
										winner = true;
										break OUTER;
									}
								}
								break;
						case "HOLD": case "Hold": case "hold":
							System.out.println("Player " + turnRotate + "'s turn has ended.");
							System.out.println("Now it's time for the next player's turn.");
							totalPointSum(score, scorePerRound, turnRotate);
							scorePerRound = 0;
							turnRotate++;
							break;
						case "PRINT": case "Print": case "print":
							System.out.println("So far the score for this round if you \"HOLD\" now: " + (scorePerRound - score.get(turnRotate-1)));
							int i = 0;
							while (i < playerSize) {
								System.out.println("Total score for PLAYER " + (i+1) + ": " + score.get(i));
								i++;
								}
							break;
						case "QUIT": case "Quit": case "quit":
							playing = false;
							System.out.println("Someone forefieted the match. No contest.");
							break OUTER;
						default: 
							System.out.println("You did not enter a valid command. Please try again.");
							break;
					
					}
				
			} 
			if (winner == true) {
				System.out.println("Player " + turnRotate + " wins!!!");
				boolean goOrLeave = false;
				do {
				System.out.println("Now you have a choice. Do you want to play again: ");
				
				decision = action.nextLine();
					switch (decision) {
					case "yes": case "Yes": case "YES":
						score.clear();
						System.out.println("How many players do you want this time?");
						indexCreate = 1;
						playerSize = playerSetUp.nextInt();
						if (playerSize <= 1 || playerSize >=5) {
							System.out.println("Remember, the size must be 2-4. Perhaps you should reconsider if you don't have enough players now.");
							break;
						}
						while (indexCreate <= playerSize) {
							score.add(0);
							indexCreate++;
						}
						scorePerRound = 0;
						goOrLeave = true;
						winner = false;
						break;
					case "no": case "No": case "NO":
						System.out.println("Goodbye.");
						playerSetUp.close();
						goOrLeave = true;
						playing = false;
						break;
					default: 
						System.out.println("You haven't entered a valid command. Enter \"yes\", or \"no\". ");
						System.out.print("I repeat: ");
						break;
					}
				} while (goOrLeave == false);
			}
		}
			action.close();
	}
	else {
		System.out.println("To run this game please give the size of players from 2, 3, or 4 when you run this game.");
	}
}
	

	// Rolling Dice
	public static int diceRoll(int dice) {
		dice = 50;
		Random generator = new Random();
		do {
			dice = generator.nextInt(6) + 1;
		} while (dice == 0);
		return dice;
	}

	// Adding current score and total score
	public static ArrayList<Integer> totalPointSum(ArrayList<Integer> totalScore, int scoreThisRound, int currentPlayer) {
		totalScore.set(currentPlayer-1, scoreThisRound);
		return totalScore;
	}
	
}
