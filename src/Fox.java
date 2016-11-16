import java.util.ArrayList;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Fox extends lifeform{
	public Fox(){
		String name = "Fox";
		int speed = 4;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		foodSource.add("Squirrel");
		foodSource.add("Mouse");
		foodSource.add("Bluejay");
		foodSource.add("Rabbit");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
		
	}
}
