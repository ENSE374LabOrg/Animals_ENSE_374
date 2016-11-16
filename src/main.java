import java.util.Random;

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
		
		
		}
}
