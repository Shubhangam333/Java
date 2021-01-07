package basic;

import java.util.Scanner;

public class IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
	  System.out.println(isSorted(arr,0));
	}
	public static boolean isSorted(int arr[],int si) {
	   if(si==arr.length-1) {
		   return true;
	   }
	   if(arr[si]>arr[si+1]) {
		   return false;
	   }else {
		   boolean ans= isSorted(arr,si+1);
		   return ans;
	   }
	}
}
