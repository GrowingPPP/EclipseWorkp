package zgh.com.annotation.testOne;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class testAnnotation {

	public static void main(String[] args) throws Exception{
		String className = "zgh.com.annotation.JavaE";
		Class test = Class.forName(className);
		
		Method[] method = test.getDeclaredMethods();
		
		boolean flag = test.isAnnotationPresent(Description.class);
		if(flag){
			Description des = (Description) test.getAnnotation(Description.class);
			System.out.println("描述："+des.value());
			System.out.println("-----------");
		}
		// 把JavaE这一类有利用到@Name的全部方法保存到Set中去
		Set<Method> set = new HashSet<Method>();
	        for (int i = 0; i < method.length; i++) {
	                boolean otherFlag = method[i].isAnnotationPresent(Name.class);
	                if (otherFlag)
	                    set.add(method[i]);
	        }
	        for (Method m : set) {
	                Name name = m.getAnnotation(Name.class);
	                System.out.println("创始人："+name.originate());
	                System.out.println("创建的社区:" + name.community());
	        }
		
	}

}
