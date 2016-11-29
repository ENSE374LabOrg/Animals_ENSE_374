import java.util.ArrayList;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Deer extends lifeform{
	public Deer(int id){
		String name = "Deer";
		int speed = 4;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		foodSource.add("Grass");
		foodSource.add("ShrubTree");
		predators.add("Wolf");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
		this.setsymbol('D');
		this.setid(id);
	}
	
}
