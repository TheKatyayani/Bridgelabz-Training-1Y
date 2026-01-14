import java.util.Scanner;

public class Calculate_Average_of_Three_Numbers{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		int num_1 = sc.nextInt();
		int num_2 = sc.nextInt();
		int num_3 = sc.nextInt();
		
		float average = num_1 + num_2 +num_3;
		System.out.println("Average is "+ average );
		}
		}