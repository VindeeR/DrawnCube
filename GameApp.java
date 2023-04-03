				///////////////////
				//  GameApp.java //
				//  Erick Lopes  //
				//    2219550    //
				//   08/03/2023  //
				///////////////////
import javax.swing.JOptionPane;
import java.util.Arrays;

				public class GameApp{
	public static void main (String args[]){

		// Declare and create objects
		int totalResult = 0, numGames, numRounds = 0;
		Boolean different = true;
		Bag myBag = new Bag();

		// Input
		numGames = Integer.parseInt(JOptionPane.showInputDialog(null, "Select the quantity of games you wish to play"));

		do{

			//Declare //The following 2 lines are declared here in order to refresh each new round
			int  roundResult = 0;
			String [] color = new String[4];

			//In order to generate an optimization its used an Array to hold all the Dice generated in all rounds
			for (int i = 0; i < 4; i++) {
				// Process to get the color of a rolled die
				myBag.compute();
				color[i] = myBag.getColorGenerated();

				//Input used to test of each rule
				//color[0] = "Green"; color[1] = "Green"; color[2] = "Green"; color[3] = "Green";
			}

			//Application of the first rule that says if First and Last Die are equal in color add 50 points
			if(color[0] == color[color.length-1]){
				roundResult += 50;
			}

			//Application of the third rule that says if all Dice are the same in color add 110 points
			if(color[0] == color[1] && color[1] == color[2] && color[2] == color[3]){
				roundResult += 110;
			}

			//Validation of the second rule that says if all Dice are different in color subtract 26 points
			different = true;
			for (int i = 0; i < color.length - 1; i++) {
				for (int j = i+1; j < color.length; j++){
					if(color[i] == color[j]){
						different = false;
						break;
					}
				}
			}

			//Application of the second rule
			if(different == true){
				roundResult -= 26;
			}

			//Score total of all games played being registered and updating number of rounds played
			totalResult += roundResult;
			numRounds++;

			//Message with the result of the game played
			JOptionPane.showMessageDialog(null, "The dice drawn in this Game was\n  "+color[0]+"\n  "+color[1]+"\n  "+color[2]+"\n  "+color[3]+"\n\n"+"Score of the "+ numRounds +" round is: "+ roundResult);

		}while( numGames > numRounds );

		//Message with the result of all the games played
		JOptionPane.showMessageDialog(null, "Total score of all games is: "+ totalResult +
																	"\nThe Total of rounds chosen was: "+ numGames);
	} // main
} // class
