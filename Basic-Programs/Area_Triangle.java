import java.util.Scanner;

public class Area_Triangle{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Base and Height are in cm :");
		float base = sc.nextFloat();
		float height = sc.nextFloat();
		
		double area = (1.0/2.0)*base*height;
		double area_inches = area/(6.4516);
		
		System.out.println("your area in cm "+ area + " cm ^2 , and in inches " + area_inches + "sq in");
		
		}
	}