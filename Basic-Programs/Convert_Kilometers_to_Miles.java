import java.util.Scanner;

public class Convert_Kilometers_to_Miles{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		float Kilometer = sc.nextFloat();
		
		double miles = Kilometer * (0.621371);
		System.out.println("Miles is "+ miles );
		}
		}