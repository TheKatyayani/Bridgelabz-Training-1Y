import java.util.Scanner;

public class Calculator{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		
		float add = x + y;
		float sub = x - y;
		float mul = x * y;
		float div = x / y;
	
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + x + " and " + y + " is " + add + " , " + sub + " , " + mul + " and " + div  );
		
		}
	}