package oddeven;

import java.util.*;
public class evenodddivisors {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
	  int q = scan.nextInt();
	  int i=0;
	  int sumo,sume,j,res=0;
      while(i<q){
		  sumo=0;
		  sume=0;
		 int n = scan.nextInt();
		  for(j=1;j<=n;j++){
                    if(n%j==0){
                      if(j%2==0){
                        sume+=j;
					  }else{
						sumo+=j;
					  }
			}
			}
			res=sume-sumo;
			System.out.println(res);
	  }
	}
}