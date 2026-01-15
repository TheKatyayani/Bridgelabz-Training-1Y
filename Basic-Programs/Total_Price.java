import java.util.Scanner;

public class Total_Price{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("enetr the price of one item and quantity  :");
		float unit_price = sc.nextFloat();
		int quantity = sc.nextInt();
		
		double total_price = quantity*unit_price;
	
		System.out.println("The total purchase price is INR "+ total_price + " if the quantity "+ quantity + " and unit price is INR "+ unit_price);
		
		}
	}