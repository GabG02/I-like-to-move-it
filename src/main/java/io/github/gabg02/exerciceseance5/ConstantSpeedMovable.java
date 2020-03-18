package io.github.gabg02.exerciceseance5;

// TODO: Auto-generated Javadoc
/**
 * The Class ConstantSpeedMovable.
 */
public class ConstantSpeedMovable implements MovableObject{
	
	
	/** The Constant Speed en km/h */
	private final double SPEED;
	private boolean walking;
	
	public ConstantSpeedMovable(double speed) {
		walking=false;
		SPEED = speed;
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean canAccelerate() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * Accelerate.
	 */
	@Override
	public void accelerate() {
		walking=true;
	}

	/**
	 * {@inheritDoc}
	 * Gets the time to move.
	 *
	 * @param d the distance en km/h
	 * @return the time to move
	 */
	@Override
	public double getTimeToMove(double d) {
		return d/SPEED;
	}

	@Override
	public void brake() {
		walking = false;
	}

	@Override
	public boolean canBrake() {
		return walking;
	}

	@Override
	public void slow() {
		walking = false;	
	}

}
