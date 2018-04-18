package com.zgh.test;

import java.util.Scanner;

public class Main1 {
	
	public static void func(int K , int A_l , int A_m ,int B_l ,int B_m){
		int count = 0;
		for(int i = 0;i <= A_m;i++){
			for(int j = B_m;j >=1 ;j-- )

				if((i == 0&&K % (B_l*j) == 0) || (j ==0&&(K % i*A_l) ==0)){
					count += sum(A_m,i,B_m,j);
				}else if((K - i*A_l)%(B_l*j)==0){
					count += sum(A_m,i,B_m,j);
				}
		}
		
		System.out.println(count);
	}
	private static int sum(int a_m, int i, int b_m, int j) {
		int xuanzeA = xuanze(a_m,i);
		int xuanzeB = xuanze(b_m,j);
		return xuanzeA*xuanzeB;
		
	}
	
	

	private static int xuanze(int n, int m) {
		return (n >= m) ? sss(n) /sss(n-m)/sss(m) :0;

	}
	private static int sss(int n) {
		return (n > 1)? n*sss(n-1):1;
	}

	
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int A_l = sc.nextInt();
	        int A_m = sc.nextInt();
	        int B_l = sc.nextInt();
	        int B_m = sc.nextInt();
	        
	        
	        
	        
	        Main1.func(n,A_l,A_m,B_l,B_m);
	}

}
