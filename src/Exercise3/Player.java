package Exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class Player {
	
	protected String name;
	protected char mark; //The mark which the player will be using
	protected Board board;
	protected Player opponent;
	
	
	Scanner scan = new Scanner(System.in);
	/**
	 *  Calls makeMove method to ask for player input. 
	 * The board is displayed after a move has been made.
	 * Check if one of the players has won the game or not, or if the board is full. 
	 */
	abstract public void play();
	
	

	/***
	 * Asks for player input, which is subsequently passed as 
	 * arguments in addMark function. 
	 * addMark function marks a spot on the board.
	 */
//	private	void makeMove() {
//		
//		System.out.println(name+", what row should your "
//		+mark+" be placed in?");
//		int row = scan.nextInt();
//		System.out.println(name+", what column should your "
//				+mark+" be placed in?");
//		int col = scan.nextInt();
//		board.addMark(row, col, mark);
//	}
	
	abstract public void makeMove(); 
	/**
	 * sets the opponent
	 * @param opponent: the opponent to the player
	 */
	public void setOpponent(Player opponent) {
		this.opponent = opponent;
	} 
	
	/**
	 * sets the board
	 * @param board
	 */
	public void setBoard(Board board) {
		this.board = board;
	}
	
	
	
	/***
	 * This function checks if the condition to terminate the game is met, includes:
	 * xPlayer/oPlayer wins
	 * board is full.
	 * Returns a boolean value.
	 */
//	private boolean checkWin(){
//		
//		if (board.oWins()==true||board.xWins()==true||board.isFull()==true) {
//			return false;
//		}
//		else return true;
//	}
//	
	

//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String playerName) {
		this.name = playerName;
	}

	public char getPlayerMark() {
		return mark;
	}

	public void setPlayerMark(char playerMark) {
		this.mark = playerMark;
	}
	
	public Board getBoard() {
		return board;
	}


	public Player(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	public Player getOpponent() {
		return opponent;
	}
}