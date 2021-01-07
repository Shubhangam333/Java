package Codes;

import java.util.Scanner;

public class FactoSum {
	static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {

	int n = sc.nextInt();
	int sum = TakingInput(n);
	int ans = sum % 107;
	System.out.println(ans);

}

public static int Factorial(int num) {
	int fact = 1;
	for (int i = 1; i <= num; i++) {
		fact = fact * i;
	}

	return fact;
}

public static int TakingInput(int n) {
	int count = 0;
	int fact = 0;
	while (count < n) {
		int nm = sc.nextInt();
		fact += Factorial(nm);
		count++;

	}

	return fact;
}
}
