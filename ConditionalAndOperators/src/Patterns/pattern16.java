package Patterns;

//n=6

//1
//11
//111
//1001
//11111
//100001

import java.util.*;
public class pattern16 {
    public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();

        int row=1,nst=1;
		while(row<=n){
			if(row%2==0){
			  for(int cst=1;cst<=nst;cst++){
              if(row==1){
                  System.out.print("1");
                  break;
              }
			  if(cst==1||cst==nst){
				  System.out.print("1");
			  }else{
				  System.out.print("0");
			  }
		  }
		  }else{
			  for(int cstt=1;cstt<=nst;cstt++){
				  System.out.print("1");
			  }
		  }
		  nst++;
		  row++;
		  System.out.println();
			}
		}
    }

