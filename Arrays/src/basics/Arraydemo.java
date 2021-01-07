package basics;

import java.util.Scanner;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       
       int[] arr=new int[n];
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=scan.nextInt();
       }
      for(int val:arr) {
    	  System.out.println(val);
      }
   }

}
