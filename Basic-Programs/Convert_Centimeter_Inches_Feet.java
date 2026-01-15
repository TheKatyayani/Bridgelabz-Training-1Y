import java.util.Scanner;

public class Convert_Centimeter_Inches_Feet{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		float height = sc.nextFloat();
		
		double inches = height/(2.54);
		double feet = inches/12.0;
		
		System.out.println("Your Height in cm is "+ height +" while in feet is " + feet + " and inches is "+ inches);
		
		}
	}