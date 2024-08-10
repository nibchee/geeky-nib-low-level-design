package designPatterns.Behavioural.observer.example1_TextEditor.editor;

import designPatterns.Behavioural.observer.example1_TextEditor.publisher.EventManager;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    //providing eventTypes
    public  Editor(){
        this.events=new EventManager("open","save");
    }

    public void openFile(String filepath){
        this.file=new File(filepath);
        events.notify("open",file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
