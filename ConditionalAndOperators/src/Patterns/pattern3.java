package Patterns;

import java.util.Scanner;

public class pattern3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
        for(int i=n;i>0;i--) {
        	for(int j=i;j>0;j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	
	}
}
