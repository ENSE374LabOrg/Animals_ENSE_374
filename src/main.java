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
		for(int i =0; i < 50; i++){
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
		int counter = 1;
		for(int i=0;i<20;i++){
			for(int j =0; j<50; j++){
				
				if(environment[i][j] != null){
					System.out.println(counter +"."+environment[i][j].getType() + " Position: " + i +" , " + j);
					counter++;
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
						int randomdirection = randomGenerator.nextInt(100);
						if(environment[i][j] != null){
							lifeform temp;
							temp = environment[i][j];
							if(randomdirection >= 50){
								int tempint = environment[i][j].getspeed() + i;
								if(tempint >= 20){
									tempint -= 20;
									if(environment[tempint][j] != null){
										int results = environment[i][j].meet(environment[tempint][j]);
										if(results == 0){
											
											environment[i][j] = null;
											environment[tempint][j] = temp;
										}
										if(results == 1){
											environment[i][j] = environment[tempint][j];
											environment[tempint][j] = null;
										}
										if(results == 2){
											environment[i][j] = environment[tempint][j];
											environment[tempint][j] = temp;
										}
										
									}
									else{
										environment[i][j] = environment[tempint][j];
										environment[tempint][j] = temp;
									}
								}
								else{
									if(environment[tempint][j] != null){
										int results = environment[i][j].meet(environment[tempint][j]);
										if(results == 0){
											
											environment[i][j] = null;
											environment[tempint][j] = temp;
										}
										if(results == 1){
											environment[i][j] = environment[tempint][j];
											environment[tempint][j] = null;
										}
										if(results == 2){
											environment[i][j] = environment[tempint][j];
											environment[tempint][j] = temp;
										}
									}
									else{
										environment[i][j] = environment[tempint][j];
										environment[tempint][j] = temp;
									}
									
								}
							}
							if(randomdirection < 50){
								int tempint = environment[i][j].getspeed() + j;
								if(tempint >= 50){
									tempint -= 50;
									if(environment[i][tempint] != null){
										int results = environment[i][j].meet(environment[i][tempint]);
										if(results == 0){
											environment[i][j] = null;
											environment[i][tempint] = temp;
										}
										if(results == 1){
											environment[i][j] = environment[i][tempint];
											environment[i][tempint] = null;
										}
										if(results == 2){
											environment[i][j] = environment[i][tempint];
											environment[i][tempint] = temp;
										}
										
									}
									else{
										environment[i][j] = environment[i][tempint];
										environment[i][tempint] = temp;
									}
								}
								else{
									if(environment[i][tempint] != null){
										int results = environment[i][j].meet(environment[i][tempint]);
										if(results == 0){
											environment[i][j] = null;
											environment[i][tempint] = temp;
										}
										if(results == 1){
											environment[i][j] = environment[i][tempint];
											environment[i][tempint] = null;
										}
										if(results == 2){
											environment[i][j] = environment[i][tempint];
											environment[i][tempint] = temp;
										}
									}
									else{
										environment[i][j] = environment[i][tempint];
										environment[i][tempint] = temp;
									}
								}
								}
							}
							
						}
							
					}
				counter = 1;
				for(int i=0;i<20;i++){
					for(int j =0; j<50; j++){
						if(environment[i][j] != null){
							System.out.println(counter +"." +environment[i][j].getType() + " Position: " + i +" , " + j);
							counter++;
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
