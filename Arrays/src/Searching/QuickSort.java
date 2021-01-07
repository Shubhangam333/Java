package Searching;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		quickSort(arr,0,arr.length-1);
		for(int x=0;x<arr.length;x++) {
			System.out.println(arr[x]);
		}
	}

	private static void quickSort(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		if(lo>=hi) {
			return;
		}
		int mid=(lo+hi)/2;
		int pivot=arr[mid];
		
		int left=lo;
		int right=hi;
		while(left<=right) {
			while(arr[left]<pivot) {
				left++;
			}
			while(arr[right]>pivot) {
				right--;
			}
			if(left<=right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				
				left++;
				right--;
			}
		}
		
		quickSort(arr,lo,right);
		quickSort(arr,left,hi);
	}

}
