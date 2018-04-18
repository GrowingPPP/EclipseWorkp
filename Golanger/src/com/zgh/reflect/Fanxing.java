package com.zgh.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Fanxing {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("aaa");
		arr.add("bbb");
		Class listClass = arr.getClass();
		
		Method m = listClass.getMethod("add", Object.class);
		
		m.invoke(arr, 100);
		
		for(Object s : arr)
		{
			System.out.println(s);
		}
	}

}
