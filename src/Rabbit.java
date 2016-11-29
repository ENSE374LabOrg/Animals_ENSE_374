import java.util.ArrayList;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Rabbit extends lifeform{
	public Rabbit(int id){
		String name = "Rabbit";
		int speed = 5;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		foodSource.add("Grass");
		predators.add("Fox");
		predators.add("Wolf");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
		this.setsymbol('R');
		this.setid(id);
	}
}
