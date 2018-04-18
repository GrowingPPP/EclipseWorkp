package com.zgh.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void func(long num){
	    
	    long[] data = new long[4];	
	    data[0] = num/1000;
	    data[1] = (num-data[0]*1000)/100;
	    data[2] = (num - data[0]*1000-data[1]*100)/10;
	    data[3] = (num - data[0]*1000-data[1]*100-data[2]*10);
	    
	    for(int i = 0;i < 4;i++){
		    data[i] = (data[i]+5)%10;
	    }
	    long tmp = data[0];
	    data[0] = data[3];
	    data[3] = tmp;
	    
	    tmp = data[2];
	    data[2] = data[1];
	    data[1] = tmp;
	    
	    System.out.println(data[0]*1000+data[1]*100+data[2]*10+data[3]);
    }

public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        Main.func(num);
    }
}