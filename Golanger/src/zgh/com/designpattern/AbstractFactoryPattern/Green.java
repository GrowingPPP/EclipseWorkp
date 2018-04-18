package zgh.com.designpattern.AbstractFactoryPattern;

public class Green implements ColorInterface {

	@Override
	public void fill() {
		 System.out.println("Inside Green::fill() method.");
	}

}
