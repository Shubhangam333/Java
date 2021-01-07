package Mathaematics;

import java.util.Scanner;

public class Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
  	  int n=scan.nextInt(); 
  	  int ans=scan.nextInt();
		  int count=0;
  	  while(n !=0) {
  		  int rem = n%10;
  		  if(rem==ans){
				  count++;
			  }
  		  n=n/10;
  	  }
  	  System.out.println(count);
	}

}
