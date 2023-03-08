package pattern.factoryMethod.factory;

import pattern.factoryMethod.buttons.ButtonFactoryMethod;
import pattern.factoryMethod.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public ButtonFactoryMethod createButton() {
        return new HtmlButton();
    }
}
