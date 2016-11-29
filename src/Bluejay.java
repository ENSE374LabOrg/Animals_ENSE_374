import java.util.ArrayList;

public class Bluejay extends lifeform{
	public Bluejay(){
		String name = "Bluejay";
		int speed = 4;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		foodSource.add("Caterpillar");
		foodSource.add("ShrubTree");
		foodSource.add("Grasshopper");
		predators.add("Fox");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
		this.setsymbol('B');
	}
}
