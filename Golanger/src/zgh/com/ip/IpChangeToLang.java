package zgh.com.ip;

import java.util.Arrays;

public class IpChangeToLang {
	private static IpChangeToLang instance;
	public String ip = null;
	private IpChangeToLang() {
		// TODO Auto-generated constructor stub
		
	}
//��������ģʽ
//���������Ϊ��
	//private static IpToInt instance = new IptoInt()
//
//	public static IpToInt getInstance(){
//		return instance;
//	}
//��������ģʽ
//	public static synchronized IpToInt getInstance(){
//		if(instance==null){
//			instance = new IpToInt();
//		}
//		
//		return instance;
//		
//	}
//˫��������ʽ����
	public static IpChangeToLang getInstance(){
		if(instance == null){
			synchronized (IpChangeToLang.class) {
				if(instance == null){
					instance =  new IpChangeToLang();
				}
			}
		}
		
		return instance;
	}
	public void setIp(String ip){
		this.ip = ip;
	}
	public Long IpChange(){
		Long int_ip;
//		String ipp = this.ip.replace(".", ""); 
//		char[] arr = ipp.toCharArray();
//		for (char i : arr){
//			System.out.println(i);
//		}
		String[] ipA = ip.split("\\.");
//		for (String i : ipA){
//			System.out.println(i);
//		}
		int_ip = (Long.parseLong(ipA[0])<<24)+
				(Long.parseLong(ipA[1])<<16)+(Long.parseLong(ipA[2])<<8)+(Long.parseLong(ipA[3]));
		return int_ip;
	}
}
