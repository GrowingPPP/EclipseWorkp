package com.zgh.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getMethod {
/*
 * ***************��ȡ���еġ����С�����*******************
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
		***************��ȡ���еķ���������˽�е�*******************
		public java.lang.String com.zgh.reflect.Student.toString()
		public void com.zgh.reflect.Student.show1(java.lang.String)
		private java.lang.String com.zgh.reflect.Student.show4(int)
		protected void com.zgh.reflect.Student.show2()
		void com.zgh.reflect.Student.show3()
		***************��ȡ���е�show1()����*******************
		public void com.zgh.reflect.Student.show1(java.lang.String)
		�����˹��С��޲ι��췽��ִ���ˡ�����
		�����ˣ����еģ�String������show1(): s = ���»�
		***************��ȡ˽�е�show4()����******************
		private java.lang.String com.zgh.reflect.Student.show4(int)
		�����ˣ�˽�еģ������з���ֵ�ģ�int������show4(): age = 20
		����ֵ��abcd
 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
	        //1.��ȡClass����  
	        Class stuClass = Class.forName("com.zgh.reflect.Student");  
	        //2.��ȡ���й��з���  
	        System.out.println("***************��ȡ���еġ����С�����*******************");  
	        stuClass.getMethods();  
	        Method[] methodArray = stuClass.getMethods();  
	        for(Method m : methodArray){  
	            System.out.println(m);  
	        }  
	        System.out.println("***************��ȡ���еķ���������˽�е�*******************");  
	        methodArray = stuClass.getDeclaredMethods();  
	        for(Method m : methodArray){  
	            System.out.println(m);  
	        }  
	        System.out.println("***************��ȡ���е�show1()����*******************");  
	        //m = stuClass.getDeclaredMethod("show4", int.class);//�����ƶ����������а���˽�еģ�����Ҫ��������������
	        //��һ���ǵ��õķ������ƣ��ڶ����Ƿ������β����ͣ��м�������
	        Method m = stuClass.getMethod("show1", String.class);  
	        System.out.println(m);  
	        //ʵ����һ��Student����  
	        Object obj = stuClass.getConstructor().newInstance();  
	        m.invoke(obj, "���»�");  
	          
	        System.out.println("***************��ȡ˽�е�show4()����******************");  
	        m = stuClass.getDeclaredMethod("show4", int.class);  
	        System.out.println(m);  
	        m.setAccessible(true);//���˽���޶�  
	        Object result = m.invoke(obj, 20);//��Ҫ����������һ����Ҫ���õĶ��󣨻�ȡ�з��䣩��һ����ʵ��  
	        System.out.println("����ֵ��" + result);  
	          
	}

}
