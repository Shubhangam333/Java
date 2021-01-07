package RecursiveProblem;

import java.util.Scanner;

//Take as input N, a number. Print odd numbers in decreasing sequence 
//(up until 0) and even numbers in increasing sequence (up until N) using Recursion
//Input
//5
//Output
//5
//3
//1
//2
//4
public class OddEvenUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		oddEven(n);
    }
	public static void oddEven(int n){
		if(n==0){
			return;
		}
		if(n%2!=0){
			System.out.println(n);
			oddEven(n-1);
		}
		if(n%2==0){
			oddEven(n-1);
			System.out.println(n);
		}
	}

}
