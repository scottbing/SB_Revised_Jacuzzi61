package com.company;

public class JacuzziLowCommand implements Command{

    int prevSpeed;

    ElectronicDevice theDevice;
    public TurnDeviceOn(ElectronicDevice newDevice) {
        theDevice = newDevice;  // get the local object
    }

    @Override
    public void execute() {
        theDevice.on();
		prevSpeed = theDevice.getSpeed();
        theDevice.low();
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
 
}package com.company;

public class JaccuziLowCommand {
}
