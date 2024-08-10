package designPatterns.Behavioural.command.example1_CommandsInEditor.commands;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
