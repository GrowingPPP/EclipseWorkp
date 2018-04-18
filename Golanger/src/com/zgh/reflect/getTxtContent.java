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
		Properties pro = new Properties();//获取配置文件的对象  
		FileReader file = new FileReader("D://EclipseWorkp//Golanger//src//com//zgh//reflect//config.txt");//获取输入流  
		pro.load(file);
		file.close();
		return pro.getProperty(key);//返回根据key获取的value值
	}
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException, ClassNotFoundException, IOException {
	        //通过反射获取Class对象  
	        Class stuClass = Class.forName(getValue("className"));//"com.zgh.reflect.Student"  
	        //2获取show()方法  
	        Method m = stuClass.getMethod(getValue("methodName"));//txtShow  
	        //3.调用show()方法  
	        m.invoke(stuClass.getConstructor().newInstance());  
	}

}
