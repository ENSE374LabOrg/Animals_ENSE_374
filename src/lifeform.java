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
	private int health = 100;
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
		health = health + 5;
		System.out.println(type + "eats" + foodSource);
	}
	public void eaten(){
		System.out.println(type + "was eaten by" + predators);
		this.dead = true;
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
	public void setFoodSource(ArrayList<String> foodSource){
		this.foodSource = foodSource;
	}
	public List<String> foodSource(){
		return this.foodSource;
	}
	public void setpredators(ArrayList<String> predators){
		this.predators = predators;
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
	public int meet(lifeform enemy){
		for(int i =0; i < this.foodSource.size(); i ++){
				if(this.foodSource.get(i) == enemy.getType()){
					System.out.println(enemy.getType() + " was eaten by " + this.type);
					return 0;
				}
		}
		for(int i =0; i < this.predators.size(); i ++){
			if(this.predators.get(i) == enemy.getType()){
				System.out.println(this.getType() + " was eaten by " + enemy.getType());
				return 1;
			}
	}
		return 2;
	}
}
