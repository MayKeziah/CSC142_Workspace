package studyExercises;

//critter class named butterfly
public class Butterfly extends Critter{
  private int moves;
  private boolean hungry;
  private boolean hasEaten;
  
  public void Butterfly(){
      moves = 0;
      hungry = false;
      hasEaten = false;
  }
  
  public boolean eat() {
      hungry = false;
      hasEaten = true;
      return true;
  }
  
  public Direction getMove() {
  	moves++;
  	if (moves > 4) {
  		moves = 1;
  	}
  	
  	if (moves == 1 || moves == 3) {
  		return Direction.NORTH;
  	}
  	else if (moves == 2) {
  		return Direction.WEST;
  	}
  	else {
  		return Direction.EAST;
  	}
  }
  
  public Color getColor(){
      return Color.YELLOW;
  }
  
  public String toString() {
 
  }
}