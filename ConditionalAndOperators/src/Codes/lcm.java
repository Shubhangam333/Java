package Codes;

import java.util.*;
public class lcm {
    public static void main(String args[]) {
          	Scanner scan = new Scanner(System.in);
    	  int a = scan.nextInt();
    	  int b = scan.nextInt();
    	  int dividend=a;
		  int divisor=b;
    	  while(dividend%divisor !=0) {
    		  int rem = dividend%divisor;
    		  dividend=divisor;
    		  divisor=rem;
    	  }
		  int lcm=((a*b)/divisor);
    	  System.out.println(lcm);
    }
}