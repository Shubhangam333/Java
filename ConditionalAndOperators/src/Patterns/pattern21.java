package Patterns;

//5
//5 4 3 2 1 0 1 2 3 4 5 
//  4 3 2 1 0 1 2 3 4 
//    3 2 1 0 1 2 3 
//      2 1 0 1 2 
//        1 0 1 
//          0 
//        1 0 1 
//      2 1 0 1 2 
//    3 2 1 0 1 2 3 
//  4 3 2 1 0 1 2 3 4 
//5 4 3 2 1 0 1 2 3 4 5 

import java.util.*;
public class pattern21 {
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int nr=(2*n)+1;
		int nst=nr,row=1,nsp=0;
		int value=0;
		while(row<=nr){
          if(row<=(nr+1)/2){
			  value=n+1-row;
		  }else{
			  value=row-n-1;
		  }
		  for(int csp=1;csp<=nsp;csp++){
			  System.out.print("  ");
		  }
		  for(int cst=1;cst<=nst;cst++){
			  if(cst<(nst+1)/2)
			  System.out.print(value-- +" ");
			  else
			  System.out.print(value++ + " ");
		  }
		  if(row<(nr+1)/2){
			  nst=nst-2;
			  nsp=nsp+1;
		  }else{
			  nst=nst+2;
			  nsp=nsp-1;
		  }
		  System.out.println();
		  row++;
		}
    }
}