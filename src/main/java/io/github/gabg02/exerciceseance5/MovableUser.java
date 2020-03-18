package io.github.gabg02.exerciceseance5;

public class MovableUser {

	public static void main() {
		MovableObject csm = new ConstantSpeedMovable(20);
		MovableObject gm1 = new GenericMovable(80);
		MovableObject gm2 = new GenericMovable(210);
		gm1.accelerate();
		gm2.accelerate();
		gm2.accelerate();
		System.out.println("Time for 1km");
		System.out.println("ConstantSpeedMovable : "+csm.getTimeToMove(1));
		System.out.println("GenericMovable 1: "+gm1.getTimeToMove(1));
		System.out.println("GenericMovable 2: "+gm2.getTimeToMove(1));
	}
}
