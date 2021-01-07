package basics;
import java.util.*;
public class FoundAt {
	    public static void main(String args[]) {
			Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				int[] arr = new int[n];
				for(int i=0;i<n;i++){
					arr[i]=s.nextInt();
				}
				int target=s.nextInt();
				int ans = search(arr,n,target,0);
				System.out.println(ans);
	    }
		public static int search(int[]arr,int n,int target,int index){
			if(n==index){
				return -1;
			}
			if(arr[index]==target){
				return index;
			}
			return search(arr,n,target,index+1);
		}
	
}
