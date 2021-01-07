package Mathaematics;


//Given a non negative integer A, print all the pairs of integers(a,b) such that
//
//a and b are positive integers
//
//a<=b and
//
//a^2 + b^2 = A
//
//0 <= A

import java.util.*;
public class PythagoreanChallenge {
	
	    public static void main (String args[]) {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			while(n>0){
				int A = scan.nextInt();
				printpair(A);
				n--;
			}
	    }
		public static void printpair(int A){
			for(int i=0;i<=A;i++){
				for(int j=0;j<=A;j++){
					if(i*i+j*j==A){
						if(i<=j){
						System.out.print("("+i+","+j+")"+" ");
					}
					}
				}
			}
			System.out.println();
		}
	}

