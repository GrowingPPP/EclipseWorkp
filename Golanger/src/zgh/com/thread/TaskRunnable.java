package zgh.com.thread;

public class TaskRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i < 100;i++){
			System.out.println("自定义线程任务在执行"+i);
		}
	}
	
}
