package Mathaematics;
import java.util.*;
public class prateeklovesCandy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a[]=new int[t];
		for (int i = 0; i < t; i++) {
		a[i] = s.nextInt();

			}
			//it is mentioned in the ques that ans can be of the order of 10^6 so we have to create an array of 10^6 only
			boolean p[] = new boolean[1000000];
			for (int i = 0; i < p.length; i++) {
				p[i] = true;

			}
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 2; i * i < 1000000; i++) {

				if (p[i] == true) {
					for (int j = i * i; j < 1000000; j += i) {

						p[j] = false;
						
						
					}

				}
				
			}
			for(int k =2;k<1000000;k++){
				if(p[k]==true) {
					list.add(k);
				}
			}
			for(int i=0;i<t;i++)
			{
				System.out.println(list.get(a[i]-1));//here it shouldnt be i
			}
	}
}
