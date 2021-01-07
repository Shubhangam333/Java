package Mathaematics;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0){
			int n =s.nextInt();
			System.out.println(CountSetBit(n));
			t--;
		}
    }
	public static int CountSetBit(int n){
		 int temp=0,base=1,binary=0;
	 while(n!=0){
		temp=n%2;
        binary+=temp*base;
		base=base*10;
		n=n/2;
	 }
	 int count=0;
	  while(binary!=0){
		temp=binary%10;
        if(temp==1){
		count++;
		}
		binary=binary/10;
	 }
	 return count;
	}

}
