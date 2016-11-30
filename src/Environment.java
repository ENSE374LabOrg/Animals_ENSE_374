import java.util.Random;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Environment {
		lifeform[][] habitat;
		int xdimension;
		int ydimension;
		int counter = 1;
		Environment(){
			Random randomGenerator = new Random();
			habitat = new lifeform[10][10];
			xdimension = 10;
			ydimension = 10;
			
			for(int i =0; i < 10; i++){
				int randomx = randomGenerator.nextInt(xdimension);
				int randomy = randomGenerator.nextInt(ydimension);
				int randomlifeform = randomGenerator.nextInt(11);
				
				if(randomlifeform == 0){
					habitat[randomx][randomy] = new ShrubTree(counter) ;
				}
				if(randomlifeform == 1){
					habitat[randomx][randomy] = new Grass(counter) ;
				}
				if(randomlifeform == 2){
					habitat[randomx][randomy] = new Caterpillar(counter) ;
				}
				if(randomlifeform == 3){
					habitat[randomx][randomy] = new Bluejay(counter) ;
				}
				if(randomlifeform == 4){
					habitat[randomx][randomy] = new Grasshopper(counter) ;
				}
				if(randomlifeform == 5){
					habitat[randomx][randomy] = new Mouse(counter) ;
				}
				if(randomlifeform == 6){
					habitat[randomx][randomy] = new Deer(counter) ;
				}
				if(randomlifeform == 7){
					habitat[randomx][randomy] = new Hawk(counter) ;
				}	
				if(randomlifeform == 8){
					habitat[randomx][randomy] = new Fox(counter) ;
				}
				if(randomlifeform == 9){
					habitat[randomx][randomy] = new Squirrel(counter) ;
				}
				if(randomlifeform == 10){
					habitat[randomx][randomy] = new Rabbit(counter) ;
				}
				if(randomlifeform == 11){
					habitat[randomx][randomy] = new Wolf(counter) ;
				}			
				++counter;
			}
		}
		
		Environment(int x, int y, int numofanimals){
			Random randomGenerator = new Random();
			habitat = new lifeform[x][y];
			xdimension = x;
			ydimension = y;
			int counter = 1;
			for(int i =0; i < numofanimals; i++){
				int randomx = randomGenerator.nextInt(x);
				int randomy = randomGenerator.nextInt(y);
				int randomlifeform = randomGenerator.nextInt(11);
				
				if(randomlifeform == 0){
					habitat[randomx][randomy] = new ShrubTree(counter) ;
				}
				if(randomlifeform == 1){
					habitat[randomx][randomy] = new Grass(counter) ;
				}
				if(randomlifeform == 2){
					habitat[randomx][randomy] = new Caterpillar(counter) ;
				}
				if(randomlifeform == 3){
					habitat[randomx][randomy] = new Bluejay(counter) ;
				}
				if(randomlifeform == 4){
					habitat[randomx][randomy] = new Grasshopper(counter) ;
				}
				if(randomlifeform == 5){
					habitat[randomx][randomy] = new Mouse(counter) ;
				}
				if(randomlifeform == 6){
					habitat[randomx][randomy] = new Deer(counter) ;
				}
				if(randomlifeform == 7){
					habitat[randomx][randomy] = new Hawk(counter) ;
				}	
				if(randomlifeform == 8){
					habitat[randomx][randomy] = new Fox(counter) ;
				}
				if(randomlifeform == 9){
					habitat[randomx][randomy] = new Squirrel(counter) ;
				}
				if(randomlifeform == 10){
					habitat[randomx][randomy] = new Rabbit(counter) ;
				}
				if(randomlifeform == 11){
					habitat[randomx][randomy] = new Wolf(counter) ;
				}
				++counter;
			}
		}
		public void add(int type , int x, int y){
			if(type == 1){
				habitat[x][y] = new ShrubTree(counter) ;
			}
			if(type == 2){
				habitat[x][y] = new Grass(counter) ;
			}
			if(type == 3){
				habitat[x][y] = new Caterpillar(counter) ;
			}
			if(type == 4){
				habitat[x][y] = new Bluejay(counter) ;
			}
			if(type == 5){
				habitat[x][y] = new Grasshopper(counter) ;
			}
			if(type == 6){
				habitat[x][y] = new Mouse(counter) ;
			}
			if(type == 8){
				habitat[x][y] = new Deer(counter) ;
			}
			if(type == 10){
				habitat[x][y] = new Hawk(counter) ;
			}	
			if(type == 11){
				habitat[x][y] = new Fox(counter) ;
			}
			if(type == 9){
				habitat[x][y] = new Squirrel(counter) ;
			}
			if(type == 7){
				habitat[x][y] = new Rabbit(counter) ;
			}
			if(type == 12){
				habitat[x][y] = new Wolf(counter) ;
			}
			++counter;
			
		}
		public void remove(int x, int y){
			if(habitat[x][y] != null){
			System.out.println(habitat[x][y].getType() + " has been removed from the simulation.");
			habitat[x][y].setdeath(true);
			habitat[x][y] = null;
			}
			else{
				System.out.println("No Lifeform in sight.");
			}
		}
		public void nextDay(){
			
		}
		public void print(){
			for(int i=0;i<xdimension;i++){
				for(int j =0; j<ydimension; j++){
					
					if(habitat[i][j] != null){
						System.out.println("ID:" + habitat[i][j].getid() +" "+habitat[i][j].getType() + " Position: " + i +" , " + j +" Health = " + habitat[i][j].gethealth() + "%");
					
					}
					
						
				}
			}
		}
		public void printmap(){
			System.out.println("Legend:");
			System.out.println("T = Tree/Shrub");
			System.out.println("C = Caterpillar");
			System.out.println("B = Bluejay");
			System.out.println("G = Grasshopper");
			System.out.println("M = Mouse");
			System.out.println("A = Grass");
			System.out.println("D = Deer");
			System.out.println("R = Rabbit");
			System.out.println("H = Hawk");
			System.out.println("S = Squirrel");
			System.out.println("F = Fox");
			System.out.println("W = Wolf");
			for(int i=0;i<xdimension;i++){
				for(int j =0; j<ydimension; j++){
					
					if(habitat[i][j] != null){
						System.out.print(" "+habitat[i][j].getsymbol() + " ");
						
					}
					else{
						System.out.print(" * ");
					}
					
						
				}
				System.out.println();
			}
		}
		public void move(){
			Random randomGenerator = new Random();
			for(int i=0;i<xdimension;i++){
				for(int j =0; j<ydimension; j++){
					int randomdirection = randomGenerator.nextInt(100);
					if(habitat[i][j] != null){
						lifeform temp;
						temp = habitat[i][j];
						if(randomdirection >= 50){
							int tempint = habitat[i][j].getspeed() + i;
							if(tempint >= xdimension){
								tempint -= xdimension;
								if(habitat[tempint][j] != null){
									int results = habitat[i][j].meet(habitat[tempint][j]);
									if(results == 0){
										
										habitat[i][j] = null;
										habitat[tempint][j] = temp;
									}
									if(results == 1){
										habitat[i][j] = habitat[tempint][j];
										habitat[tempint][j] = null;
									}
									if(results == 2){
										habitat[i][j] = habitat[tempint][j];
										habitat[tempint][j] = temp;
									}
									
								}
								else{
									habitat[i][j] = habitat[tempint][j];
									habitat[tempint][j] = temp;
								}
							}
							else{
								if(habitat[tempint][j] != null){
									int results = habitat[i][j].meet(habitat[tempint][j]);
									if(results == 0){
										
										habitat[i][j] = null;
										habitat[tempint][j] = temp;
									}
									if(results == 1){
										habitat[i][j] = habitat[tempint][j];
										habitat[tempint][j] = null;
									}
									if(results == 2){
										habitat[i][j] = habitat[tempint][j];
										habitat[tempint][j] = temp;
									}
								}
								else{
									habitat[i][j] = habitat[tempint][j];
									habitat[tempint][j] = temp;
								}
								
							}
						}
						if(randomdirection < 50){
							int tempint = habitat[i][j].getspeed() + j;
							if(tempint >= ydimension){
								tempint -= ydimension;
								if(habitat[i][tempint] != null){
									int results = habitat[i][j].meet(habitat[i][tempint]);
									if(results == 0){
										habitat[i][j] = null;
										habitat[i][tempint] = temp;
									}
									if(results == 1){
										habitat[i][j] = habitat[i][tempint];
										habitat[i][tempint] = null;
									}
									if(results == 2){
										habitat[i][j] = habitat[i][tempint];
										habitat[i][tempint] = temp;
									}
									
								}
								else{
									habitat[i][j] = habitat[i][tempint];
									habitat[i][tempint] = temp;
								}
							}
							else{
								if(habitat[i][tempint] != null){
									int results = habitat[i][j].meet(habitat[i][tempint]);
									if(results == 0){
										habitat[i][j] = null;
										habitat[i][tempint] = temp;
									}
									if(results == 1){
										habitat[i][j] = habitat[i][tempint];
										habitat[i][tempint] = null;
									}
									if(results == 2){
										habitat[i][j] = habitat[i][tempint];
										habitat[i][tempint] = temp;
									}
								}
								else{
									habitat[i][j] = habitat[i][tempint];
									habitat[i][tempint] = temp;
								}
							}
							}
						
						}
						
					}
						
				}
		}
		public void checkhealth(){
			for(int i=0;i<xdimension;i++){
				for(int j =0; j<ydimension; j++){
					if(habitat[i][j] != null){
						habitat[i][j].dechealth();
						if(habitat[i][j].gethealth() <= 0){
							habitat[i][j].setdeath(true);
							System.out.println(habitat[i][j].getType() + " has died of starvation");
							habitat[i][j] = null;
						}
					}
				}
			}
		}
		public boolean isEmpty(){
			boolean check = true;
			
			for(int i = 0; i < xdimension ; i++){
				for(int j = 0; j < ydimension; j++){
					if(habitat[i][j] != null){
						check = false;
					}
				}
			}
			return check;
		}
		public void selector(int id){

			for(int i = 0; i < xdimension ; i++){
				for(int j = 0; j < ydimension; j++){
					if(habitat[i][j] != null){
					if(habitat[i][j].getid() == id){
						System.out.println("Lifeform Profile:");
						System.out.println("ID:" +habitat[i][j].getid());
						System.out.println("Type:" +habitat[i][j].getType());
						System.out.println("Symbol:" +habitat[i][j].getsymbol());
						System.out.println("Health:" +habitat[i][j].gethealth());
						System.out.println("Speed:" +habitat[i][j].getspeed());
						System.out.println("Food Source:" + habitat[i][j].foodSource());
						System.out.println("Predators:" +habitat[i][j].getpredators());
						return;
					}
					}
				}
			}
			System.out.println("No Lifeform with given ID was found.");
		}
}
