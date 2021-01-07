package oddeven;

public class Oddeven {
	
	public static void main(String args[]) {
		int arr[]= {0,2,3,5,8,7,6,9};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even:"+arr[i]);
			}else {
				System.out.println("Odd:"+arr[i]);
			}
		}
	}

}
