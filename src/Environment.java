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
		Environment(){
			Random randomGenerator = new Random();
			habitat = new lifeform[20][50];
			xdimension = 20;
			ydimension = 50;
			for(int i =0; i < 50; i++){
				int randomx = randomGenerator.nextInt(20);
				int randomy = randomGenerator.nextInt(50);
				int randomlifeform = randomGenerator.nextInt(11);
				
				if(randomlifeform == 0){
					habitat[randomx][randomy] = new ShrubTree() ;
				}
				if(randomlifeform == 1){
					habitat[randomx][randomy] = new Grass() ;
				}
				if(randomlifeform == 2){
					habitat[randomx][randomy] = new Caterpillar() ;
				}
				if(randomlifeform == 3){
					habitat[randomx][randomy] = new Bluejay() ;
				}
				if(randomlifeform == 4){
					habitat[randomx][randomy] = new Grasshopper() ;
				}
				if(randomlifeform == 5){
					habitat[randomx][randomy] = new Mouse() ;
				}
				if(randomlifeform == 6){
					habitat[randomx][randomy] = new Deer() ;
				}
				if(randomlifeform == 7){
					habitat[randomx][randomy] = new Hawk() ;
				}	
				if(randomlifeform == 8){
					habitat[randomx][randomy] = new Fox() ;
				}
				if(randomlifeform == 9){
					habitat[randomx][randomy] = new Squirrel() ;
				}
				if(randomlifeform == 10){
					habitat[randomx][randomy] = new Rabbit() ;
				}
				if(randomlifeform == 11){
					habitat[randomx][randomy] = new Wolf() ;
				}			
			}
		}
		
		Environment(int x, int y, int numofanimals){
			Random randomGenerator = new Random();
			habitat = new lifeform[x][y];
			xdimension = x;
			ydimension = y;
			for(int i =0; i < numofanimals; i++){
				int randomx = randomGenerator.nextInt(x);
				int randomy = randomGenerator.nextInt(y);
				int randomlifeform = randomGenerator.nextInt(11);
				
				if(randomlifeform == 0){
					habitat[randomx][randomy] = new ShrubTree() ;
				}
				if(randomlifeform == 1){
					habitat[randomx][randomy] = new Grass() ;
				}
				if(randomlifeform == 2){
					habitat[randomx][randomy] = new Caterpillar() ;
				}
				if(randomlifeform == 3){
					habitat[randomx][randomy] = new Bluejay() ;
				}
				if(randomlifeform == 4){
					habitat[randomx][randomy] = new Grasshopper() ;
				}
				if(randomlifeform == 5){
					habitat[randomx][randomy] = new Mouse() ;
				}
				if(randomlifeform == 6){
					habitat[randomx][randomy] = new Deer() ;
				}
				if(randomlifeform == 7){
					habitat[randomx][randomy] = new Hawk() ;
				}	
				if(randomlifeform == 8){
					habitat[randomx][randomy] = new Fox() ;
				}
				if(randomlifeform == 9){
					habitat[randomx][randomy] = new Squirrel() ;
				}
				if(randomlifeform == 10){
					habitat[randomx][randomy] = new Rabbit() ;
				}
				if(randomlifeform == 11){
					habitat[randomx][randomy] = new Wolf() ;
				}			
			}
		}
		public void add(lifeform newlifeform , int x, int y){
			habitat[x][y] = newlifeform;
			
		}
		public void remove(int x, int y){
			habitat[x][y].setdeath(true);
			habitat[x][y] = null;
		}
		public void nextDay(){
			
		}
		public void print(){
			int counter = 1;
			for(int i=0;i<xdimension;i++){
				for(int j =0; j<ydimension; j++){
					
					if(habitat[i][j] != null){
						System.out.println(counter +"."+habitat[i][j].getType() + " Position: " + i +" , " + j);
						counter++;
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
						System.out.print(habitat[i][j].getsymbol());
						
					}
					else{
						System.out.print("*");
					}
					
						
				}
			}
		}
		public void move(){
			Random randomGenerator = new Random();
			for(int i=0;i<20;i++){
				for(int j =0; j<50; j++){
					int randomdirection = randomGenerator.nextInt(100);
					if(habitat[i][j] != null){
						lifeform temp;
						temp = habitat[i][j];
						if(randomdirection >= 50){
							int tempint = habitat[i][j].getspeed() + i;
							if(tempint >= 20){
								tempint -= 20;
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
							if(tempint >= 50){
								tempint -= 50;
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
}
