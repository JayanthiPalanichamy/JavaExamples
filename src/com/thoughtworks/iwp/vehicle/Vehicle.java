package com.thoughtworks.iwp.vehicle;

public class Vehicle {
    String vehicleType;
    float price;
    String brand;
    int speed;

    static final int MIN_ANGLE = 0;
    static final int MAX_ANGLE = 180;
    static final int DEFAULT_ANGLE = 90;

     public Vehicle(String vehicleType, float price, String brand, int speed) {
         this.vehicleType = vehicleType;
         this.price = price;
         this.brand = brand;
         this.speed = speed;
     }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price > 0) {
            this.price = price;
        }
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void applyBrakes() {
        this.decelerate();
        if(speed==0) {
            System.out.println("Stop");
        }
    }

    void accelerate() {
        System.out.println("Increasing the speed");
        this.speed++;
    }

    void decelerate() {
        System.out.println("Decreasing the speed");
        this.speed--;
    }

    void changeDirection(int angle)
    {
        if(this.validateAngle(angle)) {

            if (angle < DEFAULT_ANGLE) {
                System.out.println("Go right");
            } else if (angle > DEFAULT_ANGLE) {
                System.out.println("Go straight");
            } else {
                System.out.println("Go left");
            }
        }
    }


}
