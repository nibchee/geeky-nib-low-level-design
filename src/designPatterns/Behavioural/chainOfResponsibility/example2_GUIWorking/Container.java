package designPatterns.Behavioural.chainOfResponsibility.example2_GUIWorking;

import java.util.ArrayList;
import java.util.List;

// Containers can contain both simple components and other
// components as children. The chain relationships are
// established here. The class inherits showHelp behavior from
// its parent.
public class Container extends Component {
    protected List<Component> children = new ArrayList<>();

    public void add(Component child) {
        children.add(child);
        child.setContainer(this);
    }

}
