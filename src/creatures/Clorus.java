package creatures;
import huglife.Creature;
import huglife.Direction;
import huglife.Action;
import huglife.Occupant;
import huglife.HugLifeUtils;
import java.awt.Color;
import java.util.Map;
import java.util.List;

/** An implementation of a fierce blue-colored predator.
 *  @author sluo6
 */

public class Clorus extends Creature {
	
	/** red color. */
    private int r = 34;
    /** green color. */
    private int g = 0;
    /** blue color. */
    private int b = 231;

    /** creates Clorus with energy equal to E. */
	public Clorus(double e) {
		super("clorus");
		energy = e;		
	}
	
	/** creates Clorus with energy equals to 1. */
	public Clorus() {
		this(1);
	}

	/** when it moves, it loses energy of 0.03. */
	@Override
	public void move() {
		energy = energy - 0.03;		
	}

	/** when it attacks another creature, it gain that creature's energy. */
	@Override
	public void attack(Creature c) {
		
		
	}

	@Override
	public Creature replicate() {
		// TODO Auto-generated method stub
		return null;
	}

	/** when it stays, it loses energy of 0.01. */
	@Override
	public void stay() {
		energy = energy - 0.01;		
	}

	@Override
	public Action chooseAction(Map<Direction, Occupant> neighbors) {
		// TODO Auto-generated method stub
		return null;
	}

	/** returns the color of this creature */
	@Override
	public Color color() {
		return color(r, g, b);
	}

}
