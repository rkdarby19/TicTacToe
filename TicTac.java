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
			decision = gameMenu();
			if(decision < 0){
				System.out.println("You lose!");
			}else if(decision > 0){
				System.out.println("You win!");
			}else{
				System.out.println("Cat's Game!");
			}
			board.reset();
		}
		
		return 0;
	}
	public int menu(){
		//Small error here. After completing first game
		//it returns to this prompt but if the user inputs a number
		//it will stay with the prior "y" for the first game
		String temp = "";
		System.out.print("Play Game? (Y/N): ");
		temp = scan.nextLine();
		int holder = Integer.valueOf(temp.charAt(0));
		while( holder < 'A' || (holder > 'Z' && holder < 'a') || holder > 'z' ){
			System.out.print("Must input a letter: ");
			temp = scan.nextLine();
			holder = Integer.valueOf(temp.charAt(0));
		}
		while(!((temp.charAt(0) == 'n' || temp.charAt(0) == 'N') || (temp.charAt(0) == 'y' || temp.charAt(0) == 'Y'))){
				System.out.println("Unnacceptable!");
				System.out.print("Play a game? (Y/N): ");
				temp = scan.nextLine();
		}
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

			int cpuSpot = compChoose(board.getChoices());
			board.setChoices(5, cpuSpot);

			gameCheck = winCheck(board.getChoices());
			board.printBoard();
			if(gameCheck == 1){
				return gameCheck;	
			}else if(gameCheck == -1){
				return gameCheck;
			}
		}

	}
	public int compChoose(int[] choices){
		//plan to make randomizer for this
		for(int i = 0; i < choices.length; i++){
			if(choices[i] == 0){
				return i;
			}
		}
		return 0;
	}
	public int winCheck(int[] choices){
		if(choices[0] == 4){
			if(choices[1] == 4 && choices[2] == 4){
				return 1;
			}
			if(choices[3] == 4 && choices[6] == 4){
				return 1;
			}
			if(choices[4] == 4 && choices[8] == 4){
				return 1;
			}
		}
		if(choices[1] == 4){
			if(choices[4] == 4 && choices[7] == 4){
				return 1;
			}
		}
		if(choices[2] == 4){
			if(choices[5] == 4 && choices[8] == 4){
				return 1;
			}
			if(choices[4] == 4 && choices[6] == 4){
				return 1;
			}
		}
		if(choices[3] == 4 && choices[4] == 4 && choices[5] == 4){
			return 1;
		}
		if(choices[6] == 4 && choices[7] == 4 && choices[8] == 4){
			return 1;
		}


		if(choices[0] == 5){
			if(choices[1] == 5 && choices[2] == 5){
				return -1;
			}
			if(choices[3] == 5 && choices[6] == 5){
				return -1;
			}
			if(choices[4] == 5 && choices[8] == 5){
				return -1;
			}
		}
		if(choices[1] == 5){
			if(choices[4] == 5 && choices[7] == 5){
				return -1;
			}
		}
		if(choices[2] == 5){
			if(choices[5] == 5 && choices[8] == 5){
				return -1;
			}
			if(choices[4] == 5 && choices[6] == 5){
				return -1;
			}
		}
		if(choices[3] == 5 && choices[4] == 5 && choices[5] == 5){
			return -1;
		}
		if(choices[6] == 5 && choices[7] == 5 && choices[8] == 5){
			return -1;
		}
		return 0;
	}
}
