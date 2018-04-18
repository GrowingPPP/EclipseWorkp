package zgh.com.tuozhang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {
	/*
	 * Java �ṩ��һ�ֶ������л��Ļ��ƣ��û����У�һ��������Ա���ʾΪһ���ֽ����У�
	 * ���ֽ����а����ö�������ݡ��йض�������͵���Ϣ�ʹ洢�ڶ��������ݵ����͡�
	 * 
	 * �����л�����д���ļ�֮�󣬿��Դ��ļ��ж�ȡ���������Ҷ������з����л���
	 * Ҳ����˵�������������Ϣ����������ݣ����ж����е��������Ϳ����������ڴ����½�����
	 * 
	 * �������̶��� Java �������JVM�������ģ� Ҳ����˵����һ��ƽ̨�����л��Ķ����������һ����ȫ��ͬ��ƽ̨�Ϸ����л��ö���
	 * 
	 * �� ObjectInputStream �� ObjectOutputStream �Ǹ߲�ε������������ǰ������л��ͷ����л�����ķ�����
	 * 
	 * �������̶��� Java �������JVM�������ģ�Ҳ����˵����һ��ƽ̨�����л��Ķ����������һ����ȫ��ͬ��ƽ̨�Ϸ����л��ö���
	 * 
	 * �� ObjectInputStream �� ObjectOutputStream �Ǹ߲�ε������������ǰ������л��ͷ����л�����ķ�����
	 * 
	 * ObjectOutputStream ������ܶ�д������д�����������ͣ�����һ���ر�ķ������⣺
	 * 
	 * public final void writeObject(Object x) throws IOException
	 * ����ķ������л�һ�����󣬲��������͵�����������Ƶ� ObjectInputStream ��������·����л�һ������ķ�����
	 * 
	 * public final Object readObject() throws IOException,
	 * ClassNotFoundException
	 * �÷���������ȡ����һ�����󣬲����������л������ķ���ֵΪObject����ˣ�����Ҫ����ת���ɺ��ʵ��������͡�
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
