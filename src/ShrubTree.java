import java.util.ArrayList;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class ShrubTree extends lifeform{
	public ShrubTree(){
		String name = "ShrubTree";
		int speed = 0;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		predators.add("Caterpillar");
		predators.add("Bluejay");
		predators.add("Mouse");
		predators.add("Squirrel");
		predators.add("Deer");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
		this.setsymbol('T');
		
	}
}
