package basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int res=fact(n);
		System.out.println(res);
	}
	public static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

}
