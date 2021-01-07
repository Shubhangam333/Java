package Patterns;

//5
//1
//2	2	
//3	0	3	
//4	0	0	4	
//5	0	0	0	5

import java.util.*;
public class pattern17 {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
	  int n = scan.nextInt();
      int row=1;
      int nst=1;
      int value;
	  while(row<=n){
		  value=row;
		  for(int cst=1;cst<=nst;cst++){
              if(value==1){
                  System.out.print("1");
                  break;
              }
			  if(cst==1||cst==nst){
				  System.out.print(value);
				  System.out.print("\t");
			  }else{
				  System.out.print("0");
				   System.out.print("\t");
			  }
		  }
		  System.out.println();
		  nst++;
          row++;
	  }
    }
}