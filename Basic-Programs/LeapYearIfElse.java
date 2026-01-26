import java.util.Scanner;

public class LeapYearIfElse{
        public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int n1 = sc.nextInt();
			
			if(n1>=1582){
				
			    if(n1%4==0){
					System.out.println(n1 + " is the leap Year.");
				}else if(n1%100==0){
					System.out.println(n1 + " is not a leap Year.");
				}else if(n1%400==0){
					System.out.println(n1 + " is the leap Year.");
				}else{
					System.out.println(n1 + " is not a leap Year.");
				}
				
			}else{
				System.out.println("Error : . The Gregorian calendar was instituted in 1582 . Enter a year after 1582.");
			}
			
			
		}
}