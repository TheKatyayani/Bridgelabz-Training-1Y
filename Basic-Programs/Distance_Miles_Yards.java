import java.util.Scanner;

public class Distance_Miles_Yards{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("enetr the distance in feet :");
		float feet = sc.nextFloat();
		
		double yards =  feet/3.0;
		double miles = yards / 1760;
	
		System.out.println("your distance in feet "+ feet + " and in yards and miles is " + yards + "," + miles );
		
		}
	}