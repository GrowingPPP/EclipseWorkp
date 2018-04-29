package com.zgh.test;

import java.io.*;
import java.util.*;


public class Main {
	//01±≥∞¸Œ Ã‚
	public  static void func(int[] score,int[] time,int T){
		int[][] a = new int[score.length][T+1];
		int max = 0;
		
		
		for(int i = 0;i < score.length; i++){
			if(time[i] <= T){
				for(int j = time[i];j <= T;j++){
					a[i][j] = score[i];
				}
			}
		}
		
		
		for(int i = 0;i < score.length; i++){
			for(int j = 0;j <= T;j++){
				if(i > 0&& j-time[i] >= 0){
					a[i][j] = Math.max(a[i-1][j],a[i-1][j-time[i]]+score[i]);
				}
				if(a[i][j] > max){
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}
	
	public void func(){
		
	}
	public static void main(String args[]) {
		/**
		 5
		 5 4 3 5 2
		 5 4 6 3 1
		 10
		 */
		Scanner cin = new Scanner(System.in);
		int a  = cin.nextInt();
		if(a <= 0){
			System.out.println(0);
			return;
		}
//		System.out.println(a);
		int[] score = new int[a];
		int i = 0;
		int j = 0;
		int[] time = new int[a];
		int T = 0 ;
		while (cin.hasNextInt()) {
			score[i] = cin.nextInt();
			i++;
			if(i >= a)
				break;
		}
		while (cin.hasNextInt()){
			time[j] = cin.nextInt();
			j++;
			if(j >= a)
				break;
		}
		while (cin.hasNextInt()){
			T = cin.nextInt();
			break;
		}
		cin.close();
		if(T <= 0){
			System.out.println(0);
			return;
		}
		
		func(score,time,T);
	}
}