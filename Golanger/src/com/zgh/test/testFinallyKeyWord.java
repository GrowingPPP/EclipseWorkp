package com.zgh.test;

public class testFinallyKeyWord {
	public static int m(){
		int a;
		try {
			a = 1;
			System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			a = 2;
//			return a;
//			System.out.println(a);
		}
//		return 3;
		return a;
	}
	public static void main(String[] args) {
		int  a = testFinallyKeyWord.m();
		System.out.println(a);
	}

}
