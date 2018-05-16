package com.thoughtworks.iwp.vehicle;

public class Vehicle {
    private String vehicleType;
    private float price;
    private String brand;
    private int speed;

    private static final int MIN_ANGLE = 0;
    private static final int MAX_ANGLE = 180;
    private static final int REFERENCE_ANGLE = 90;

    public Vehicle(String vehicleType, float price, String brand, int speed) {
         this.vehicleType = vehicleType;
         this.price = price;
         this.brand = brand;
         this.speed = speed;
     }

    public boolean validateAngle(int angle) {
        if(angle >= MIN_ANGLE && angle <= MAX_ANGLE) {
            return true;
        }
        else {
            System.out.println("Not within range\n");
            return false;
        }
    }

    void applyBrakes() {
        decelerate();
        if(speed==0) {
            System.out.println("Stop");
        }
    }

    void accelerate() {
        System.out.println("Increasing the speed");
        speed++;
    }

    void decelerate() {
        System.out.println("Decreasing the speed");
        speed--;
    }

    void changeDirection(int angle) {
        if(validateAngle(angle)) {
            if (angle < REFERENCE_ANGLE) {
                System.out.println("Go right");
            } else if (angle > REFERENCE_ANGLE) {
                System.out.println("Go straight");
            } else {
                System.out.println("Go left");
            }
        }
    }
}
