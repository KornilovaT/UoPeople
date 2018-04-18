package edu.uopeople.week_1;

import java.lang.Math;

public class GravityCalculator {
    private static double  fallingTime = 10.0; // time in seconds that the object falls;

    public static void main(String[] arguments){
        System.out.println();
        System.out.println("The object's position after " + fallingTime +" seconds is "+finalPosition() + " m.");
    }

    public static double finalPosition(){
        double  gravity =-9.81; // Earth's gravity in m/s^2
        double  initialVelocity = 0.0; // starting velocity of the object
        double  initialPosition = 1000.0; // Starting position in meters, the calculation will 		determine the ending position in meters
        double  finalPosition = 0.0;
        return finalPosition = 0.5*gravity*Math.pow(fallingTime, 2)+initialVelocity*fallingTime+initialPosition;
    }
}

