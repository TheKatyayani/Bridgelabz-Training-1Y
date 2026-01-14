import java.util.Scanner;

public class Power_Calculation{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base :");
		int base = sc.nextInt();
		
		System.out.println("Enter Exponenet:");
		int exponent = sc.nextInt();
		
		double power = Math.pow(base , exponent);
		
		System.out.println("Power is  " + power);
		}
		}