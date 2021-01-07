package RecursiveProblem;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		reverse(arr,0);
    }
	public static void reverse(int[]arr,int si){
		if(si==arr.length){
			return;
		}
		reverse(arr,si+1);
		System.out.print(arr[si]+" ");
	}

}
