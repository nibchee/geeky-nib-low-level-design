package designPatterns.Behavioural.command.example1_CommandsInEditor.commands;

import designPatterns.Behavioural.command.example1_CommandsInEditor.editor.Editor;

public class CopyCommand extends Command{
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
