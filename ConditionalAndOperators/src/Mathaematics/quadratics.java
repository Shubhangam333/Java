package Mathaematics;

//Given coefficients of a quadratic equation , you need to print the nature of the roots (Real and Distinct , Real and Equal or Imaginary) and the roots.
//If Real and Distinct , print the roots in increasing order.
//If Real and Equal , print the same repeating root twice
//If Imaginary , no need to print the roots.

import java.util.*;
public class quadratics {
    public static void main(String args[]) {
           int secondRoot = 0, firstRoot = 0;
      Scanner sc = new Scanner(System.in);
      double a = sc.nextDouble();

      double b = sc.nextDouble();

      
      double c = sc.nextDouble();

      double determinant = (b*b)-(4*a*c);
      double sqrt = Math.sqrt(determinant);

      if(determinant>0){
         firstRoot = (int)((-b + sqrt)/(2*a));
         secondRoot = (int)((-b - sqrt)/(2*a));
         System.out.println("Real and Distinct");
		 System.out.println(secondRoot +" "+firstRoot);
      }else if(determinant == 0){
		  firstRoot=(int)((-b + sqrt)/(2*a));
         System.out.println("Real and Equal");
		 System.out.println(firstRoot +" "+firstRoot);
      }else{
		   System.out.println("Imaginary");
	  }
    }
}
