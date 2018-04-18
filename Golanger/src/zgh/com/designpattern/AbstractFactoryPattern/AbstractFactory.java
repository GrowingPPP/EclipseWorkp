package zgh.com.designpattern.AbstractFactoryPattern;

public abstract class AbstractFactory {
	abstract ColorInterface getColor(String color);
	abstract ImplementsClass getShape(String shape);
}	
