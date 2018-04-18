package com.zgh.reflect;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class getTxtContent {

	public static String getValue(String key) throws IOException{
		Properties pro = new Properties();//��ȡ�����ļ��Ķ���  
		FileReader file = new FileReader("D://EclipseWorkp//Golanger//src//com//zgh//reflect//config.txt");//��ȡ������  
		pro.load(file);
		file.close();
		return pro.getProperty(key);//���ظ���key��ȡ��valueֵ
	}
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException, ClassNotFoundException, IOException {
	        //ͨ�������ȡClass����  
	        Class stuClass = Class.forName(getValue("className"));//"com.zgh.reflect.Student"  
	        //2��ȡshow()����  
	        Method m = stuClass.getMethod(getValue("methodName"));//txtShow  
	        //3.����show()����  
	        m.invoke(stuClass.getConstructor().newInstance());  
	}

}
