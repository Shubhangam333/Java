package Mathaematics;

import java.util.*;
public class prime {
    public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
        int temp=0;
	for(int i=2;i<n;i++){
		if(n%i==0){
			temp=1;
			break;
		}
	}	
	if(temp==0){
		System.out.println("Prime");
	}else{
		System.out.println("Not Prime");
	}
    }
}
