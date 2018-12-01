public abstract class Critter {
    // I use these fields to implement the methods below such as getX and getNeighbor.
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean alive = true;
    private boolean awake = true;

    private final String[] neighbors = {" ", " ", " ", " ", " "};

    // The following five methods are the ones you must implement for your assignment.

    public boolean eat() {
        return false;
    }

    public Attack fight(String opponent) {
        return Attack.FORFEIT;
    }

    public Color getColor() {
        return Color.BLACK;
    }

    public Direction getMove() {
        return Direction.CENTER;
    }

    public String toString() {
        return "?";
    }

    // The following methods are provided to get information about the critter.
    // Technically the critter could call setXxxx() on itself,
    // but the game model ignores this anyway, so it's useless to do so.
    // These methods are declared 'final' so you can't override them.

    // Returns the height of the game simulation world.
    public final int getHeight() {
        return height;
    }

    // Returns the animal that is 1 square in the given direction away
    // from this animal.  A blank space, " ", signifies an empty square.
    public final String getNeighbor(Direction direction) {
        return neighbors[direction.ordinal()];
    }

    // Returns the width of the game simulation world.
    public final int getWidth() {
        return width;
    }

    // Returns this animal's current x-coordinate.
    public final int getX() {
        return x;
    }

    // Returns this animal's current y-coordinate.
    public final int getY() {
        return y;
    }
    
    // Returns true if this animal is currently alive.
    // This will return false if this animal has lost a fight and died.
    public final boolean isAlive() {
        return alive;
    }

    // Returns true if this animal is currently awake.
    // This will temporarily return false if this animal has eaten too much food
    // and fallen asleep.
    public final boolean isAwake() {
        return awake;
    }

    // Sets whether or not this animal is currently alive.
    // This method is called by the simulator and not by your animal itself.
    public final void setAlive(boolean alive) {
        this.alive = alive;
    }

    // Sets whether or not this animal is currently awake.
    // This method is called by the simulator and not by your animal itself.
    public final void setAwake(boolean awake) {
        this.awake = awake;
    }

    // Sets the height of the game simulation world to be the given value,
    // so that future calls to getHeight will return this value.
    // This method is called by the simulator and not by your animal itself.
    public final void setHeight(int height) {
        this.height = height;
    }

    // Sets the neighbor of this animal in the given direction to be the given value,
    // so that future calls to getNeighbor in that direction will return this value.
    // This method is called by the simulator and not by your animal itself.
    public final void setNeighbor(Direction direction, String value) {
        neighbors[direction.ordinal()] = value;
    }

    // Sets the width of the game simulation world to be the given value.
    // so that future calls to getWidth will return this value.
    // This method is called by the simulator and not by your animal itself.
    public final void setWidth(int width) {
        this.width = width;
    }

    // Sets this animal's memory of its x-coordinate to be the given value.
    // so that future calls to getX will return this value.
    // This method is called by the simulator and not by your animal itself.
    public final void setX(int x) {
        this.x = x;
    }

    // Sets this animal's memory of its y-coordinate to be the given value.
    // so that future calls to getY will return this value.
    // This method is called by the simulator and not by your animal itself.
    public final void setY(int y) {
        this.y = y;
    }

    // These methods are provided to inform you about the result of fights, sleeping, etc.
    // You can override these methods in your Husky to be informed of these events.

    // called when you win a fight against another animal
    public void win() {
    }

    // called when you lose a fight against another animal, and die
    public void lose() {
    }

    // called when your animal is put to sleep for eating too much food
    public void sleep() {
    }

    // called when your animal wakes up from sleeping
    public void wakeup() {
    }

    // called when the game world is reset
    public void reset() {
    }
}

// constants for directions
public static enum Direction {NORTH, SOUTH, EAST, WEST, CENTER}

// constants for fighting
public static enum Attack {ROAR, POUNCE, SCRATCH, FORFEIT}



// * This is just CritterTestUtils.java from Marty's HW8 folder,
// except that I replace Critter.Direction with Direction and
// Critter.Attack with attack because they aren't nested in Practice-It.
// I also replace assertTrue with org.junit.Assert.assertTrue.

public class CritterTestUtils {
    public static final Color BROWN = new Color(190, 110, 50);
    public static final double DEFAULT_PERCENT_DIFF_ALLOWED = 7.5;
    public static final Direction[] DEFAULT_DIRECTIONS = {Direction.NORTH,
        Direction.SOUTH, Direction.EAST, Direction.WEST};
    public static final int DEFAULT_MOVES = 3000;

