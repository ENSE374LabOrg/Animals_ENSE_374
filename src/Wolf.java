import java.util.ArrayList;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Wolf extends lifeform{
	public Wolf(){
		String name = "Wolf";
		int speed = 4;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		foodSource.add("Rabbit");
		foodSource.add("Deer");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
		
	}
}
