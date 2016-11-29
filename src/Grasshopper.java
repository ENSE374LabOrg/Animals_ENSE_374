import java.util.ArrayList;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Grasshopper extends lifeform{
	public Grasshopper(){
		String name = "Grasshopper";
		int speed = 2;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		predators.add("Bluejay");
		foodSource.add("Grass");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
		this.setsymbol('G');
	}
}
