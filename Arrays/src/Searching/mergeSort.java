package Searching;

import java.util.Scanner;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int ans[]=mergeSort(arr,0,arr.length-1);
		for(int x=0;x<ans.length;x++) {
			System.out.println(ans[x]);
		}
	}
	public static int[] mergeSort(int[]arr,int s ,int l) {
		if(s==l) {
			int[]base = new int[1];
			base[0]=arr[s];
			return base;
		}
		int mid = (s+l)/2;
		int fh[]=mergeSort(arr,s,mid);
		int sh[]=mergeSort(arr,mid+1,l);
		int merge[] = mergeArray(fh,sh);
		return merge;
	}
	public static int[] mergeArray(int fh[] ,int sh[]) {
		int[]arr = new int[fh.length+sh.length];
		int i=0,j=0,k=0;
		while(i<fh.length && j<sh.length) {
			if(fh[i]>=sh[j]) {
				arr[k]=sh[j];
				k++;
				j++;
			}
			else{
				arr[k]=fh[i];
				k++;
				i++;
			}
		}
		if(i!=fh.length) {
			while(i<fh.length) {
				arr[k]=fh[i];
				i++;
				k++;
			}
		}
		if(j!=sh.length) {
			while(j<sh.length) {
				arr[k]=sh[j];
				j++;
				k++;
			}
		}
		return arr;
	}
}
