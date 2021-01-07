package Patterns;

import java.util.*;
public class pattern15 {
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
				  System.out.print(value-1);
			  }else{
				  System.out.print("0");
			  }
		  }
		  System.out.println();
		  nst++;
          row++;
	  }
    }
}
