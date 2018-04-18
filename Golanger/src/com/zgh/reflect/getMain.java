package com.zgh.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getMain {
	public static void main(String[] args) throws ClassNotFoundException {
		// 1����ȡStudent������ֽ���
		Class stu = Class.forName("com.zgh.reflect.Student");
		try {
			// 2����ȡmain����
			@SuppressWarnings("unchecked")
			Method methodMain = stu.getMethod("main", String[].class);
			// 3������main����
			// methodMain.invoke(null, new String[]{"a","b","c"});
			// ��һ���������������ͣ���Ϊ������static��̬�ģ�����Ϊnull���ԣ�
			// �ڶ���������String���飬����Ҫע����jdk1.4ʱ�����飬jdk1.5֮���ǿɱ����
			// ������ʱ�� new String[]{"a","b","c"} ���3�����󡣡���������Ҫ����ǿת��
			methodMain.invoke(null, (Object) new String[] { "a", "b", "c" });
			// methodMain.invoke(null, new Object[]{new
			// String[]{"a","b","c"}});//��ʽ��

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
