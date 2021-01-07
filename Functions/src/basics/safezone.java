package basics;
import java.lang.Math;
import java.util.*;
public class safezone {
	
	
	      
	    /* A utility function to calculate area of triangle  
	       formed by (x1, y1) (x2, y2) and (x3, y3) */
	   public static double area(int x1, int y1, int x2, int y2, 
	                                        int x3, int y3) 
	    { 
	       return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ 
	                                    x3*(y1-y2))/2.0); 
	    } 
	       
	    /* A function to check whether point P(x, y) lies 
	       inside the triangle formed by A(x1, y1), 
	       B(x2, y2) and C(x3, y3) */
	    public static boolean isInside(int x1, int y1, int x2, 
	                int y2, int x3, int y3, int x, int y) 
	    {    
	       /* Calculate area of triangle ABC */
	        double A = area (x1, y1, x2, y2, x3, y3); 
	       
	       /* Calculate area of triangle PBC */  
	        double A1 = area (x, y, x2, y2, x3, y3); 
	       
	       /* Calculate area of triangle PAC */  
	        double A2 = area (x1, y1, x, y, x3, y3); 
	       
	       /* Calculate area of triangle PAB */   
	        double A3 = area (x1, y1, x2, y2, x, y); 
	         
	       /* Check if sum of A1, A2 and A3 is same as A */
	        return (A == A1 + A2 + A3); 
	    } 
	      
	    /* Driver program to test above function */
	    public static void main(String[] args)  
	    { 
	        Scanner scan = new Scanner(System.in);
	        int x1=scan.nextInt();
	        int y1=scan.nextInt();
	        int x2=scan.nextInt();
	        int y2=scan.nextInt();
	        int x3=scan.nextInt();
	        int y3=scan.nextInt();
	        int n =scan.nextInt();
	        int count=0;
	        int x=0,y=0;
	        while(n>0){
	             x=scan.nextInt();
	             y=scan.nextInt();

	            if(!isInside(x1,y1,x2,y2,x3,y3,x,y)){
	                 count++;
	            }
	            n--;
	        }
	        System.out.println(count);      
	    } 
	} 

