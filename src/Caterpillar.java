import java.util.ArrayList;

public class Caterpillar extends lifeform{
	public Caterpillar(int id){
		String name = "Caterpillar";
		int speed = 1;
		ArrayList<String> foodSource = new ArrayList<String>();
		ArrayList<String> predators = new ArrayList<String>();
		foodSource.add("ShrubTree");
		predators.add("Bluejay");
		this.setFoodSource(foodSource);
		this.setpredators(predators);
		this.setType(name);
		this.setspeed(speed);
		this.setsymbol('C');
		this.setid(id);
	}
	
}
