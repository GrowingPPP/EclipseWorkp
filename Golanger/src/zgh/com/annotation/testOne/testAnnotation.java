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
			System.out.println("������"+des.value());
			System.out.println("-----------");
		}
		// ��JavaE��һ�������õ�@Name��ȫ���������浽Set��ȥ
		Set<Method> set = new HashSet<Method>();
	        for (int i = 0; i < method.length; i++) {
	                boolean otherFlag = method[i].isAnnotationPresent(Name.class);
	                if (otherFlag)
	                    set.add(method[i]);
	        }
	        for (Method m : set) {
	                Name name = m.getAnnotation(Name.class);
	                System.out.println("��ʼ�ˣ�"+name.originate());
	                System.out.println("����������:" + name.community());
	        }
		
	}

}
