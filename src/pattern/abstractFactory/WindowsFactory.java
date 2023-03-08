package pattern.abstractFactory;

import pattern.abstractFactory.buttons.Button;
import pattern.abstractFactory.buttons.WindowsButton;
import pattern.abstractFactory.checkbox.Checkbox;
import pattern.abstractFactory.checkbox.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
