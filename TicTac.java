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
		
		int quit = 0;
		int decision = 0;

		while(quit == 0){
			quit = menu();
			if(quit == 1){
				break;		
			}
			gameMenu();
			if(decision < 0){
				System.out.println("You lose!");
			}else if(decision > 0){
				System.out.println("You win!");
			}else{
				System.out.println("Cat's Game!");
			}
		}
		
		return 0;
	}
	public int menu(){
		System.out.print("Play Game? (Y/N): ");
		String temp = scan.nextLine();
		if(temp.charAt(0) == 'n' || temp.charAt(0) == 'N'){
			return 1;
		}else{
			return 0;
		}
	}
	public int gameMenu(){
		int userSpot = -1;
		while(true){
			System.out.println();
			board.printBoard();
			System.out.print("Where would you like to go? (1-9): ");
			String newTemp = scan.nextLine();
			userSpot = Integer.valueOf(newTemp);
			userSpot--;
			while(userSpot < 0 || userSpot > 8){
				System.out.println("Invalid selection. Choose again.");
				newTemp = scan.nextLine();
				userSpot = Integer.valueOf(newTemp);
				userSpot--;
			}
			while(board.getChoice(userSpot) != 0){
				System.out.println("Invalid, spot in use. Choose again.");
				newTemp = scan.nextLine();
				userSpot = Integer.valueOf(newTemp);
				userSpot--;
			}
			board.setChoices(4, userSpot);
			
			board.printBoard();
			int gameCheck = winCheck(board.getChoices());
			if(gameCheck == 1){
				return gameCheck;	
			}else if(gameCheck == -1){
				return gameCheck;
			}

		}

	}
	public int winCheck(int[] choices){
		
		return 0;
	}
}
