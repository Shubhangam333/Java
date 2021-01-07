package oddeven;
import java.util.*;
public class Sumoddevendigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
  	  int n=scan.nextInt(); 
  	  int ans=0,i=1,sume=0,sumo=0;
  	  while(n !=0) {
  		  int rem = n%10;
  		  if(i%2==0){
				sume+=rem;  
			  }else{
				  sumo+=rem;
			  }
			  i++;
  		  n=n/10;
  	  }
		  System.out.println(sumo);
		  System.out.println(sume);
	}

}
