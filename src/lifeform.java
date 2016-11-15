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
	private	boolean dead;
	private	List<String> foodSource;
	private	List<String> predators;
	private	int speed;
	
	public lifeform(){
		this.type = "";
		this.dead = false;
		this.speed = 0;
	}
	public lifeform(String type, boolean dead, ArrayList<String> foodSource, ArrayList<String> predators, int speed){
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
	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
	public boolean isDead(){
		return this.dead;
	}
	public void setFoodSource(String foodSource){
		this.foodSource.add(foodSource);
	}
	public List<String> foodSource(){
		return this.foodSource;
	}
	public void setpredators(String predators){
		this.predators.add(predators);
	}
	public List<String> getpredators(){
		return this.predators;
	}
	public void setspeed(int speed){
		this.speed = speed;
	}
	public int getspeed(){
		return this.speed;
	}
}
