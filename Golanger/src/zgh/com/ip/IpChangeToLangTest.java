package zgh.com.ip;

public class IpChangeToLangTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IpChangeToLang instance  = IpChangeToLang.getInstance();
		instance.setIp("47.95.242.51");
		Long i = instance.IpChange();
		System.out.println(i);
		
		LangChangeToIp li = LangChangeToIp.getInstance();
		li.setLangIp(i);
		String ip = li.ipChange();
		System.out.println(ip);
	}

}
