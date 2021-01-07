package basics;
//Take the following as input.
//
//A number (N1)
//A number (N2)
//Write a function which prints all armstrong numbers between N1 and N2 (inclusive).
import java.util.Scanner;

public class PrintArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			int N1 = s.nextInt();
			int N2 = s.nextInt();
			for(int i=N1;i<N2;i++){
				printArmStrong(i);
			}
	    }
		public static void printArmStrong(int number){
			   int originalNumber,originalNumber1, remainder, result = 0;
	        int count=0;
	        originalNumber = number;
			originalNumber1 = number;
			 while (originalNumber1 != 0)
	        {
	            remainder = originalNumber1 % 10;
	            count++;
	            originalNumber1 /= 10;
	        }

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, count);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number);
	}

}
