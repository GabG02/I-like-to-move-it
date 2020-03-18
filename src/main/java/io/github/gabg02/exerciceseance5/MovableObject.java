package io.github.gabg02.exerciceseance5;

public interface MovableObject {

	public boolean canAccelerate();
	
	public void accelerate();
	
	public double getTimeToMove(double d);
	
	public void brake();
	
	public boolean canBrake();
	
	public void slow();
}
