package Demo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		map.put("USA",100);
		map.put("UK",200);
		map.put("India",300);
		map.put("Sweden",500);
		System.out.println(map);
		map.put("India",325);
		System.out.println(map);
		
		System.out.println(map.get("USA"));
		System.out.println(map.get("RSA"));
		System.out.println(map.remove("USA"));
		System.out.println(map);
		System.out.println(map.containsKey("India"));
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(key);
		}
		Collection<Integer> values = map.values();
		for(Integer value:values) {
			System.out.println(value);
		}
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry:entries) {
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}

	}

}
