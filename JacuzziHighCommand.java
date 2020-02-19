package com.company;

public class JacuzziHighCommand implements Command{

    int prevSpeed;
    ElectronicDevice theDevice;
	
    public JacuzziHighCommand(ElectronicDevice newDevice) {
        theDevice = newDevice;  // get the local object
    }

    @Override
    public void execute() {
        theDevice.on();
		prevSpeed = theDevice.getSpeed();
        theDevice.high();
    }

    @Override
    public void undo() {
        theDevice.on();
		if (prevSpeed == theDevice.HIGH) {
            theDevice.high();
        } else if (prevSpeed == theDevice.MEDIUM) {
            theDevice.medium();
        } else if (prevSpeed == theDevice.LOW) {
            theDevice.low();
        } else if (prevSpeed == theDevice.OFF) {
            theDevice.off(); }
    }
 
}
