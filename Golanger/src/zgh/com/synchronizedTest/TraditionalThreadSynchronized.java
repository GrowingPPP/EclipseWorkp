package zgh.com.synchronizedTest;

public class TraditionalThreadSynchronized {
	public static void main(String[] args) {
		final Outputter outputter = new Outputter();
		// ���������̷ֱ߳��������zhangsan��lisi
		new Thread() {
			public void run() {
				try {
					outputter.output("zhangsanbbbbbbbbbbbbbbbbbbbb");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					outputter.output("lisiaaaaaaaaaaaaaaaaaaaaaaaaa");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}
}

class Outputter {
	public synchronized void  output(String name) throws InterruptedException {
		//ʹ��synchronized���εķ������ߴ������Կ�����һ�� ԭ�Ӳ�����
		// TODO Ϊ�˱�֤��name���������һ��ԭ�Ӳ���������������name��ÿ���ַ�
		//Object lock = new Object();
		//synchronized (this) {
			for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i));
				 Thread.sleep(10);
			}
		//}
	}
}
