package pattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	
	private static final HashMap<FlyShapeType,FlyShape> shapes = new HashMap<FlyShapeType,FlyShape>();

	public static FlyShape getShape(FlyShapeType type) {
		FlyShape shapeImpl = shapes.get(type);

		if (shapeImpl == null) {
			if (type.equals(FlyShapeType.OVAL_FILL)) {
				shapeImpl = new Oval(true);
			} else if (type.equals(FlyShapeType.OVAL_NOFILL)) {
				shapeImpl = new Oval(false);
			} else if (type.equals(FlyShapeType.LINE)) {
				shapeImpl = new Line();
			}
			shapes.put(type, shapeImpl);
		}
		return shapeImpl;
	}
	
	public static enum FlyShapeType{ 
		OVAL_FILL,
		OVAL_NOFILL,
		LINE;
	}

}
