package designPatterns.Behavioural.chainOfResponsibility.example2_GUIWorking;

public class Main {
    private Dialog dialog;

    // Every application configures the chain differently.
    public void createUI() {
        dialog = new Dialog("http://example.com/wikiPage");

        Panel panel = new Panel("This panel does...");
        Button ok = new Button();
        ok.tooltipText = "This is an OK button that...";
        Button cancel = new Button();
        cancel.tooltipText = "This is a Cancel button that...";

        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);
    }

    // Imagine what happens here.
    public void onF1KeyPress(Component component) {
        component.showHelp();
    }

    // Dummy method to simulate getting component at mouse coordinates.
    public Component getComponentAtMouseCoords() {
        // This would return a specific component based on mouse coordinates.
        return dialog;
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.createUI();
        app.onF1KeyPress(app.getComponentAtMouseCoords());
    }
}
