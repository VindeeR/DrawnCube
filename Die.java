				///////////////////
				//   Die.java    //
				//  Erick Lopes  //
				//    2219550    //
				//   08/03/2023  //
				///////////////////

// To keep code organized and coherent, it was decided to create an object that would represent the die;
// This way if any new implementation or change is needed it can be done without interference with the rest of the code;
import java.lang.Math;
public class Die {
    // Declare variables
    private int color; // this variable is used to store the number that represents the color of the die

    // Generate a random number from 0 to 7
    public void computeColor() {
        //Select a random number to represent the color of the die
        color = (int)(Math.random() * 8);
    }

    // Getters and Setters

    public int getColor() {
        return color;
    }
}