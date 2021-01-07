package Searching;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,1,6,3,9,8};
		bubbleSort(arr);	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp=0;
	  for(int i=0;i<arr.length-1;i++) {
		 for(int j=0;j<arr.length-i-1;j++) {
			 if(arr[j]>arr[j+1]) {
				 temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		 }
	  }
	}

}
