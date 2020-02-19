package com.company;

import java.rmi.Remote;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command UndoCommand;

    public RemoteControl(int numDevices) {
        onCommands = new Command[numDevices];
        offCommands = new Command[numDevices];

        Command emptyCommand = new EmptyCommand();
        for(int i=0; i<numDevices; i++) {
            onCommands[i] = emptyCommand;
            offCommands[i] = emptyCommand;
        }
    }

    public void setCommand (int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }

    public void pressonButton(int slot) {
        onCommands[slot].execute();
    }

    public void pressoffButton(int slot) {
        offCommands[slot].execute();
    }

    public void pressUndo() {
        UndoCommand.undo();
    }
}
