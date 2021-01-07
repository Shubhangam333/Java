package basics;

import java.util.Scanner;

public class LowerUpperBound {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int q=s.nextInt();
		for(int j=0;j<q;j++){
		int data=s.nextInt();	
		int l=lowerBound(arr,data);
		int h=higherBound(arr,data);
		System.out.println(l+" "+h);
		}
    }
	private static int higherBound(int[] arr, int data) {
		// TODO Auto-generated method stub
		int low =0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(data==arr[mid]) {
				ans=mid;
				low=mid+1;
			}else if(data>arr[mid]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return ans;
	}

	private static int lowerBound(int[] arr, int data) {
		// TODO Auto-generated method stub
		int low =0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(data==arr[mid]) {
				ans=mid;
				high=mid-1;
			}else if(data<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return ans;
	}

}
