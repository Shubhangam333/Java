package Patterns;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=0;j<i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
