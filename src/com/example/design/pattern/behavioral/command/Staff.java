package com.example.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private List<Command> commands = new ArrayList<>();
    public void addCommand(Command command){
        commands.add(command);
    }

    public void executeCommand(){
        commands.forEach(command -> command.execute());
        commands.clear();
    }
}
