package basic;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
			int n = s.nextInt();
		print(n,1,1);
	}

	private static void print(int n, int row, int col) {
		// TODO Auto-generated method stub
		if(row>n) {
			return;
		}
		if(col>row) {
			System.out.println();
			print(n,row+1,1);
			return;
		}
		System.out.print("*");
		print(n,row,col+1);
	}

}
