package pattern.factoryMethod.buttons;

public class HtmlButton implements ButtonFactoryMethod {

	 public void render() {
	        System.out.println("<button>Test Button</button>");
	        onClick();
	    }

	    public void onClick() {
	        System.out.println("Click! Button says - 'Hello World!'");
	    }

}
