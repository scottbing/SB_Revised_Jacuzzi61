package com.company;

public class EmptyCommand implements Command {

    public EmptyCommand(){}

    @Override
    public void execute(){}

    public void undo(){}

}
