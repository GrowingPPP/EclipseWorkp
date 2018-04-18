package zgh.com.designpattern.FactoryPattern;

public class factoryPatternDemo {
	public static void main(String[] args) {
		Factory factory = new Factory();
		ImplementClass circle = factory.getShape("CIRCLE");
		circle.drows();
		ImplementClass square = factory.getShape("SQUARE");
		square.drows();
		ImplementClass rectange = factory.getShape("rectange");
		rectange.drows();
	}
	
}
