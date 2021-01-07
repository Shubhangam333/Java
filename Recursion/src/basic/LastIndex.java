package basic;

import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int data=s.nextInt();
	  System.out.println(LastIndex(arr,arr.length-1,data));
	}

	private static int LastIndex(int[] arr, int si, int data) {
		// TODO Auto-generated method stub
		if(si==-1) {
			return -1;
		}
		if(arr[si]==data) {
			return si;
		}else {
			return LastIndex(arr,si-1,data);
		}
	}

}