    // return a friendly name for the given color
    public static String colorToString(Color c) {
        if (c == null) {
            return "null";
        } else if (c.equals(Color.RED)) {
            return "red";
        } else if (c.equals(Color.WHITE)) {
            return "white";
        } else if (c.equals(Color.YELLOW)) {
            return "yellow";
        } else if (c.equals(Color.ORANGE)) {
            return "orange";
        } else if (c.equals(Color.BLACK)) {
            return "black";
        } else if (c.equals(Color.GRAY)) {
            return "gray";
        } else if (c.equals(Color.DARK_GRAY)) {
            return "dark gray";
        } else if (c.equals(Color.MAGENTA)) {
            return "magenta";
        } else if (c.equals(Color.PINK)) {
            return "pink";
        } else if (c.equals(Color.BLUE)) {
            return "blue";
        } else if (c.equals(Color.CYAN)) {
            return "cyan";
        } else if (c.equals(BROWN)) {
            return "brown";
        } else {
            return "(red=" + c.getRed() + ", green=" + c.getGreen() + ", blue=" + c.getBlue() + ")";
        }
    }

    public static <C extends Critter> C constructCritter(Class<C> critterClass)
            throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, InvocationTargetException {
        Constructor<C> ctor = getConstructor(critterClass);
        Object[] params = createRandomParameters(critterClass, ctor);
        C critter = ctor.newInstance(params);
        return critter;
    }

    // Fills and returns an array of random values of the proper types
    // for the given constructor.
    public static Object[] createRandomParameters(
            Class<? extends Critter> critterClass,
            Constructor<? extends Critter> ctor) {
        Class<?>[] paramTypes = ctor.getParameterTypes();
        Object[] params = new Object[paramTypes.length];

        // build random parameters
        Random rand = new Random();

        for (int j = 0; j < params.length; j++) {
            if (paramTypes[j] == Integer.TYPE) {
                // other classes' int parameters are things like hunger;
                // randomly choose a value from 0 through 9
                params[j] = new Integer(rand.nextInt(9) + 1);
            } else if (paramTypes[j] == Boolean.TYPE) {
                params[j] = rand.nextBoolean();
            } else if (paramTypes[j] == Color.class) {
                params[j] = Color.PINK;  // take that, sissy.
            } else {
                // wtf parameter did they ask for?
                params[j] = null;
            }
        }
        return params;
    }

    // return a character representing the given direction
    public static String directionToString(Direction dirc) {
        if (dirc == null) {
            return null;
        }
        switch (dirc) {
        case WEST:
            return "W";
        case EAST:
            return "E";
        case NORTH:
            return "N";
        case SOUTH:
            return "S";
        case CENTER:
            return "C";
        default:
            return "?";
        }
    }

    // return a char representing the given attack
    public static String fightToString(Attack fight) {
        switch (fight) {
        case SCRATCH:
            return "S";
        case ROAR:
            return "R";
        case POUNCE:
            return "P";
        case FORFEIT:
            return "F";
        default:
            return "X";
        }
    }

    @SuppressWarnings("unchecked")
    public static <C extends Critter> Constructor<C> getConstructor(Class<C> critterClass) {
        Constructor<C>[] ctors = (Constructor<C>[]) critterClass.getConstructors();
        return ctors[0];
    }

    // return a 5-key map containing the number of moves for [NORTH, SOUTH, EAST, WEST, CENTER]
    public static Map<Attack, Integer> getFightDistribution(Critter critter, String opponent, int howMany) {
        Map<Attack, Integer> distribution = new TreeMap<Attack, Integer>();

        for (int i = 0; i < howMany; i++) {
            Attack weapon = critter.fight(opponent);
            if (weapon == null) {
                continue;
            }
            
            int oldValue = distribution.containsKey(weapon) ? distribution.get(weapon) : 0;
            distribution.put(weapon, oldValue + 1);
        }

        return distribution;
    }

    // given an array generated by getMoveDistribution, return an array of doubles,
    // with each element containing its percent relative to the sum of all elements
    public static Map<Attack, Double> getFightPercents(Map<Attack, Integer> fights) {
        Map<Attack, Double> percents = new TreeMap<Attack, Double>();
        int summa = 0;

        for (int fight : fights.values()) {
            summa += fight;
        }

        for (Map.Entry<Attack, Integer> entry : fights.entrySet()) {
            percents.put(entry.getKey(), 100.0 * entry.getValue() / summa);
        }

        return percents;
    }
    
    // return a String representing a series of fights done by a Critter
    public static String getFights(Critter critter, String opponent, int howMany) {
        String ret = "";
        for (int i = 0; i < howMany; i++) {
            ret += fightToString(critter.fight(opponent));
        }
        return ret;
    }

