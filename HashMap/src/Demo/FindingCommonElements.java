package Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindingCommonElements {
	public static void main(String args[]) {
		int[] ar1= {5,1,4,7,3};
		int[] ar2 = {2,4,3,5,7,10,15};
		HashMap<Integer,Boolean> map=new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<ar1.length;i++) {
			if(!map.containsKey(ar1[i])) {
				map.put(ar1[i],false);
			}
		}
		for(int i=0;i<ar2.length;i++) {
			if(map.containsKey(ar2[i])) {
				map.put(ar2[i],true);
			}
		}
	  Set<Map.Entry<Integer,Boolean>> entries = map.entrySet();
	  for(Entry<Integer, Boolean> entry:entries) {
		  if(entry.getValue()==true){
			  list.add(entry.getKey());
		  }
	  }
	  for(int i=0;i<list.size();i++) {
		  System.out.println(list.get(i));
	  }
	}
}
