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
		Scanner in = new Scanner(System.in);
		int input = 0;
		lifeform[][] environment = new lifeform[20][50];
		for(int i =0; i < 20; i++){
			int randomx = randomGenerator.nextInt(20);
			int randomy = randomGenerator.nextInt(50);
			int randomlifeform = randomGenerator.nextInt(11);
			
			if(randomlifeform == 0){
				environment[randomx][randomy] = new ShrubTree() ;
			}
			if(randomlifeform == 1){
				environment[randomx][randomy] = new Grass() ;
			}
			if(randomlifeform == 2){
				environment[randomx][randomy] = new Caterpillar() ;
			}
			if(randomlifeform == 3){
				environment[randomx][randomy] = new Bluejay() ;
			}
			if(randomlifeform == 4){
				environment[randomx][randomy] = new Grasshopper() ;
			}
			if(randomlifeform == 5){
				environment[randomx][randomy] = new Mouse() ;
			}
			if(randomlifeform == 6){
				environment[randomx][randomy] = new Deer() ;
			}
			if(randomlifeform == 7){
				environment[randomx][randomy] = new Hawk() ;
			}	
			if(randomlifeform == 8){
				environment[randomx][randomy] = new Fox() ;
			}
			if(randomlifeform == 9){
				environment[randomx][randomy] = new Squirrel() ;
			}
			if(randomlifeform == 10){
				environment[randomx][randomy] = new Rabbit() ;
			}
			if(randomlifeform == 11){
				environment[randomx][randomy] = new Wolf() ;
			}			
		}		
		for(int i=0;i<20;i++){
			for(int j =0; j<50; j++){
				
				if(environment[i][j] != null){
					System.out.println(environment[i][j].getType() + " Position: " + i +" , " + j);
				}
					
			}
		}
		do{
			System.out.println("What would you like to do?");
			System.out.println("1.View Next Day.");
			System.out.println("9.End Simulation.");
			input = in.nextInt();
			switch(input){
			case 1:
				for(int i=0;i<20;i++){
					for(int j =0; j<50; j++){
						int randomdirection = randomGenerator.nextInt(1);
						if(environment[i][j] != null){
							lifeform temp;
							temp = environment[i][j];
							if(randomdirection == 0){
								if(environment[i][j].getspeed() + i > 20){
									int tempint = environment[i][j].getspeed() + i - 20;
								}
								else{
									
								}
							}
							if(randomdirection == 1){
								if(environment[i][j].getspeed() + j > 50){
									int tempint = environment[i][j].getspeed() + j - 50;
									
								}
								else{
									
								}
							}
							
						}
							
					}
				}
				for(int i=0;i<20;i++){
					for(int j =0; j<50; j++){
						if(environment[i][j] != null){
							System.out.println(environment[i][j].getType() + " Position: " + i +" , " + j);
						}
							
					}
				}
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
