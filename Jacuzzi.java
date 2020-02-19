package com.company;

public class Jacuzzi implements ElectronicDevice{

	// took this from Head First implementation
	public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;
	
	public int getSpeed() {
        return this.speed;
    }
 
    public void setSpeed(int speed) {
        this.speed = speed;
    }
	
	enum DeviceEnum {

        JACUZZI {
            public ElectronicDevice returnClass() {
                return new this;
            }
        },


    @Override
    public void on() {
        System.out.println("Jacuzzi is on");
    }

    @Override
    public void off() {
        System.out.println("Jacuzzi is off");
    }

    @Override
    public void volumeUp() {
		// ignore satisfies implements clause
    }

    @Override
    public void volumeDown() {
		// ignore satisfies implements clause
    }
	
    public void off() {
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {

        speed = MEDIUM;

    }

    @Override
    public void low() {
        speed = LOW;
    }

}
