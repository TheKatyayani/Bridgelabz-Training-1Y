import java.util.Scanner;

public class Number_Of_Students{
      public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("enetr the total number of students :");
		int students = sc.nextInt();
		
		
		int total_handshake = (students*(students-1))/2;
	
		System.out.println("The total number of students "+ students + " and total handshakes are "+ total_handshake);
		
		}
	}