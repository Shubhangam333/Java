package basic;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		bubbleSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void bubbleSort(int[] arr, int si, int li) {
		// TODO Auto-generated method stub
		if(li==0) {
			return;
		}
		if(si==li) {
			bubbleSort(arr,0,li-1);
			return;
		}
		if(arr[si]>arr[si+1]) {
			int temp=arr[si];
			arr[si]=arr[si+1];
			arr[si+1]=temp;
		}
		bubbleSort(arr,si+1,li);
	}

}
