package Searching;
import java.util.*;
public class Sortbinary {
	 public static void main(String args[]) {
			Scanner s = new Scanner(System.in);
			int n =s.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++){
				arr[i]=s.nextInt();
			}
			sortBinaryArray(arr);
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
	    }
		public static void sortBinaryArray(int[] arr){
			/* Your class should be named SortBinaryArray.
			 * Don't write main().
	     		 * Don't read input, it is passed as function argument.
	     		 * Update in the given array itself. Don't return or print anything.
	     		 * Taking input and printing output is handled automatically.
	                 */
	            int left=0,right=arr.length-1;
	          
	    while (left < right)  
	    {  
	        /* Increment left index while we see 0 at left */
	        while (arr[left] == 0 && left < right)  
	            left++;  
	  
	        /* Decrement right index while we see 1 at right */
	        while (arr[right] == 1 && left < right)  
	            right--;  
	  
	        /* If left is smaller than right then there is a 1 at left  
	        and a 0 at right. Exchange arr[left] and arr[right]*/
	        if (left < right)  
	        {  
	            arr[left] = 0;  
	            arr[right] = 1;  
	            left++;  
	            right--;  
	        }  
	    }
	}
}
