package Searching;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
		     int n =scan.nextInt();
		     int [] arr = new int[n];
		     for(int i=0;i<arr.length;i++) {
		    	 arr[i]=scan.nextInt();
		     }
		     int num =scan.nextInt();
		     
		     int index=binarySearch(arr,num);
		     System.out.println("Element is found at"+index);
	}

	private static int binarySearch(int[] arr, int num) {
		// TODO Auto-generated method stub
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]<num) {
				start=mid+1;
			}else if(arr[mid]>num) {
				end=mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	

}
