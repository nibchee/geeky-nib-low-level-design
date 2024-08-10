package designPatterns.Behavioural.command.example1_CommandsInEditor.commands;

import designPatterns.Behavioural.command.example1_CommandsInEditor.editor.Editor;

public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
