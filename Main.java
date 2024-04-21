import java.util.Scanner;

public class Main{
	public static void main(String[] args){
<<<<<<< HEAD
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
=======
		Board board = new Board();

		board.printBoard();
		boolean endGame = false;
		
		while(!endGame){
			System.out.println("test");
		}
	}
}
>>>>>>> bb069c34fb3ddf1ab6fdd167e4a59826e472e703
