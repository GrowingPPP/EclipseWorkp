package com.zgh.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* 
* ͨ��Class������Ի�ȡĳ�����еģ����췽������Ա��������Ա�����������ʳ�Ա�� 
*  
* 1.��ȡ���췽���� 
*      1).�����ķ����� 
*          public Constructor[] getConstructors()������"���е�"���췽�� 
            public Constructor[] getDeclaredConstructors()����ȡ���еĹ��췽��(����˽�С��ܱ�����Ĭ�ϡ�����) 
    
*      2).��ȡ�����ķ����������ã� 
*          public Constructor getConstructor(Class... parameterTypes):��ȡ������"���е�"���췽���� 
*          public Constructor getDeclaredConstructor(Class... parameterTypes):��ȡ"ĳ�����췽��"������˽�еģ����ܱ�����Ĭ�ϡ����У� 
*       
*          ���ù��췽���� 
*          Constructor-->newInstance(Object... initargs) 
*/  
public class getConstructors {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class stu = Class.forName("com.zgh.reflect.Student");
		
	        //2.��ȡ���й��й��췽��  
	        System.out.println("**********************���й��й��췽��*********************************"); 
		Constructor[] cons = stu.getConstructors();
		for(Constructor con : cons){
			System.out.println(con);
		}
		/**
		 * public com.zgh.reflect.Student(java.lang.String,int)
			public com.zgh.reflect.Student(char)
			public com.zgh.reflect.Student()
		 */
		
	        System.out.println("************���еĹ��췽��(������˽�С��ܱ�����Ĭ�ϡ�����)***************");  
	        Constructor[]   conArray = stu.getDeclaredConstructors();  
	        for(Constructor c : conArray){  
	            System.out.println(c);  
	        }  
	        
	        System.out.println("*****************��ȡ���С��޲εĹ��췽��*******************************");  
	        Constructor con = stu.getConstructor(null);  
	        //1>����Ϊ���޲εĹ��췽������������һ��null,��дҲ���ԣ�������Ҫ����һ�����������ͣ��м�������  
	        //2>�����ص�����������޲ι��캯���������  
	      
	        System.out.println("con = " + con);  
	        //���ù��췽��  
	        Object obj = con.newInstance();  
	        //  System.out.println("obj = " + obj);  
	        //  Student stu = (Student)obj;  
	          
	        System.out.println("******************��ȡ˽�й��췽����������*******************************");  
	        con = stu.getDeclaredConstructor(char.class);  
	        System.out.println(con);  
	        //���ù��췽��  
	        con.setAccessible(true);//��������(���Ե��������η�)  
	        obj = con.newInstance('��');  
	}

}
