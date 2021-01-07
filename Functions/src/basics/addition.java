package basics;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      
      add(a,b);
	}
	private static void add(int x,int y) {
		System.out.println(x+y);
	}

}
