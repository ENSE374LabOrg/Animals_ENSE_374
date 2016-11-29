import java.util.ArrayList;

public class Hawk extends lifeform{
	public Hawk(int id){
		String name = "Hawk";
		int speed = 6;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		foodSource.add("Squirrel");
		foodSource.add("Mouse");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
		this.setsymbol('H');
		this.setid(id);
	}
}
