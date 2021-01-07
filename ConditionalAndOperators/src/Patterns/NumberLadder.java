package Patterns;
//5
//1	
//2	3	
//4	5	6	
//7	8	9	10	
//11	12	13	14	15	

import java.util.Scanner;

public class NumberLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int row=1,value=1,nst=1;
		while(row<=n){
			for(int cst=1;cst<=nst;cst++){
				System.out.print(value++ + "\t");
			}
			nst++;
			System.out.println();
			row++;
		}
	}

}
