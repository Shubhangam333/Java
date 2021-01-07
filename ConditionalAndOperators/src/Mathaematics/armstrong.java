package Mathaematics;

import java.util.*;
import java.lang.Math;
public class armstrong {
    public static void main(String args[]) {
         Scanner scan = new Scanner(System.in);
		 int number = scan.nextInt();

         int originalNumber,originalNumber1, remainder, result = 0;
        int count=0;
        originalNumber = number;
		originalNumber1 = number;
		 while (originalNumber1 != 0)
        {
            remainder = originalNumber1 % 10;
            count++;
            originalNumber1 /= 10;
        }

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, count);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
