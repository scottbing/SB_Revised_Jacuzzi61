package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ElectronicDevice sonyTV = DeviceFactory.getDevice(DeviceFactory.DeviceEnum.TV);
        ElectronicDevice geFan = DeviceFactory.getDevice(DeviceFactory.DeviceEnum.FAN);
        ElectronicDevice hotTub = DeviceFactory.getDevice(DeviceFactory.DeviceEnum.JACUZZI);

        int numOfEnums = DeviceFactory.DeviceEnum.values().length;
        RemoteControl remote = new RemoteControl((numOfEnums));

        TurnDeviceOn onCommand = new TurnDeviceOn(sonyTV);
        TurnDeviceOff offCommand = new TurnDeviceOff(sonyTV);
        remote.setCommand(0, onCommand, offCommand);
        remote.pressonButton(0);
        remote.pressoffButton(0);

        TurnDeviceOn onCommand = new TurnDeviceOn(hotTub);
        TurnDeviceOff offCommand = new TurnDeviceOff(hotTub);
        remote.setCommand(0, onCommand, offCommand);
		remote.pressonButton(0);
        remote.pressoffButton(0);

        JacuzziHighCommand jacuzziHigh = new JacuzziHighCommand(hotTub);
		JacuzziMedumCommand jacuzziMedium = new JacuzziMediumCommand(hotTub);
        JacuzziLowCommand jacuzziLow = new JacuzziLowCommand(hotTub);


        



    }
}
