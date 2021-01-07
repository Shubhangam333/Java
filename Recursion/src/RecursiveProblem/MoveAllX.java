package RecursiveProblem;

import java.util.Scanner;

public class MoveAllX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s= new Scanner(System.in);
					String str = s.nextLine();
					System.out.println(MoveAllX(str,0));
		    }
			public static String MoveAllX(String str,int count){
				if(str.length()==0){
					String base="";
					for(int i=0;i<count;i++){
						base+="x";
					}
					return base;
				}
				String ans="";
				char cc = str.charAt(0);
				if(cc=='x'){
					count++;
			   ans=MoveAllX(str.substring(1),count);
				}else{
				ans=cc+MoveAllX(str.substring(1),count);
				}
				return ans;		
	}

}
