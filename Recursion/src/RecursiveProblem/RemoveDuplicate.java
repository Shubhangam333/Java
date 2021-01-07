package RecursiveProblem;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
String str = s.nextLine();
charFormat(str);
}
public static void charFormat(String str){


    if(str.length() == 1){
		System.out.println(str);
		return;
	}
	
	
   if(str.charAt(0) == str.charAt(1)){
	   
	   System.out.print(str.substring(0,1));
       charFormat(str.substring(2));
	   
   }else{
	    System.out.print(str.substring(0,1) );
	   charFormat(str.substring(1));
   }
	}

}
