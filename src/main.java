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
		int type = 0;
		Environment environment = null;
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
		System.out.println("4.Start simulation with specific lifeforms and default dimensions.");
		System.out.println("5.Start simulation with specific lifeforms and specific dimensions.");
		
		input = in.nextInt();
		switch(input){
			case 1:
				System.out.println("This program shows a simulation for the Sask Wildlfe Federation.");
				System.out.println("Its a simulation of lifeforms in a habitat.");
				System.out.println("Each lifeforms moves a certain distance based on a set value of speed.");
				System.out.println("If 2 lifeforms land on the same tile and their are predator and prey the prey will be eaten.");
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
				System.out.println("Please enter Number of lifeforms in sim:");
				input = in.nextInt();
				animals = input;
				environment = new Environment(10,10,animals);
				break;
			case 5:
				System.out.println("Please enter x dimension:");
				input = in.nextInt();
				x = input;
				System.out.println("Please enter y dimension:");
				input = in.nextInt();
				y = input;
				System.out.println("Please enter Number of lifeforms in sim:");
				input = in.nextInt();
				animals = input;
				environment = new Environment(x,y,animals);
				break;
			default:
				System.out.println("Invalid input.");
				break;
		}
		}while(input == 1);
		do{
			System.out.println("What would you like to do Next?");
			System.out.println("1.Add a lifeform.");
			System.out.println("2.Remove a lifeform.");
			System.out.println("3.View Next Day.");
			System.out.println("4.Print lifeforms as a List.");
			System.out.println("5.Print lifeforms as a Map.");
			System.out.println("6.Skip n Days.");
			System.out.println("7.Skip to the end.");
			System.out.println("8.Check on a lifeform.");
			System.out.println("9.End Simulation.");
			input = in.nextInt();
			switch(input){
			case 1:
				System.out.println("Please Enter type of lifeform:");
				System.out.println("1.ShrubTree");
				System.out.println("2.Grass");
				System.out.println("3.Caterpillar2");
				System.out.println("4.Bluejay");
				System.out.println("5.Grasshopper");
				System.out.println("6.Mouse");
				System.out.println("7.Rabbit");
				System.out.println("8.Deer");
				System.out.println("9.Squirrel");
				System.out.println("10.Hawk");
				System.out.println("11.Fox");
				System.out.println("12.Wolf");
				type = in.nextInt();
				System.out.println("Please enter the x and y coordinates of the area you would like to insert you lifeform:");
				System.out.print("x:");
				x = in.nextInt();
				System.out.print("y:");
				y = in.nextInt();
				environment.add(type, x, y);
				break;
			case 2:
				System.out.println("Please Enter Coordinates of lifeform you want to kill:");
				System.out.print("x:");
				x = in.nextInt();
				System.out.print("y:");
				y = in.nextInt();
				environment.remove( x, y);
				break;
			case 3:
				environment.move();
				environment.checkhealth();
				environment.isEmpty();
				System.out.println("Move complete.");
				break;
			case 4:
				environment.print();
				if(environment.isEmpty()){
					System.out.println("World is Empty");
				}
				break;
			case 5:
				environment.printmap();
				break;
			case 6:
				System.out.println("Please Enter your N value:");
				type = in.nextInt();
				for(int i = 0; i < type ; i++){
					environment.move();
					environment.checkhealth();
					if(environment.isEmpty()){
						System.out.println("Day of extinction: " + i);
						System.out.println("The simulation is empty."); 
						System.out.println("Everything is dead press 9 to end."); 
						break;
					}
					
				}
				break;
			case 7:
				int daystaken = 0;
				while(!environment.isEmpty()){
					environment.move();
					environment.checkhealth();
					daystaken++;
				}
				System.out.println("Day of extinction: " + daystaken);
				System.out.println("The simulation is empty."); 
				System.out.println("Everything is dead press 9 to end."); 
				break;
			case 8:
				System.out.println("Please enter lifeform ID:");
				type = in.nextInt();
				environment.selector(type);
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
