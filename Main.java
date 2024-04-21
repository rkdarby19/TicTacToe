import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Board board = new Board();

		boolean endGame = false;
		
		TicTac game = new TicTac(scan, board);

		while(!endGame){
			game.game();
			endGame = true;
		}
	}
}
