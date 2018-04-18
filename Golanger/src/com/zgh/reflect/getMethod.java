package com.zgh.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getMethod {
/*
 * ***************获取所有的”公有“方法*******************
		public java.lang.String com.zgh.reflect.Student.toString()
		public void com.zgh.reflect.Student.show1(java.lang.String)
		public final void java.lang.Object.wait() throws java.lang.InterruptedException
		public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
		public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
		public boolean java.lang.Object.equals(java.lang.Object)
		public native int java.lang.Object.hashCode()
		public final native java.lang.Class java.lang.Object.getClass()
		public final native void java.lang.Object.notify()
		public final native void java.lang.Object.notifyAll()
		***************获取所有的方法，包括私有的*******************
		public java.lang.String com.zgh.reflect.Student.toString()
		public void com.zgh.reflect.Student.show1(java.lang.String)
		private java.lang.String com.zgh.reflect.Student.show4(int)
		protected void com.zgh.reflect.Student.show2()
		void com.zgh.reflect.Student.show3()
		***************获取公有的show1()方法*******************
		public void com.zgh.reflect.Student.show1(java.lang.String)
		调用了公有、无参构造方法执行了。。。
		调用了：公有的，String参数的show1(): s = 刘德华
		***************获取私有的show4()方法******************
		private java.lang.String com.zgh.reflect.Student.show4(int)
		调用了，私有的，并且有返回值的，int参数的show4(): age = 20
		返回值：abcd
 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
	        //1.获取Class对象  
	        Class stuClass = Class.forName("com.zgh.reflect.Student");  
	        //2.获取所有公有方法  
	        System.out.println("***************获取所有的”公有“方法*******************");  
	        stuClass.getMethods();  
	        Method[] methodArray = stuClass.getMethods();  
	        for(Method m : methodArray){  
	            System.out.println(m);  
	        }  
	        System.out.println("***************获取所有的方法，包括私有的*******************");  
	        methodArray = stuClass.getDeclaredMethods();  
	        for(Method m : methodArray){  
	            System.out.println(m);  
	        }  
	        System.out.println("***************获取公有的show1()方法*******************");  
	        //m = stuClass.getDeclaredMethod("show4", int.class);//调用制定方法（所有包括私有的），需要传入两个参数，
	        //第一个是调用的方法名称，第二个是方法的形参类型，切记是类型
	        Method m = stuClass.getMethod("show1", String.class);  
	        System.out.println(m);  
	        //实例化一个Student对象  
	        Object obj = stuClass.getConstructor().newInstance();  
	        m.invoke(obj, "刘德华");  
	          
	        System.out.println("***************获取私有的show4()方法******************");  
	        m = stuClass.getDeclaredMethod("show4", int.class);  
	        System.out.println(m);  
	        m.setAccessible(true);//解除私有限定  
	        Object result = m.invoke(obj, 20);//需要两个参数，一个是要调用的对象（获取有反射），一个是实参  
	        System.out.println("返回值：" + result);  
	          
	}

}
