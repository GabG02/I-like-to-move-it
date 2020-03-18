package io.github.gabg02.exerciceseance5;

public class GenericMovable implements MovableObject{

	public final double MAX_SPEED;
	private double vitesse = 0;
	private final double STEP = 10;

	public GenericMovable(double max) {
		MAX_SPEED = max;
	}


	@Override
	public boolean canAccelerate() {
		return MAX_SPEED>vitesse;
	}

	@Override
	public void accelerate() {
		if(canAccelerate()) {
			if(MAX_SPEED-vitesse<STEP) {
				vitesse=MAX_SPEED;
			} else {
				vitesse+=STEP;
			}
		}
	}

	@Override
	public double getTimeToMove(double d) {
		return d/vitesse;
	}


	@Override
	public void brake() {
		vitesse = 0;
	}


	@Override
	public boolean canBrake() {
		return vitesse>0;
	}


	@Override
	public void slow() {
		if(vitesse < STEP) {
			brake();
		} else {
			vitesse-=10;
		}
	}


}
