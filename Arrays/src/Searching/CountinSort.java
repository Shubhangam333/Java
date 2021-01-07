package Searching;

import java.util.Scanner;

public class CountinSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<arr.length;i++){
				arr[i]=s.nextInt();
			}
			int k = findMax(arr);
			int ans[]=CountSort(arr,arr.length,k);
			for(int x=0;x<ans.length;x++){
				System.out.print(ans[x]+" ");
			}
	    }
		public static int findMax(int arr[]){
				int max=0;
				for(int i=0;i<arr.length;i++){
					if(arr[i]>max){
						max=arr[i];
					}
				}
				return max;
		}
		public static int[] CountSort(int[]arr,int n,int k){
			int count[] = new int[k+1];
			int output[]=new int[n];
			for(int i=0;i<n;i++){
				++count[arr[i]];
			}
			for (int i=1; i<=k; ++i) {
	            count[i] += count[i-1];
		}
			for(int j=n-1;j>=0;j--){
				output[count[arr[j]]-1]=arr[j];
				--count[arr[j]]; 
			}
			return output;		 
	}

}
