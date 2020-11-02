package Exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Referee {
	private Player xPlayer; //xPlayer Player using X marker.
	private Player oPlayer; //oPlayer Player using O marker.
	private Board board;
	
	
	/***
	 * Initializes X and O player and their opponents.
	 * Shows the empty board.
	 * Begin the game.
	 */
	public void runTheGame() {
		
		xPlayer.setOpponent(oPlayer);
		oPlayer.setOpponent(xPlayer);
		board.display();
		while(board.checkWin()==false) {
			xPlayer.play();
			oPlayer.play();
			 if (board.isFull()) {
					System.out.println("full board!");
					break;
				}
			
		}
	if (board.xWins()==true&&xPlayer.getPlayerMark()=='X') {
		System.out.println("THE GAME IS OVER: "+xPlayer.getName()+" is the winner!");
	}
	else if (board.xWins()==true&&oPlayer.getPlayerMark()=='X') {
		System.out.println("THE GAME IS OVER: "+oPlayer.getName()+
				"is the winner!");
	}
	else if (board.oWins()==true&&xPlayer.getPlayerMark()=='O') {
		System.out.println("THE GAME IS OVER: "+xPlayer.getName()+" is the winner!");
	}
	else if (board.oWins()==true&&oPlayer.getPlayerMark()=='O') {
		System.out.println("THE GAME IS OVER: "+oPlayer.getName()+
				" is the winner!");
	}
	else if (board.isFull()) {
		System.out.println("Tie game!");
	}
		
		
		
		
	}
	

//getters and setters
	public Player getxPlayer() {
		return xPlayer;
	}
	public void setxPlayer(Player xPlayer) {
		this.xPlayer = xPlayer;
	}
	public Player getoPlayer() {
		return oPlayer;
	}
	public void setoPlayer(Player oPlayer) {
		this.oPlayer = oPlayer;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	
}
