package zgh.com.ip;

public class LangChangeToIp {
	private static LangChangeToIp li;
	public Long i;
	public LangChangeToIp() {
		// TODO Auto-generated constructor stub
	}
	public static synchronized LangChangeToIp getInstance(){
		if(li == null){
			li = new LangChangeToIp();
		}
		return li;
		
	}
	public void setLangIp(Long i){
		this.i = i;
	}
	public String ipChange(){
		StringBuffer sb = new StringBuffer("");  
	        // 直接右移24位  
	        sb.append(String.valueOf((i >>> 24)));  
	        sb.append(".");  
	        // 将高8位置0，然后右移16位  
	        sb.append(String.valueOf((i & 0x00FFFFFF) >>> 16));  
	        sb.append(".");  
	        // 将高16位置0，然后右移8位  
	        sb.append(String.valueOf((i & 0x0000FFFF) >>> 8));  
	        sb.append(".");  
	        // 将高24位置0  
	        sb.append(String.valueOf((i & 0x000000FF)));  
	        return sb.toString();  
	}
}
