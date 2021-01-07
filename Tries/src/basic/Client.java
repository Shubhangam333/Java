package basic;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries tt = new Tries();
		tt.addWords("art");
		tt.addWords("arts");
		tt.addWords("bug");
		tt.addWords("boy");
		tt.addWords("see");
		tt.addWords("seen");
		tt.addWords("amit");
		
		tt.display();
		
		System.out.println(tt.search("amit"));
		System.out.println(tt.search("artsi"));
		System.out.println(tt.search("arts"));
		System.out.println(tt.search("seen"));
		System.out.println("********************");
		tt.remove("arts");
		tt.display();
		tt.remove("art");
		System.out.println("********************");
		tt.display();
	}

}
