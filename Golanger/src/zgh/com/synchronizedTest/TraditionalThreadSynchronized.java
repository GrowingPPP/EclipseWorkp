package zgh.com.synchronizedTest;

public class TraditionalThreadSynchronized {
	public static void main(String[] args) {
		final Outputter outputter = new Outputter();
		// 运行两个线程分别输出名字zhangsan和lisi
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
		//使用synchronized修饰的方法或者代码块可以看成是一个 原子操作。
		// TODO 为了保证对name的输出不是一个原子操作，这里逐个输出name的每个字符
		//Object lock = new Object();
		//synchronized (this) {
			for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i));
				 Thread.sleep(10);
			}
		//}
	}
}
