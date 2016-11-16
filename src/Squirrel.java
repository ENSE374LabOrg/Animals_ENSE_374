import java.util.ArrayList;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Squirrel extends lifeform{
	public Squirrel(){
		String name = "Squirrel";
		int speed = 3;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		foodSource.add("ShrubTree");
		predators.add("Fox");
		predators.add("Hawk");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
		
	}
}
