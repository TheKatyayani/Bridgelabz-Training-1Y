import java.util.Scanner;
public class Input_Discount{
      public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double fee = sc.nextDouble();
		
		double discount = fee*(10.0/100.0);
		double the_actual_price = fee - discount;
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + the_actual_price);
		}
	}
	