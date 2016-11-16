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
			int randomlifeform = randomGenerator.nextInt(12);
		}
		
	}

}
