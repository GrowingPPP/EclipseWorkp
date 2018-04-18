package zgh.com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread {
	/*
	 * 
	 * 1、线程池，其实就是一个容纳多个线程的容器，其中的线程可以反复使用，
	 * 	省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多资源。（是什么）

		2、那么，我们为什么需要用到线程池呢？每次用的时候手动创建不行吗？
		
		在java中，如果每个请求到达就创建一个新线程，开销是相当大的。
		在实际使用中，创建和销毁线程花费的时间和消耗的系统资源都相当大
		，甚至可能要比在处理实际的用户请求的时间和资源要多的多。
		除了创建和销毁线程的开销之外，活动的线程也需要消耗系统资源。
		如果在一个jvm里创建太多的线程，可能会使系统由于过度消耗内存或"切换过度"而导致系统资源不足。
		为了防止资源不足，需要采取一些办法来限制任何给定时刻处理的请求数目，
		尽可能减少创建和销毁线程的次数，
		特别是一些资源耗费比较大的线程的创建和销毁，尽量利用已有对象来进行服务。
		
		线程池主要用来解决线程生命周期开销问题和资源不足问题。
		通过对多个任务重复使用线程，线程创建的开销就被分摊到了多个任务上了，
		而且由于在请求到达时线程已经存在，所以消除了线程创建所带来的延迟。
		这样，就可以立即为请求服务，使用应用程序响应更快；另外，
		通过适当的调整线程中的线程数目可以防止出现资源不足的情况。（什么用）
	 */
	public static void main(String[] args) {
		//创建线程池对象  参数3，代表有3个线程的线程池
		ExecutorService service = Executors.newFixedThreadPool(3);
		//创建Runnable线程任务对象
		TaskRunnable task = new TaskRunnable();
		TaskRunnable2 task2 = new TaskRunnable2();
		//从线程池中获取线程对象
		service.submit(task);
		System.out.println("__________");
		service.submit(task2);
		service.shutdown();
		//service.submit(task2);
	}
}
