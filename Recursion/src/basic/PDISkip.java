package basic;

import java.util.Scanner;

public class PDISkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		PDISkip(n);
	}
	public static void PDISkip(int n) {
		//Base Case
		if(n==0) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
		}
		PDISkip(n-1);
		if(n%2==0) {
		System.out.println(n);
		}
	}

}
