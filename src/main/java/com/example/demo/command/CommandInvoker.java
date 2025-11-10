package com.example.demo.command;

import java.util.Stack;

public class CommandInvoker {
    private Stack<Command> history = new Stack<>();

    public void run(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLast() {
        if (!history.isEmpty()) {
            Command last = history.pop();
            last.undo();
        }
    }
}

