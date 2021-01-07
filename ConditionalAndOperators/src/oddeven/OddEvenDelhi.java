package oddeven;

import java.util.Scanner;
//Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. 
//The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even 
//is divisible by 4 or sum of digits which are odd in that number is divisible by 3.
//However to check every car for the above criteria can't be done by the Delhi Police. 
//You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?
//Sample Input
//
//2
//12345
//12134
//
//Sample Output
//
//Yes
//No


public class OddEvenDelhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
  		int n = scan.nextInt();

		  for(int i=0;i<n;i++){
			  int num = scan.nextInt();
              int temp=0,sume=0,sumo=0;
			  while(num!=0){
				  temp=num%10;
				  if(temp%2==0){
					  sume=sume+temp;
				  }else{
					  sumo=sumo+temp;
				  }
				  num=num/10;
			  }
			  if(sume%4==0 || sumo%3==0){
				  System.out.println("Yes");
			  }else{
				  System.out.println("No");
			  }
		  }
	}

}
