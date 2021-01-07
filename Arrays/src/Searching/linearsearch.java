package Searching;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     int n =scan.nextInt();
     int [] arr = new int[n];
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=scan.nextInt();
     }
     int num =scan.nextInt();
     int index=0;
     for(int j=0;j<arr.length;j++) {
    	 if(arr[j]==num) {
    		 index=j;
    		 System.out.println("Element is found at "+index);
    		 break;
    	 }
     }
	}

}
