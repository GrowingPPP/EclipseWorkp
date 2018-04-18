package zgh.com.tuozhang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {
	/*
	 * Java 提供了一种对象序列化的机制，该机制中，一个对象可以被表示为一个字节序列，
	 * 该字节序列包括该对象的数据、有关对象的类型的信息和存储在对象中数据的类型。
	 * 
	 * 将序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化，
	 * 也就是说，对象的类型信息、对象的数据，还有对象中的数据类型可以用来在内存中新建对象。
	 * 
	 * 整个过程都是 Java 虚拟机（JVM）独立的， 也就是说，在一个平台上序列化的对象可以在另一个完全不同的平台上反序列化该对象。
	 * 
	 * 类 ObjectInputStream 和 ObjectOutputStream 是高层次的数据流，它们包含序列化和反序列化对象的方法。
	 * 
	 * 整个过程都是 Java 虚拟机（JVM）独立的，也就是说，在一个平台上序列化的对象可以在另一个完全不同的平台上反序列化该对象。
	 * 
	 * 类 ObjectInputStream 和 ObjectOutputStream 是高层次的数据流，它们包含序列化和反序列化对象的方法。
	 * 
	 * ObjectOutputStream 类包含很多写方法来写各种数据类型，但是一个特别的方法例外：
	 * 
	 * public final void writeObject(Object x) throws IOException
	 * 上面的方法序列化一个对象，并将它发送到输出流。相似的 ObjectInputStream 类包含如下反序列化一个对象的方法：
	 * 
	 * public final Object readObject() throws IOException,
	 * ClassNotFoundException
	 * 该方法从流中取出下一个对象，并将对象反序列化。它的返回值为Object，因此，你需要将它转换成合适的数据类型。
	 */
	public static void main(String[] args) {
		//right();
		left();
	}

	public static void right() {
		EmployeeSerializable e = new EmployeeSerializable();

		e.name = "zhangguanghui";
		e.address = "harbin";
		e.SSN = 112343;
		e.number = 101;

		try {
			FileOutputStream fout = new FileOutputStream(
					"D://EclipseWorkp//Golanger//src//zgh//com//tuozhang//xuliehua.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(e);
			out.close();
			fout.close();
			System.out.println(
					"Serialized data is saved in D://EclipseWorkp//Golanger//src//zgh//com//tuozhang//xuliehua.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void left() {
		EmployeeSerializable e = null;
		try {
			FileInputStream fileIn = new FileInputStream(
					"D://EclipseWorkp//Golanger//src//zgh//com//tuozhang//xuliehua.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (EmployeeSerializable) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.address);
		System.out.println("SSN: " + e.SSN);
		System.out.println("Number: " + e.number);
	}

}
