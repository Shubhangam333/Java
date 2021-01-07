package PrintRecursion;

import java.util.Scanner;

public class Printpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		printPermut(str," ");
}
	public static void printPermut(String str,String result) {
		if(str.length()==0) {
			System.out.println(result);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			String ros=str.substring(0,i)+str.substring(i+1);
			printPermut(ros,result+ch);
		}
	}

}
