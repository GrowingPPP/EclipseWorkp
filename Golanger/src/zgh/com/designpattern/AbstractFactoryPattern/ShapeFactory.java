package zgh.com.designpattern.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	ColorInterface getColor(String color) {
		return null;
	}

	@Override
	ImplementsClass getShape(String shapeType) {
	      if(shapeType == null){
	         return null;
	      }        
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }		
	      return null;
	}

}
