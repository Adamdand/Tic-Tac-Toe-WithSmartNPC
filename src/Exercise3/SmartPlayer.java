package Exercise3;

public class SmartPlayer extends BlockingPlayer {

	public SmartPlayer(String name, char mark) {
		super(name, mark);
		// TODO Auto-generated constructor stub
	}
	
	public void makeMove() {
		while (true){
		System.out.println(name+" is thinking...");

		int row = randomNumber.discrete(0, 2);
		int col = randomNumber.discrete(0, 2);
	
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(testForBlocking(i,j)==true) {
					row = i;
					col = j;
				}
			}
		}
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(testForWinning(i,j)==true) {
					row = i;
					col = j;
				}
			}
		}
		
		
	
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
	
	public boolean testForWinning(int row, int col) {
		char myMoves = getPlayerMark();
		
		if(board.getMark(row,col) == SPACE_CHAR) {
			//Check verticals
			if(row ==1 ) {
				if(board.getMark(row+1, col)== myMoves && board.getMark(row-1, col)== myMoves) {
					return true;
				}
			}
			if(row ==0 ) {
				if(board.getMark(row+1, col)== myMoves && board.getMark(row+2, col)== myMoves) {
					return true;
				}
			}
			if(row ==2 ) {
				if(board.getMark(row-1, col)== myMoves && board.getMark(row-2, col)== myMoves) {
					return true;
				}
			}
			//Check Horrizontals
			if(col ==0 ) {
				if(board.getMark(row, col+1)== myMoves && board.getMark(row, col+2)== myMoves) {
					return true;
				}
			}
			if(col ==1 ) {
				if(board.getMark(row, col+1)== myMoves && board.getMark(row, col-1)== myMoves) {
					return true;
				}
			}
			if(col ==2 ) {
				if(board.getMark(row, col-1)== myMoves && board.getMark(row, col-2)== myMoves) {
					return true;
				}
			}
			//check diagonals
			if(col == 0 && row == 0 ) {
				if(board.getMark(row+1, col+1)== myMoves && board.getMark(row+2, col+2)== myMoves) {
					return true;
				}
			}
			if(col == 1 && row == 1 ) {
				if(board.getMark(row+1, col+1)== myMoves && board.getMark(row-1, col-1)== myMoves) {
					return true;
				}
			}
			if(col == 2 && row == 2 ) {
				if(board.getMark(row-1, col-1)== myMoves && board.getMark(row-2, col-2)== myMoves) {
					return true;
				}
			}
			
		}
		else {
			return false;
		}
		return false;
	}
	

}
