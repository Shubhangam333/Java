import java.util.Scanner;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printChar(str);
	}
	public static void printChar(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}

}
