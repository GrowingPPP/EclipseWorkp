package zgh.com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		map.put("zhangguanghui", "black");
		map.put("liuxiaorui", "white");
		map.put("wangbangjun", "shuai");
		map.put("miaoguangqiang", "pang");
		
		//boolean containsKey(Object k)
		//�����ӳ�����ָ������ӳ���ϵ���򷵻� true
		
		boolean flag1 = map.containsKey("zhangguanghui");
		System.out.println(flag1);
		
		//	boolean containsValue(Object v)
		//�����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true
		
		boolean flag2 = map.containsValue("white");
		System.out.println(flag2);
		
		//	Set entrySet( )
		//	���ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ��
		Set setKey = map.entrySet();
		System.out.println(setKey);
		
		
//		Iterator<String> it = setKey.iterator();
//		while (it.hasNext()){
//			String i = it.next();
//			System.out.println(i);
//		}
//		
//		for (String i : setKey){
//			System.out.println(i);
//		}
		
	}
}
