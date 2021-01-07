package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HighestFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int max= 0 ;
		HashMap<Integer, Integer> map = new HashMap<>();
			while (n-- > 0) {
				int item = s.nextInt();
				if (map.containsKey(item)) {
					map.put(item, map.get(item) + 1);
				} else {
					
					map.put(item, 1);
				}
			}
			int max_freq=0;
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		for(Map.Entry<Integer, Integer> entry:entries) {
			if(entry.getValue()>max){
			max=entry.getValue();
			max_freq=entry.getKey();
			}
		}
		System.out.println(max_freq);
	}

}
