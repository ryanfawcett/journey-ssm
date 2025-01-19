package org.example.round;

/**
 * No args constructor spring bean class
 */
public class RoundHole {
    private double radius;

    public RoundHole() {
        this.radius = 5;
        System.out.println("Creating RoundHole Instance!");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
