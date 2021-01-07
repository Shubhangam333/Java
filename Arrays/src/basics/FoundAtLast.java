package basics;
import java.util.*;
public class FoundAtLast {
    public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				int[] arr = new int[n];
				for(int i=0;i<n;i++){
					arr[i]=s.nextInt();
				}
				int target=s.nextInt();
		int index=search(arr,n,target);
		System.out.println(index);	
    }
public static int search(int a[],int n,int key)
{
    for(int i=n-1;i>=0;i--){
        if (a[i]==key){
            return i;
        }
    
    search(a,n-1,key);
}
return -1;
}
}