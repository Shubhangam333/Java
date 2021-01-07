package basics;

import java.util.*;
public class fibosum {
    public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
	 int n = scan.nextInt();
	 int i=0;
		while(i<n){
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ans=0;
     while(a<=b){
		ans+=fibo(a);
		a++;
	 }
	 System.out.println(ans);
	 i++;
	}
   }
   public static int fibo(int n ){
	   if(n==0){
		   return 0;
	   }
	   if(n==1){
		   return 1;
	   }
	   return fibo(n-1)+fibo(n-2);
   }
}