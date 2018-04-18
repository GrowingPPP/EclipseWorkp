package com.zgh.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class getField {
	/* 
	 * ��ȡ��Ա���������ã� 
	 *  
	 * 1.������ 
	 *      1).Field[] getFields():��ȡ���е�"�����ֶ�" 
	 *      2).Field[] getDeclaredFields():��ȡ�����ֶΣ�������˽�С��ܱ�����Ĭ�ϡ����У� 
	 * 2.��ȡ�����ģ� 
	 *      1).public Field getField(String fieldName):��ȡĳ��"���е�"�ֶΣ� 
	 *      2).public Field getDeclaredField(String fieldName):��ȡĳ���ֶ�(������˽�е�) 
	 *  
	 *   �����ֶε�ֵ�� 
	 *      Field --> public void set(Object obj,Object value): 
	 *                  ����˵���� 
	 *                  1.obj:Ҫ���õ��ֶ����ڵĶ��� 
	 *                  2.value:ҪΪ�ֶ����õ�ֵ�� 
	 *  
	 */  
	/**
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 */
	/*
	 * ���
	 * ************��ȡ���й��е��ֶ�********************
		public java.lang.String com.zgh.reflect.Student.name
		************��ȡ���е��ֶ�(����˽�С��ܱ�����Ĭ�ϵ�)********************
		public java.lang.String com.zgh.reflect.Student.name
		protected int com.zgh.reflect.Student.age
		char com.zgh.reflect.Student.sex
		private java.lang.String com.zgh.reflect.Student.phoneNum
		*************��ȡ�����ֶ�**������***********************************
		public java.lang.String com.zgh.reflect.Student.name
		�����˹��С��޲ι��췽��ִ���ˡ�����
		��֤���������»�
		**************��ȡ˽���ֶ�****������********************************
		private java.lang.String com.zgh.reflect.Student.phoneNum
		��֤�绰��Student [name=���»�, age=0, sex=
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, 
	SecurityException, InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
	            //1.��ȡClass����  
	            Class stuClass = Class.forName("com.zgh.reflect.Student");  
	            //2.��ȡ�ֶ�  
	            System.out.println("************��ȡ���й��е��ֶ�********************");  
	            Field[] fieldArray = stuClass.getFields();  
	            for(Field f : fieldArray){  
	                System.out.println(f);  
	            }  
	            System.out.println("************��ȡ���е��ֶ�(����˽�С��ܱ�����Ĭ�ϵ�)********************");  
	            fieldArray = stuClass.getDeclaredFields();  
	            for(Field f : fieldArray){  
	                System.out.println(f);  
	            }  
	            System.out.println("*************��ȡ�����ֶ�**������***********************************");  
	            Field f = stuClass.getField("name");  
	            System.out.println(f);  
	            //��ȡһ������  
	            Object obj = stuClass.getConstructor().newInstance();//����Student����Student stu = new Student();  
	            //Ϊ�ֶ�����ֵ  
	            f.set(obj, "���»�");//ΪStudent�����е�name���Ը�ֵ--��stu.name = "���»�"  
	            //��֤  
	            Student stu = (Student)obj;  
	            System.out.println("��֤������" + stu.name);  
	              
	              
	            System.out.println("**************��ȡ˽���ֶ�****������********************************");  
	            f = stuClass.getDeclaredField("phoneNum");  
	            System.out.println(f);  
	            f.setAccessible(true);//�������䣬���˽���޶�  
	            f.set(obj, "18888889999");  
	            System.out.println("��֤�绰��" + stu);  
	}

}
