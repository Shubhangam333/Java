package Patterns;

import java.util.*;
public class pattern18 {
    public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
	 int n =scan.nextInt();
     int row=1;
     int nst=n-1,num=1,value;
	 while(row<=n){
		 value=1;
		for(int csm=1;csm<=num;csm++){
			System.out.print(value);
			value++;
		}
		for(int cst=1;cst<=nst;cst++){
			System.out.print("*");
		}
		System.out.println();
		nst--;
		num++;
		row++;
	 }
    }
}