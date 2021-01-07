package basic;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int res=pow(x,n);
		System.out.println(res);
	}

	private static int pow(int x, int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 1;
		}
		return x*pow(x,n-1);
	}

}
