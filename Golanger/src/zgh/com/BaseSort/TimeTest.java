package zgh.com.BaseSort;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class TimeTest { 
	public static void test(String className,String funcName,int[] arr,int n) throws ClassNotFoundException,
	NoSuchMethodException, SecurityException, InstantiationException, 
	IllegalAccessException, IllegalArgumentException,
	InvocationTargetException{
		
		Class c = Class.forName(className);
		@SuppressWarnings("unchecked")
		Method method = c.getDeclaredMethod(funcName, int[].class,int.class);
		Object obj = c.getConstructor().newInstance();
		Date date = new Date();
//		for(int i : arr){
//			System.out.print(i+ "  ");
//		}
				System.out.println();
				
		long before = System.currentTimeMillis();
		
				System.out.println(before);
		
		method.invoke(obj, arr,n);
		
		long end = System.currentTimeMillis();
		
				System.out.println(end);
		
//		for(int i : arr){
//			System.out.print(i+ "  ");
//		}
		System.out.println();
		System.out.println(className+":"+funcName+":"+"∏√≈≈–Ú÷¥––¡À"+(end-before)+"ms");
	}
	public static void main(String[] args) throws ClassNotFoundException, 
	NoSuchMethodException, SecurityException, InstantiationException, 
	IllegalAccessException, IllegalArgumentException, 
	InvocationTargetException {
		
		int n = 1000000;
		int[] arr = RandomArr.randomArrayFactory(n, 0, 900000);
		//quickSort.sort
		String QclassName = "zgh.com.BaseSort.QuickSort";
		String QfuncName = "sort";

		TimeTest.test(QclassName, QfuncName, arr, n);
		//mergeSort.sort
		String GclassName = "zgh.com.BaseSort.mergeSort";
		String GfuncName = "sort";
		
		TimeTest.test(GclassName, GfuncName, arr, n);

	}
}
