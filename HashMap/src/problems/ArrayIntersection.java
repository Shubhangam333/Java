package problems;
import java.util.*;
public class ArrayIntersection {
	

	public static void main(String args[]) {
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scn.nextInt();
			}
			HashMap<Integer, Integer> map = new HashMap<>();
			while (n-- > 0) {
				int item = scn.nextInt();
				if (map.containsKey(item)) {
					map.put(item, map.get(item) + 1);
				} else {
					
					map.put(item, 1);
				}
			}
			ArrayList<Integer> ans = new ArrayList<>();
			for (int val : array) {
				if(map.containsKey(val))
				{
					int freq = map.get(val);
					
					freq = freq - 1;
					map.put(val, freq);
					ans.add(val);
					if(map.get(val)<=0)
						map.remove(val);
				}
			}
			Collections.sort(ans);
			System.out.print(ans);
}
}