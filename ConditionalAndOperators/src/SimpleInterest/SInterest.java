package SimpleInterest;

import java.util.Scanner;

public class SInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int  principal = scan.nextInt();
		int rate = scan.nextInt();
		int time= scan.nextInt();
		
		int si = (principal*rate*time)/100;
		
		System.out.println("Simple Interest is" +si);
	}

}
