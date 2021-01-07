package Mathaematics;
import java.util.*;

public class basiccalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		while(true) {
			
			
			
			char s = scn.next().charAt(0);
			if (s=='+') {
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				System.out.println(n1+n2);
				
			}else if (s=='-') {
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				System.out.println(n1-n2);
				
			}else if(s=='*') {
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				System.out.println(n1*n2);
				
			}else if (s=='/') {
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				System.out.println((int)((float)n1/(float)n2));
				
			}else if (s=='%') {
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				System.out.println(n1%n2);
				
			}else if (s=='X' || s=='x') {
				System.exit(0);
			}else {
				System.out.println("Invalid operation. Try again.");
				
				
				
			}
			
			
		}
	}
}