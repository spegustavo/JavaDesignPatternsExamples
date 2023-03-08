package pattern.abstractFactory;

import pattern.abstractFactory.buttons.Button;
import pattern.abstractFactory.checkbox.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
