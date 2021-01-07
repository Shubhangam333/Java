package basic;
//Popped out of stack
import java.util.Scanner;

public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		PD(n);
	}
	public static void PD(int n) {
		//Base Case
		if(n==0) {
			return;
		}
		PD(n-1);
		System.out.println(n);
	}

}
