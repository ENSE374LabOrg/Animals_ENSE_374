import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGenerator = new Random();
		Environment environment;
		int x;
		int y;
		int animals;
		Scanner in = new Scanner(System.in);
		int input = 0;
		do{
		System.out.println("What would you like to do?(Enter An Integer)");
		System.out.println("1.Introduction.");
		System.out.println("2.Start Simulation with Default .");
		System.out.println("3.Start Simulation with specific dimensions.");
		System.out.println("4.Start simulation with specific animals and default dimensions.");
		System.out.println("5.Start simulation with specific animals and specific dimensions.");
		
		input = in.nextInt();
		switch(input){
			case 1:
				System.out.println("This program shows a simulation for the Sask Wildlfe Federation.");
				System.out.println("Its a simulation of animals in a habitat.");
				System.out.println("Each animals moves a certain distance based on a set value of speed.");
				System.out.println("If 2 animals land on the same tile and their are predator and prey the prey will be eaten.");
				System.out.println("Simulation By Ahmed Shamiss");
				break;
			case 2:
				environment = new Environment();
				break;
			case 3:
				System.out.println("Please enter x dimension:");
				input = in.nextInt();
				x = input;
				System.out.println("Please enter y dimension:");
				input = in.nextInt();
				y = input;
				environment = new Environment(x,y,50);
				break;
			case 4:
				System.out.println("Please enter Number of animals in sim:");
				input = in.nextInt();
				animals = input;
				environment = new Environment(20,50,animals);
				break;
			case 5:
				System.out.println("Please enter x dimension:");
				input = in.nextInt();
				x = input;
				System.out.println("Please enter y dimension:");
				input = in.nextInt();
				y = input;
				System.out.println("Please enter Number of animals in sim:");
				input = in.nextInt();
				animals = input;
				environment = new Environment(x,y,animals);
				break;
		}
		}while(input == 1);
		do{
			System.out.println("What would you like to do Next?");
			System.out.println("1.Add an animal.");
			System.out.println("2.Remove an animal.");
			System.out.println("3.View Next Day.");
			System.out.println("4.Print Animals as a List.");
			System.out.println("5.Print Animals as a Map.");
			System.out.println("9.End Simulation.");
			input = in.nextInt();
			switch(input){
			case 1:
				
				break;
			case 9:
				break;
			default:
				System.out.println("Invalid input.");
				break;
			}
			
		}while(input != 9);
		}
}
