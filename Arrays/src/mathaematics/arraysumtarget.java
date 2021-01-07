package mathaematics;

import java.util.*;
public class arraysumtarget {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
	  int n =scan.nextInt();
	  int[] arr = new int[n];
	  for(int i=0;i<arr.length;i++){
		  arr[i]=scan.nextInt();
	  }
	  int target=scan.nextInt();
	  findPair(arr,target);
    }
	public static void findPair(int arr[],int target){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==target){
					if(arr[i]<arr[j]){
						System.out.println(arr[i]+" and "+arr[j]);
					}else{
						System.out.println(arr[j]+" and "+arr[i]);
					}
				}
			}
		}
	} 
}
