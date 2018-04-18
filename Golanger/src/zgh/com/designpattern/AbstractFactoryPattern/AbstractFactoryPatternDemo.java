package zgh.com.designpattern.AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// ��ȡ��״����
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// ��ȡ��״Ϊ Circle �Ķ���
		ImplementsClass shape1 = shapeFactory.getShape("CIRCLE");

		// ���� Circle �� draw ����
		shape1.draw();

		// ��ȡ��״Ϊ Rectangle �Ķ���
		ImplementsClass shape2 = shapeFactory.getShape("RECTANGLE");

		// ���� Rectangle �� draw ����
		shape2.draw();

		// ��ȡ��״Ϊ Square �Ķ���
		ImplementsClass shape3 = shapeFactory.getShape("SQUARE");

		// ���� Square �� draw ����
		shape3.draw();

		// ��ȡ��ɫ����
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// ��ȡ��ɫΪ Red �Ķ���
		ColorInterface color1 = colorFactory.getColor("RED");

		// ���� Red �� fill ����
		color1.fill();

		// ��ȡ��ɫΪ Green �Ķ���
		ColorInterface color2 = colorFactory.getColor("Green");

		// ���� Green �� fill ����
		color2.fill();

		// ��ȡ��ɫΪ Blue �Ķ���
		ColorInterface color3 = colorFactory.getColor("BLUE");

		// ���� Blue �� fill ����
		color3.fill();
	}

}
