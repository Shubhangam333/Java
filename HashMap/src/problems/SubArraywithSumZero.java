package problems;

import java.util.HashMap;

public class SubArraywithSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,-5,-8,9,-1};
		System.out.println(subArraywithZero(arr));
	}

	private static boolean subArraywithZero(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer,Boolean> map = new HashMap<>();
		int presum=0;
		for(int i=0;i<arr.length;i++) {
			presum+=arr[i];
			if(presum == 0 ||map.containsKey(presum)) {
				return true;
			}else {
				map.put(presum, true);
			}
		}
		return false;
	}
	

}
