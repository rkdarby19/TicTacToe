public class Board{
	private int[] choices;
	private int[] spots;

	public Board(){
		//   |   |   
		//-----------
		//   |   |   
		//-----------
		//   |   |   
		this.choices = new int[]{0,0,0,0,0,0,0,0,0};
		this.spots = new int[]{0,0,0,1,0,0,0,1,0,0,0,2,
				       3,3,3,3,3,3,3,3,3,3,3,2,
				       0,0,0,1,0,0,0,1,0,0,0,2,
				       3,3,3,3,3,3,3,3,3,3,3,2,
				       0,0,0,1,0,0,0,1,0,0,0,2};
	}
	public void printBoard(){
		for(int i: spots){
			switch (i){
				case 0:
					System.out.print(" ");
					break;
				case 1:
					System.out.print("|");
					break;
				case 2:
					System.out.print("\n");
					break;
				case 3:
					System.out.print("-");
					break;
				case 4:
					System.out.print("X");
					break;
				case 5:
					System.out.print("O");
					break;
				default:
					System.out.println("ERROR!");
					break;
			}
		}
	}
}
