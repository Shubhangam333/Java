package basic;
//Pushed on Stack

import java.util.Scanner;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		PD(n);
	}
	public static void PD(int n) {
		//Base Case
		if(n==0) {
			return;
		}
		System.out.println(n);
		PD(n-1);
	}
}
