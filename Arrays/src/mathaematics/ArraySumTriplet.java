package mathaematics;

import java.util.Scanner;
import java. util. Arrays;
public class ArraySumTriplet {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int []arr= new int[n];
		for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
		}
		int data=s.nextInt();
		Arrays. sort(arr);
		int sum=0;

		for (int i=0;i<n;i++){
		int left=i+1,right= n-1 ;
		while(left<right){
		sum=arr[i]+arr[left]+arr[right];
		if (sum==data){
			System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]) ;
		left++;
		right--;
		}
		if (sum>data){
			right--;
		}
		if (sum<data){
			left++;
		}
		}
		}
	}
}