    // return a 5-key map containing the number of moves for [NORTH, SOUTH, EAST, WEST, CENTER]
    public static Map<Direction, Integer> getMoveDistribution(Critter critter, int numMoves) {
        Map<Direction, Integer> distribution = new TreeMap<Direction, Integer>();

        for (int i = 0; i < numMoves; i++) {
            Direction move = critter.getMove();
            if (move == null) {
                continue;
            }
            
            int oldValue = distribution.containsKey(move) ? distribution.get(move) : 0;
            distribution.put(move, oldValue + 1);
        }

        return distribution;
    }
    
    public static Map<Direction, Integer> getMoveDistribution(String moves) {
        Map<Direction, Integer> distribution = new TreeMap<Direction, Integer>();
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            Direction move = c == 'N' ? Direction.NORTH : c == 'S' ? Direction.SOUTH : 
                c == 'E' ? Direction.EAST : c == 'W' ? Direction.WEST : Direction.CENTER;
            int oldValue = distribution.containsKey(move) ? distribution.get(move) : 0;
            distribution.put(move, oldValue + 1);
        }
        return distribution;
    }

    // return a String representing a series of moves done by a Critter
    public static String getMovement(Critter critter, int moves) {
        return getMovement(critter, moves, null);
    }
    
    public static String getMovement(Critter critter, int moves, Set<Integer> foodSquares) {
        String ret = "";
        for (int i = 0; i < moves; i++) {
            if (foodSquares != null && foodSquares.contains(i)) {
                critter.eat();
            }
            Direction critterMove = critter.getMove();
            ret += directionToString(critterMove);
            move(critter, critterMove);   // update critter's internal x/y state
        }

        return ret;
    }

    public static String getToStrings(Critter critter, int moves) {
        String ret = "";
        for (int i = 0; i < moves; i++) {
            Direction critterMove = critter.getMove();
            ret += critter.toString();
            move(critter, critterMove);   // update critter's internal x/y state
        }

        return ret;
    }

    // given an array generated by getMoveDistribution, return an array of doubles,
    // with each element containing its percent relative to the sum of all elements
    public static Map<Direction, Double> getMovePercents(Map<Direction, Integer> moves) {
        Map<Direction, Double> percents = new TreeMap<Direction, Double>();
        int summa = 0;

        for (int move : moves.values()) {
            summa += move;
        }

        for (Map.Entry<Direction, Integer> entry : moves.entrySet()) {
            percents.put(entry.getKey(), 100.0 * entry.getValue() / summa);
        }

        return percents;
    }
    
    // shift a critter in the given direction and update his state
    public static void move(Critter critter, Direction dir) {
        int dx = dir == Direction.WEST  ? -1 : dir == Direction.EAST  ? 1 : 0;
        int dy = dir == Direction.NORTH ? -1 : dir == Direction.SOUTH ? 1 : 0;
        int w = critter.getWidth();
        int h = critter.getHeight();
        int x = (critter.getX() + dx + w) % (w > 0 ? w : Integer.MAX_VALUE);
        int y = (critter.getY() + dy + h) % (h > 0 ? h : Integer.MAX_VALUE);
        critter.setX(x);
        critter.setY(y);
    }

    // move a critter to a given initial position
    public static void position(Critter critter, int x, int y, int w, int h) {
        critter.setX(x);
        critter.setY(y);
        critter.setWidth(w);
        critter.setHeight(h);
    }
    
    // return the attack matching the given string
    public static Attack parseAttack(String fight) {
        if (fight == null || fight.length() == 0) {
            return Attack.FORFEIT;
        }
        fight = fight.toUpperCase().intern();
        if (fight == "W" || fight == "ROAR") {
            return Attack.ROAR;
        } else if (fight == "E" || fight == "POUNCE") {
            return Attack.POUNCE;
        } else if (fight == "N" || fight == "SCRATCH") {
            return Attack.SCRATCH;
        } else if (fight == "S" || fight == "FORFEIT") {
            return Attack.FORFEIT;
        } else {
            throw new IllegalArgumentException(fight);
        }
    }
    
    // return the direction matching the given string
    public static Direction parseDirection(String dirc) {
        if (dirc == null || dirc.length() == 0) {
            return Direction.CENTER;
        }
        dirc = dirc.toUpperCase().intern();
        if (dirc == "W" || dirc == "WEST") {
            return Direction.WEST;
        } else if (dirc == "E" || dirc == "EAST") {
            return Direction.EAST;
        } else if (dirc == "N" || dirc == "NORTH") {
            return Direction.NORTH;
        } else if (dirc == "S" || dirc == "SOUTH") {
            return Direction.SOUTH;
        } else if (dirc == "C" || dirc == "CENTER") {
            return Direction.EAST;
        } else {
            throw new IllegalArgumentException(dirc);
        }
    }

    public static void testFightDistribution(Critter critter, String opponent, int fights, Map<Attack, Double> expected, double percentDiffAllowed) {
        Map<Attack, Integer> distribution = getFightDistribution(critter, opponent, fights);
        Map<Attack, Double> percents = getFightPercents(distribution);

        boolean passed = true;
        for (Map.Entry<Attack, Double> entry : percents.entrySet()) {
            double targetPercent = expected.containsKey(entry.getKey()) ? expected.get(entry.getKey()) : 0.0;
            if (Math.abs(targetPercent - entry.getValue()) > percentDiffAllowed) {
                passed = false;
            }
        }

        String message = "";
        if (!passed) {
            message += "\tFight distribution over " + fights + " battles:\n";
            for (Map.Entry<Attack, Double> entry : percents.entrySet()) {
                message += "\t" + entry.getKey() + " : " + distribution.get(entry.getKey()) + " (" + entry.getValue() + "%)\n";
            }
            message += "\n\tExpected percentages:\n";
            for (Map.Entry<Attack, Double> entry : expected.entrySet()) {
                message += "\t" + entry.getKey() + " : " + entry.getValue() + "%\n";
            }
        }
        org.junit.Assert.assertTrue("fight (reasonable fight distribution)\n" + message, passed);
    }
    
    // test that the random distribution of moves is fairly even
    public static void testMoveDistribution(Critter critter) {
        testMoveDistribution(critter, "getMove");
    }
    
    public static void testMoveDistribution(Critter critter, String message) {
        testMoveDistribution(critter, message, DEFAULT_DIRECTIONS, DEFAULT_MOVES);
    }
    
    public static void testMoveDistribution(Critter critter, Direction[] directions, int moves) {
        testMoveDistribution(critter, "getMove", DEFAULT_DIRECTIONS, DEFAULT_MOVES);
    }
    
    public static void testMoveDistribution(Critter critter, String message, Direction[] directions, int moves) {
        testMoveDistribution(critter, message, directions, moves, 100.0 / directions.length, DEFAULT_PERCENT_DIFF_ALLOWED);
    }

    public static void testMoveDistribution(Critter critter, Direction[] directions, int moves, double targetPercent, double percentDiffAllowed) {
        testMoveDistribution(critter, "getMove", directions, moves, targetPercent, percentDiffAllowed);
    }

    public static void testMoveDistribution(Critter critter, String message, Direction[] directions, int moves, double targetPercent, double percentDiffAllowed) {
        Map<Direction, Integer> distribution = getMoveDistribution(critter, moves);
        testMoveDistribution(distribution, message, directions, moves, targetPercent, percentDiffAllowed);
    }

    public static void testMoveDistribution(String movesString, String message, Direction[] directions, double targetPercent, double percentDiffAllowed) {
        Map<Direction, Integer> distribution = getMoveDistribution(movesString);
        testMoveDistribution(distribution, message, directions, movesString.length(), targetPercent, percentDiffAllowed);
    }
    
    public static void testMoveDistribution(Map<Direction, Integer> distribution, String message, Direction[] directions, int moves, double targetPercent, double percentDiffAllowed) {
        Map<Direction, Double> percents = getMovePercents(distribution);
        List<Direction> failures = new ArrayList<Direction>();
        
        boolean passed = true;
        for (Direction dir : directions) {
            if (!percents.containsKey(dir) || Math.abs(targetPercent - percents.get(dir)) > percentDiffAllowed) {
                passed = false;
                failures.add(dir);
            }
        }

        String output = "";
        if (!passed) {
            output += "\tMove distribution over " + moves + " moves:\n";
            for (Map.Entry<Direction, Double> entry : percents.entrySet()) {
                output += "\t" + entry.getKey() + " : " + distribution.get(entry.getKey()) + " (" + entry.getValue() + "%)\n";
            }
            output += "\n\tExpected percentage of each direction: " + targetPercent + " (" + percentDiffAllowed + "% difference allowed)\n";
            output += "\tDirections failed: " + failures + "\n";
        }
        org.junit.Assert.assertTrue(message + " (reasonable move distribution)\n" + output, passed);
    }

    // tries to see if the given strings can be matched up after shifting by 1, 2, etc. chars.
    public static boolean matchByChunk(String movement, int blockSize, boolean allowShift) {
        char current = movement.charAt(0);
        for (int shift = 0; shift < (allowShift ? blockSize : 1); shift++) {
            boolean matched = true;
            for (int i = shift; i < movement.length(); i++) {
                char move = movement.charAt(i);
    
                if (i % blockSize == shift) {
                    current = move;
                } else {
                    if (move != current) {
                        matched = false;
                    }
                }
            }
            
            if (matched) {
                return true;
            }
        }
        
        return false;
    }
}
