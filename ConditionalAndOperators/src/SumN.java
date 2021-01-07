import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       int n= scan.nextInt();
		int counter = 1;
		int sum=0;
		while(counter<=n) {
			sum+=counter;
			counter++;
		}
		System.out.println(sum);
	}

}
