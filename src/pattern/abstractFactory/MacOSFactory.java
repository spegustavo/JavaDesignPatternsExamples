package pattern.abstractFactory;

import pattern.abstractFactory.buttons.Button;
import pattern.abstractFactory.buttons.MacOSButton;
import pattern.abstractFactory.checkbox.Checkbox;
import pattern.abstractFactory.checkbox.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
