import java.util.Scanner;

public class modulus_remainder_quotient{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
				
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				int quotient = x / y;
				int modulus = x % y;
				
				System.out.println("The Quotient is " + modulus + " and Reminder is " + quotient + " of two number "+ x + " and "+ y);
		}
	}