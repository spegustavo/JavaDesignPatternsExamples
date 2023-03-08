package pattern.factoryMethod.factory;

import pattern.factoryMethod.buttons.ButtonFactoryMethod;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        ButtonFactoryMethod okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract ButtonFactoryMethod createButton();
}
