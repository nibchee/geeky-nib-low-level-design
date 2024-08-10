package designPatterns.Behavioural.observer.example1_TextEditor;

import designPatterns.Behavioural.observer.example1_TextEditor.editor.Editor;
import designPatterns.Behavioural.observer.example1_TextEditor.listeners.EmailNotificationListener;
import designPatterns.Behavioural.observer.example1_TextEditor.listeners.LogOpenListener;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("\"/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
