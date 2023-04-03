				///////////////////
				//    Bag.java   //
				//  Erick Lopes  //
				//    2219550    //
				//   08/03/2023  //
				///////////////////


public class Bag {
	// Declare variables and pool of colors to be chosen
	private String colorGenerated;
	private String [] colorPool = {"Green","Green","Green","Green","Yellow","Yellow","Orange","white"};

	//Whenever we create a bag we create a die that will be selected
	Die die = new Die();

	// Compute the color of the die decided
	public void compute(){
		die.computeColor();
		colorGenerated = colorPool[die.getColor()];
	}

	// Getters and Setters
	public String getColorGenerated(){
		return colorGenerated;
	}

}