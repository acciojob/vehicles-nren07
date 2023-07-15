package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;
    public void setSpeed(int speed){
        this.currentSpeed=speed;
    }
    public Vehicle(String name) {
        this.name=name;
        this.currentDirection=0;
        this.currentSpeed=0;
    }


    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        this.currentDirection+=direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        this.currentSpeed=speed;
        this.currentDirection=direction;
        //set the values of currentSpeed and currentDirection
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }
    public int getDirection(){
        return currentDirection;
    }
    public int getSpeed(){
        return currentSpeed;
    }
    public void changeSpeed(int speed,int currentDirection){
        this.currentSpeed=speed;
        this.currentDirection=currentDirection;
    }

    public void stop(){
        this.currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
