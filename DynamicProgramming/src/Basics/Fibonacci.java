package Basics;

import java.util.Scanner;

public class Fibonacci {
	public static long start;
	public static long end;
	public static void startAlgo() {
		start=System.currentTimeMillis();
	}
	public static long endAlgo() {
		start=System.currentTimeMillis();
		return end-start;
	}
		public static void main(String args[]) {
			int n;
			Scanner s = new Scanner(System.in);
			n=s.nextInt();
			int []strg = new int[n+1];
			
			System.out.println(fib(n));
			System.out.println(fibRS(n,strg));
		}

		private static int fib(int n) {
			// TODO Auto-generated method stub
			if(n==0 || n==1) {
				return n;
			}
			return fib(n-1)+fib(n-2);
		}
		private static int fibRS(int n,int[]strg) {
			// TODO Auto-generated method stub
			if(n==0 || n==1) {
				return n;
			}
			if(strg[n]!=0) {
				return strg[n];
			}
			int fn= fibRS(n-1,strg)+fibRS(n-2,strg);
			strg[n]=fn;
			return strg[n];
		}
		public static int fibIS(int n) {
			int strg[]=new int[n+1];
			
			//seed
			strg[0]=0;
			strg[1]=1;
			
			for(int i=2;i<=n;i++) {
				strg[i]=strg[i-1]+strg[i-2];
			}
			return strg[n];
		}
}
