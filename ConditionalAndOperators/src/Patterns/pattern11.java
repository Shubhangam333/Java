package Patterns;

import java.util.Scanner;

public class pattern11 {
   public static void main(String args[]) {
	   Scanner scan = new Scanner(System.in);
	         int n = scan.nextInt();
	         
	         int nr=2*n-1;
	         
	         int nsp=0;
	         int nst=n;
	         int row=1;
	         
	         while(row<=nr) {
	            for(int csp=1;csp<=nsp;csp++) {
	            	System.out.print(" ");
	            }
	            for(int cst=1;cst<=nst;cst++) {
	            	System.out.print("*");
	            }
	            
	            System.out.println();
	            if(row<=nr/2) {
	            	nst=nst-1;
	            	nsp=nsp+2;
	            }else {
	            	nsp=nsp-2;
	            	nst=nst+1;
	            }
	            row++;
	         }
   }
}
