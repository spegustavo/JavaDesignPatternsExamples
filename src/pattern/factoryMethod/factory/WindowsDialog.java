package pattern.factoryMethod.factory;

import pattern.factoryMethod.buttons.ButtonFactoryMethod;
import pattern.factoryMethod.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public ButtonFactoryMethod createButton() {
        return new WindowsButton();
    }
}
