package com.zgh.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* 
* 通过Class对象可以获取某个类中的：构造方法、成员变量、成员方法；并访问成员； 
*  
* 1.获取构造方法： 
*      1).批量的方法： 
*          public Constructor[] getConstructors()：所有"公有的"构造方法 
            public Constructor[] getDeclaredConstructors()：获取所有的构造方法(包括私有、受保护、默认、公有) 
    
*      2).获取单个的方法，并调用： 
*          public Constructor getConstructor(Class... parameterTypes):获取单个的"公有的"构造方法： 
*          public Constructor getDeclaredConstructor(Class... parameterTypes):获取"某个构造方法"可以是私有的，或受保护、默认、公有； 
*       
*          调用构造方法： 
*          Constructor-->newInstance(Object... initargs) 
*/  
public class getConstructors {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class stu = Class.forName("com.zgh.reflect.Student");
		
	        //2.获取所有公有构造方法  
	        System.out.println("**********************所有公有构造方法*********************************"); 
		Constructor[] cons = stu.getConstructors();
		for(Constructor con : cons){
			System.out.println(con);
		}
		/**
		 * public com.zgh.reflect.Student(java.lang.String,int)
			public com.zgh.reflect.Student(char)
			public com.zgh.reflect.Student()
		 */
		
	        System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");  
	        Constructor[]   conArray = stu.getDeclaredConstructors();  
	        for(Constructor c : conArray){  
	            System.out.println(c);  
	        }  
	        
	        System.out.println("*****************获取公有、无参的构造方法*******************************");  
	        Constructor con = stu.getConstructor(null);  
	        //1>、因为是无参的构造方法所以类型是一个null,不写也可以：这里需要的是一个参数的类型，切记是类型  
	        //2>、返回的是描述这个无参构造函数的类对象。  
	      
	        System.out.println("con = " + con);  
	        //调用构造方法  
	        Object obj = con.newInstance();  
	        //  System.out.println("obj = " + obj);  
	        //  Student stu = (Student)obj;  
	          
	        System.out.println("******************获取私有构造方法，并调用*******************************");  
	        con = stu.getDeclaredConstructor(char.class);  
	        System.out.println(con);  
	        //调用构造方法  
	        con.setAccessible(true);//暴力访问(忽略掉访问修饰符)  
	        obj = con.newInstance('男');  
	}

}
