import java.util.Scanner;

public class Area_of_a_Circle{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		int radius = sc.nextInt();
		
		float area = 22/7 * (radius*radius);
		
		System.out.println("Area is "+ area );
		}
		}