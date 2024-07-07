package designPatterns.Behavioural.chainOfResponsibility.example2_GUIWorking;

// But complex components may override the default
// implementation. If the help text can't be provided in a new
// way, the component can always call the base implementation
// (see Component class).
public class Panel extends Container {
    private String modalHelpText;

    public Panel(String modalHelpText) {
        this.modalHelpText = modalHelpText;
    }

    @Override
    public void showHelp() {
        if (modalHelpText != null) {
            // Show a modal window with the help text.
            System.out.println(modalHelpText);
        } else {
            super.showHelp();
        }
    }
}
