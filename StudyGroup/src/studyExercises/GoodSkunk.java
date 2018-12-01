package studyExercises;


public class GoodSkunk extends Critter {

	 

    private int moves;

    private boolean hungry;

    private boolean hasEaten;

   

    public void GoodSkunk() {  // constructor

        hungry = true;

        hasEaten = false;

        moves = 0;

    }

   

    public boolean eat() {

        hungry = false;

        hasEaten = true;

        return true;

    }

   

    public Direction getMove() {

        moves++;

        if (moves > 3) {

            moves = 1;

        }

       

        if (moves == 1 || moves == 2) {

            return Direction.WEST;

        }

        else {

            if (hasEaten) {

                return Direction.SOUTH;

            }

            else {

                return Direction.NORTH;

            }

        }

    }

}


