import java.util.ArrayList;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Grass extends lifeform{
	public Grass(){
		String name = "Grass";
		int speed = 0;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		predators.add("Deer");
		predators.add("Rabbit");
		predators.add("Mouse");
		predators.add("Grasshopper");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
	}
}
