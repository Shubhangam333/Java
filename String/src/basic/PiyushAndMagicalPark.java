package basic;

import java.util.Scanner;

public class PiyushAndMagicalPark {
	   static Scanner sc = new Scanner(System.in);
	    static int N = sc.nextInt();
	    static int M = sc.nextInt();
	    static int K = sc.nextInt();
	    static int S = sc.nextInt();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[][] arr = takeInput();
		TravelRowWise(arr);
}
public static char[][] takeInput() {

char[][] arr = new char[N][M];
for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
        arr[i][j] = sc.next().charAt(0);
    }
}
return arr;
}

public static void TravelRowWise(char[][] arr) {
boolean flag = false;
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        if (S < K) {
            flag = true;
            break;
        }
        if (arr[i][j] == '.') {
            S = S - 2;
        } else if (arr[i][j] == '*') {
            S = S + 5;
        } else {
            break;
        }

        if(j != arr[0].length - 1){
            S--;
        }

    }
}
if (flag == false) {
    System.out.println("Yes");
    System.out.println(S);
} else {
    System.out.println("No");
}
	}

}
