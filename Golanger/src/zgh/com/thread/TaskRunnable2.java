package zgh.com.thread;

import java.util.concurrent.Callable;

public class TaskRunnable2  implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		for(int i = 1;i < 100;i++){
			System.out.println("callable"+i);
		}
		return null;
	}

}
