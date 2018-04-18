package zgh.com.designpattern.FactoryPattern;

public class Factory {
	public ImplementClass getShape(String shapeDirection){
		if(shapeDirection == null){
			return null;
		}
		if(shapeDirection.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shapeDirection.equalsIgnoreCase("SQUARE")){
			return new Square();
		} else if (shapeDirection.equalsIgnoreCase("RECTANGE")){
			return new Rectange();
		} else {
			return null;
		}
	}
}
