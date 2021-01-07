package basics;

import java.util.Scanner;

public class anybasetodecimal {

	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int snum=scan.nextInt();
		int sb=scan.nextInt();
		
		int res=anybaseToDecimal(snum,sb);
		System.out.println(res);
	}
	public static int anybaseToDecimal(int snum,int sb) {
		int multiplier =1;
		int ans=0;
		
		while(snum!=0) {
			int rem =snum%10;
			ans=ans+(rem*multiplier);
			multiplier = multiplier*sb;
			snum=snum/10;
		}
		return ans;
	}
}
