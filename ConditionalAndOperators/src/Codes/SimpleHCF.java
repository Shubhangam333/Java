package Codes;

import java.util.Scanner;

public class SimpleHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		System.out.println(findGCD(arr, n)); 
    }
	 static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
  
    // Function to find gcd of array of 
    // numbers 
    static int findGCD(int arr[], int n) 
    { 
        int result = 0; 
        for (int element: arr){ 
            result = gcd(result, element); 
  
            if(result == 1) 
            { 
               return 1; 
            } 
        } 
  
        return result;
	}

}
