//Ittehad Qabid Java - Rolling Dice

import java.util.Random;
public class RollingDice 
{
		public static void main(String[] args) {
			int first_roll =
RollingDice.generateDiceRoll(1,6);
			int second_roll =
RollingDice.generateDiceRoll(1,6);
			System.out.println("First Dice is: " + first_roll);
			System.out.println("Second Dice is: " + second_roll);
			System.out.println("The Sum of Both Dice rolls are: " + (first_roll + second_roll));
		}
public static int generateDiceRoll(int min, int max) {
	Random r = new Random();
	return r.nextInt((max-min) +1) + min;
}
}
