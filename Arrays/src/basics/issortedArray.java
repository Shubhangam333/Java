package basics;
import java.util.*;
public class issortedArray {
	    public static void main(String args[]) {
	        // Your Code Here
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			if(isSorted(arr)){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
	    }
		public static boolean isSorted(int[] arr){
			for(int i=0;i<arr.length-1;i++){
				if(arr[i]>arr[i+1]){
					return false;
				}
			}
			return true;
		}
	}

