import java.util.ArrayList;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Mouse extends lifeform{
	
	public Mouse(){
		String name = "Mouse";
		int speed = 3;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		foodSource.add("Grass");
		foodSource.add("ShrubTree");
		predators.add("Hawk");
		predators.add("Fox");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
		this.setsymbol('M');
		
	}
}
