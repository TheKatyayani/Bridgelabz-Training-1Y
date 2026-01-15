import java.util.Scanner;

public class Perimeter_Square{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Side :");
		float side = sc.nextFloat();
		
		double perimeter = 4.0 * side;
		
		System.out.println("The length of the side is "+ side + " whose perimeter is "+ perimeter);
		
		}
	}