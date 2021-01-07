package Patterns;

import java.util.Scanner;

public class pattern4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int k=0;k<i;k++) {
        		System.out.print(" ");
        	}
        	for(int j=n-i+1;j>=1;j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}
}
