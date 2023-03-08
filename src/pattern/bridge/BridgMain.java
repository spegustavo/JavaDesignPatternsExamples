package pattern.bridge;

public class BridgMain {

	public static void main(String[] args) {
		BridgeShape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		BridgeShape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
