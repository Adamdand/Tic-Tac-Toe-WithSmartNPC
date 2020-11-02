package Exercise3;

import java.util.Scanner;

public class HumanPlayer extends Player implements Constants {

	public HumanPlayer(String name, char mark) {
		super(name, mark);
		// TODO Auto-generated constructor stub
	}
	
	Scanner scan = new Scanner(System.in);
	/**
	 *  Calls makeMove method to ask for player input. 
	 * The board is displayed after a move has been made.
	 * Check if one of the players has won the game or not, or if the board is full. 
	 */
	public void play() {
		
	
			makeMove();
			board.display();

	}
	
	public void makeMove()
{
		while (true){
		System.out.println(name+", what row should your "
		+mark+" be placed in?");
		int row = scan.nextInt();
		System.out.println(name+", what column should your "
				+mark+" be placed in?");
		int col = scan.nextInt();
		
		if (board.getMark(row, col)==SPACE_CHAR) {
			board.addMark(row, col, mark);
			break;
			
		}
		else if(board.isFull()) {
			System.out.println("The board is full");
			break;
			
		}
		else {
			System.out.println("Please choose another spot");
		}
	}
	
}
	

}
