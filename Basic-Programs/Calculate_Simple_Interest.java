import java.util.Scanner;

public class Calculate_Simple_Interest{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		float principal = sc.nextFloat();
		float rate = sc.nextFloat();
		float time = sc.nextFloat();
		
		
		float interest = (principal * rate * time) / 100;
		
		System.out.println("Simple Interest is "+ interest );
		}
		}