package PrintRecursion;

import java.util.Scanner;

public class PrintSubsequences {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		printSS(str," ");
}
	public static void printSS(String str,String result) {
		if(str.length()==0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		 String ros = str.substring(1);
		printSS(ros,result);
		printSS(ros,result+cc);
	}
}
