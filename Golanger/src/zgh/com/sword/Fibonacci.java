package zgh.com.sword;

import java.util.Scanner;

public class Fibonacci {

	public int FibonacciReturn(int n) {
		    if(n == 0){
			    return 0;
		    }
		    if(n == 1 || n == 2){
			    return 1;
		    }
		    int a =  0;
		    int b = 1;
		    int res = 0;
		    for(int  i = 2; i<= n;i++){
			    res = a + b;
			    a = b;
			    b = res;
		    }
		    return res;
	    }
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		Fibonacci f = new Fibonacci();
		System.out.println(f.FibonacciReturn(n));
	}

}
