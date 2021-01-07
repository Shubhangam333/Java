package Patterns;
//
//5
//    * 
//  * * * 
//* * * * * 
//  * * * 
//    * 

import java.util.Scanner;

public class Printpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1,nst=1,nsp=(n-1)/2;
		while(row<=n){
			for(int csp=1;csp<=nsp;csp++){
				System.out.print("  ");
			}
			for(int cst=1;cst<=nst;cst++){
				System.out.print("*"+" ");
			}
			if(row<(n+1)/2){
				nst=nst+2;
				nsp=nsp-1;
			}else{
				nsp=nsp+1;
				nst=nst-2;
			}
			row++;
			System.out.println();
		}
	}

}
