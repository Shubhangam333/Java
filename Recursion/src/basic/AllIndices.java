package basic;

import java.util.Scanner;

public class AllIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int data=s.nextInt();
	  int[]res=AllIndices(arr,0,data,0);
	  for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
	}

	private static int[] AllIndices(int[] arr, int si, int data, int count) {
		// TODO Auto-generated method stub
	  if(si==arr.length) {
		  int[] base= new int[count];
		  return base;
	  }
	  int[] indices=null;
	  if(arr[si]==data) {
		  indices=AllIndices(arr,si+1,data,count+1);
	  }else {
		  indices=AllIndices(arr,si+1,data,count);
	  }
	  if(arr[si]==data) {
		  indices[count]=si;
	  }
	  return indices;
	}

}
