package Exercise3;

public class RandomPlayer extends Player implements Constants{
	
	RandomGenerator randomNumber = new RandomGenerator();

	public RandomPlayer(String name, char mark) {
		super(name, mark);
		// TODO Auto-generated constructor stub
	}
	
	public void play() {
		
		makeMove();
		board.display();
		
	}
	public void makeMove()
{
		while (true){
		System.out.println(name+" is thinking...");

		int row = randomNumber.discrete(0, 2);
		int col = randomNumber.discrete(0, 2);
	
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
	/**
	public int randomNumber() {
		int randomNum = 0 + (int)(Math.random()*2);
		
		return randomNum;
	}*/
	

}