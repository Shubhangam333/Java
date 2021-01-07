package Patterns;

//N=5

//5                   5 
//5 4               4 5 
//5 4 3           3 4 5 
//5 4 3 2       2 3 4 5 
//5 4 3 2 1   1 2 3 4 5 
//5 4 3 2 1 0 1 2 3 4 5 
//5 4 3 2 1   1 2 3 4 5 
//5 4 3 2       2 3 4 5 
//5 4 3           3 4 5 
//5 4               4 5 
//5                   5 

import java.util.*;
public class pattern19 {
    public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
	 int n =scan.nextInt();
	 int nsp=(2*n)-1;
	 int nst=1;
	 int value=0;
	 int row=1;
	 int nr=(2*n)+1;
	 while(row<=nr){
		 value=n;
		 for(int cst=1;cst<=nst;cst++){
          System.out.print(value-- + " ");
		 }
		 value++;
		 for(int csp=1;csp<=nsp;csp++){
          System.out.print("  ");
		 }
		 if(row==n+1){
          for(int cst=1;cst<nst;cst++){
          	System.out.print(++value + " ");
		  }
		 }else{
		  for(int cst=1;cst<=nst;cst++){
          	System.out.print(value++ + " ");
		  }
		 }
	 if(row<(nr+1)/2){
		nsp=nsp-2;
		nst=nst+1;
		row++;
	 }else{
		 nsp=nsp+2;
		 nst=nst-1;
		 row++;
	 }
		System.out.println();
	 }
    }
}
