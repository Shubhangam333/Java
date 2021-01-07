package basics;
import java.util.*;
public class ArrayContains {
	
	    public static void main(String args[]) {
			Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				int[] arr = new int[n];
				for(int i=0;i<n;i++){
					arr[i]=s.nextInt();
				}
				int target=s.nextInt();
					System.out.println(arrayContains(arr,n,target,0));
				
	    }
		public static boolean arrayContains(int arr[],int n ,int target,int index){
			if(n==index){
				return false;
			}
			if(arr[index]==target){
				return true;
			}
			return arrayContains(arr,n,target,index+1);
		}
	
}
