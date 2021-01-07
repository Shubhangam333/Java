package Patterns;

import java.util.Scanner;

public class pattern10 {
 public static void main(String args[]){
	 Scanner scan = new Scanner(System.in);
	 int n= scan.nextInt();
	 int nr=2*n-1;
	 int row = 1;
	 int nst= 1;
	 int val=0;
	 while(row<=nr) {
		 int cst =1;
		 val=row;
		 while(cst<=nst) {
			 if(cst%2==0) {
				 System.out.print("*");
			 }else {
				 System.out.print(val);
			 }
			 cst++;
			 
		 }
		 if(row<=nr/2) {
			 nst=nst+2;
		 }else {
			 nst=nst-2;
		 }
		 row++;
		 System.out.println(" ");
	 }
 }
}
