import java.util.Scanner;

public class Celsius_to_Fahrenheit_Conversion{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		float Celsius = sc.nextFloat();
		
		float Fahrenheit = (Celsius * 9/5) + 32 ;
		
		System.out.println("Fahrenheit is "+ Fahrenheit);
		}
		}