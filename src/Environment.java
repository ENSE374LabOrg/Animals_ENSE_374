import java.util.Random;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Environment {
		lifeform[][] habitat;
		Environment(){
			Random randomGenerator = new Random();
			habitat = new lifeform[20][50];
			for(int i =0; i < 50; i++){
				int randomx = randomGenerator.nextInt(20);
				int randomy = randomGenerator.nextInt(50);
				int randomlifeform = randomGenerator.nextInt(11);
				
				if(randomlifeform == 0){
					habitat[randomx][randomy] = new ShrubTree() ;
				}
				if(randomlifeform == 1){
					habitat[randomx][randomy] = new Grass() ;
				}
				if(randomlifeform == 2){
					habitat[randomx][randomy] = new Caterpillar() ;
				}
				if(randomlifeform == 3){
					habitat[randomx][randomy] = new Bluejay() ;
				}
				if(randomlifeform == 4){
					habitat[randomx][randomy] = new Grasshopper() ;
				}
				if(randomlifeform == 5){
					habitat[randomx][randomy] = new Mouse() ;
				}
				if(randomlifeform == 6){
					habitat[randomx][randomy] = new Deer() ;
				}
				if(randomlifeform == 7){
					habitat[randomx][randomy] = new Hawk() ;
				}	
				if(randomlifeform == 8){
					habitat[randomx][randomy] = new Fox() ;
				}
				if(randomlifeform == 9){
					habitat[randomx][randomy] = new Squirrel() ;
				}
				if(randomlifeform == 10){
					habitat[randomx][randomy] = new Rabbit() ;
				}
				if(randomlifeform == 11){
					habitat[randomx][randomy] = new Wolf() ;
				}			
			}
		}
		
		public void nextDay(){
			
		}
		
		
}
