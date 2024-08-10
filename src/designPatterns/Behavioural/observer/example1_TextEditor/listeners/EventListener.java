package designPatterns.Behavioural.observer.example1_TextEditor.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
