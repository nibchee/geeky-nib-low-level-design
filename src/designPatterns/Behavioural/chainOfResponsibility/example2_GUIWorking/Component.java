package designPatterns.Behavioural.chainOfResponsibility.example2_GUIWorking;

// The base class for simple components.
public class Component implements ComponentWithContextualHelp {
    protected String tooltipText;

    // The component's container acts as the next link in the chain of handlers.
    protected Container container;

    // The component shows a tooltip if there's help text assigned to it.
    // Otherwise it forwards the call to the container, if it exists.
    public void showHelp() {
        if (tooltipText != null) {
            // Show tooltip.
            System.out.println(tooltipText);
        } else if (container != null) {
            container.showHelp();
        }
    }


    public void setContainer(Container container) {
        this.container = container;
    }


}
