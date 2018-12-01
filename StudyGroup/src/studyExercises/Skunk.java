public class Skunk extends Critter {

	private int moves;
    private boolean hungry;
    
    public void Skunk() {  // constructor
        hungry = false;
        moves = 0;
    }
    
    public boolean eat() {
        hungry = false;
        return true;
    }
    
    public Direction getMove() {
        moves++;
        if (moves > 3)
        {
            moves = 1;
        }
        
        if (moves == 1 || moves == 2)
        {
            return Direction.WEST;
        } 
        else
        {
	        if (!hungry)
	        {
	            return Direction.NORTH;
	        }
	        else
	        {
	            return Direction.SOUTH;
	        }
        }
    }
}