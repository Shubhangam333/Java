package basic;

import java.util.Scanner;

public class FirstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int data=s.nextInt();
	  System.out.println(firstIndex(arr,0,data));
	}

	private static int firstIndex(int[] arr, int si, int data) {
		// TODO Auto-generated method stub
		if(si==arr.length) {
			return -1;
		}
		if(arr[si]==data) {
			return si;
		}else {
			return firstIndex(arr,si+1,data);
		}
	}

}
