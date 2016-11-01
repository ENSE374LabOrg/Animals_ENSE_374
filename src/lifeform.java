import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class lifeform {
	private	String type;
	private	Boolean dead;
	private	List<String> foodSource;
	private	List<String> predators;
	private	int speed;
	
	public lifeform(){
		this.type = "";
		this.dead = false;
		this.speed = 0;
	}
	public lifeform(String type, Boolean dead, ArrayList<String> foodSource, ArrayList<String> predators, int speed){
		this.type = type;
		this.dead = dead;
		this.foodSource = foodSource;
		this.predators = predators;
		this.speed = speed;
	}
	public void eat(){
		System.out.println(type + "eats" + foodSource);
	}
	public void eaten(){
		System.out.println(type + "was eaten by" + predators);
	}
}
