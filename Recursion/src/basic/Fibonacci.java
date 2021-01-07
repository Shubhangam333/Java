package basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int res=fibo(n);
		System.out.println(res);
	}

	private static int fibo(int n) {
		// TODO Auto-generated method stub
		if(n==1 || n==0) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

}
