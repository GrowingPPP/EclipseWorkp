package zgh.com.designpattern.AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory {

	@Override
	ColorInterface getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	@Override
	ImplementsClass getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
