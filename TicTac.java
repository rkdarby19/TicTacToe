import java.util.Scanner;

public class TicTac{
	private Scanner scan;
	private Board board;
	public TicTac(Scanner scan, Board board){
		this.scan = scan;
		this.board = board;
	}
	public int game(){
		System.out.println("Welcome to TicTacToe!");
		board.setChoices(4,1);			
		board.printBoard();
		
		return 0;
	}
}
