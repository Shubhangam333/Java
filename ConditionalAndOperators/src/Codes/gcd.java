package Codes;

import java.util.Scanner;

public class gcd {
    public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
    	  int dividend = scan.nextInt();
    	  int divisor = scan.nextInt();
    	  
    	  while(dividend%divisor !=0) {
    		  int rem = dividend%divisor;
    		  dividend=divisor;
    		  divisor=rem;
    	  }
    	  System.out.println(divisor);
    }
}
