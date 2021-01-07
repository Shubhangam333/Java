package basic;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(compress(input));
	}
		public static String compress(String inputString) {
		// Write your code here
        String temp="";
       int n = inputString.length(); 
        for (int i = 0; i < n; i++) { 
  
            // Count occurrences of current character 
            int count = 1; 
            while (i < n-1 &&  
                   inputString.charAt(i) == inputString.charAt(i + 1)) { 
                count++; 
                i++; 
            } 
  
            // Print character and its count 
            if(count!=1)
            {temp+=inputString.substring(i,i+1)+count;
            } 
            else
            {
              temp+=inputString.substring(i,i+1);
            }    
            
	}
        return temp; 
	}

}
