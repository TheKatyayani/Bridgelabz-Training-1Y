import java.util.Scanner;

public class SalaryBonus{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the [1]. salary and [2].year of your service.");
	   double salary = sc.nextDouble();
	   int Year_of_service = sc.nextInt();
	   
	   if(Year_of_service > 5){
	        double bonus = (5.0/100)*salary;
			
			System.out.println("Bonus amount is " + bonus + " on salary " + salary + " of year of 5 year service." );
	   }else{
	        
			System.out.println("You have no bonus . Because your year of service is not more than 5 year.");
	   
	   }
	   }
    }
	   
	   