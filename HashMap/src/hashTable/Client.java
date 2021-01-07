package hashTable;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashTable<String,Integer> map = new HashTable<>(5);
		map.put("USA", 100);
		map.put("India", 100);
		map.put("China", 100);
		map.put("Sweden", 100);
		map.display();
	}

}
