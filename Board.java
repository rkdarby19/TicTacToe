public class Board{
	//TESTING ADDITIONS
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
<<<<<<< HEAD
	//mutator to change spots chosen
	public void setChoices(int selection, int position){
		this.choices[position] = selection;
	}
	public int[] getChoices(){
		return this.choices;
	}
	public void printBoard(){
		//corresponding indexes for spots and choices
		// choices[0] == spots[1]
		// choices[1] == spots[5]
		// choices[2] == spots[9]
		// choices[3] == spots[23]
		// choices[4] == spots[27]
		// choices[5] == spots[31]
		// choices[6] == spots[47]
		// choices[7] == spots[51]
		// choices[8] == spots[55]

		for(int i = 0; i < choices.length; i++){
			int temp = choices[i];
			if(temp != 0){
				if(temp == 4){
					switch (i){
						case 0:
							spots[1] = 4;
							break;
						case 1:
							spots[5] = 4;
							break;
						case 2:
							spots[9] = 4;
							break;
						case 3:
							spots[25] = 4;
							break;
						case 4:
							spots[29] = 4;
							break;
						case 5:
							spots[33] = 4;
							break;
						case 6:
							spots[49] = 4;
							break;
						case 7:
							spots[53] = 4;
							break;
						case 8:
							spots[57] = 4;
							break;
					}
				}else{
					switch (i){
						case 0:
							spots[1] = 5;
							break;
						case 1:
							spots[5] = 5;
							break;
						case 2:
							spots[9] = 5;
							break;
						case 3:
							spots[25] = 5;
							break;
						case 4:
							spots[29] = 5;
							break;
						case 5:
							spots[33] = 5;
							break;
						case 6:
							spots[49] = 5;
							break;
						case 7:
							spots[53] = 5;
							break;
						case 8:
							spots[57] = 5;
							break;
					}
				}
			}
		}
=======
	public void printBoard(){
>>>>>>> bb069c34fb3ddf1ab6fdd167e4a59826e472e703
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
<<<<<<< HEAD
}
=======
}
>>>>>>> bb069c34fb3ddf1ab6fdd167e4a59826e472e703
