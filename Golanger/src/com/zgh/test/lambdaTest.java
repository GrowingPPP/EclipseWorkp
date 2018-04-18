package com.zgh.test;

public class lambdaTest {

	public static void oldRunable(){
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("ÄäÃûÀà");
//			}
//		}).start();
		new Thread(() ->System.out.println("lambda")).start();
	}
	public static void main(String[] args) {
		lambdaTest.oldRunable();
	}
}
