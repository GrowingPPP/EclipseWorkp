package com.zgh.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/**
		 * true
			true
			false

		 */
		String str1 = "s";
		String str2 = "s";
		System.out.println(str1 == str2);
		
		Integer int1 = 0;
		Integer int2 =0;
		System.out.println(int1 == int2);
		//���Integer��ֵ���� -128--127���������ж�Ϊfalse
		
		String str3 = new String("s");
		String str4 = new String("s");
		System.out.println(str3== str4);
	}
}
