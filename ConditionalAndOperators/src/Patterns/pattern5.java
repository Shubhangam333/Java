package Patterns;

import java.util.Scanner;

public class pattern5 {
       public static void main(String args[]) {
    	   Scanner scan = new Scanner(System.in);
    	   int n= scan.nextInt();
    	   int nr= 2*n-1;
    	   int row=1;
    	   int nst=1;
    	   while(row<=nr) {
    		   int cst=1;
    		   while(cst<=nst) {
    			   System.out.print("*");
    			   cst++;
    		   }
    		  System.out.println();
    		  row++;
    		  if(row<=nr/2) {
    			  nst++;
    		  }else {
    			  nst--;
    		  }
    	   }
       }
}
