package zgh.com.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class MyHashtable {
	public static void main(String[] args) {
		/*
		 *     ����HashMap������ƣ�������֧��ͬ����
			��HashMapһ����Hashtable�ڹ�ϣ���д洢��/ֵ�ԡ���ʹ��һ����ϣ����Ҫָ���������Ķ����Լ�Ҫ���ӵ��ü���ֵ��
			Ȼ�󣬸ü�������ϣ���������õ���ɢ���뱻�����洢�ڸñ���ֵ��������
		 */
		
		     // Create a hash map
		      Hashtable balance = new Hashtable();
		      Enumeration names;//ö��
		      String str;
		      double bal;

		      balance.put("Zara", new Double(3434.34));
		      balance.put("Mahnaz", new Double(123.22));
		      balance.put("Ayan", new Double(1378.00));
		      balance.put("Daisy", new Double(99.22));
		      balance.put("Qadir", new Double(-19.08));

		      // Show all balances in hash table.
		      names = balance.keys();
		      while(names.hasMoreElements()) {
		         str = (String) names.nextElement();
		         System.out.println(str + ": " +
		         balance.get(str));
		      }
		      System.out.println();
		      // Deposit 1,000 into Zara's account
		      bal = ((Double)balance.get("Zara")).doubleValue();
		      balance.put("Zara", new Double(bal+1000));
		      System.out.println("Zara's new balance: " +
		      balance.get("Zara"));
		
		
		
	}
}