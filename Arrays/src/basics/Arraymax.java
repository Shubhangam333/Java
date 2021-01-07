package basics;

import java.util.Scanner;

public class Arraymax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
	       int n = scan.nextInt();
	       
	       int[] arr=new int[n];
	       for(int i=0;i<arr.length;i++) {
	    	   arr[i]=scan.nextInt();
	       }
	       int max=Integer.MIN_VALUE;
	       for(int i=0;i<arr.length;i++) {
	    	   if(max<arr[i]) {
	    		   max=arr[i];
	    	   }
	       }
	       System.out.println(max);
	}

}
