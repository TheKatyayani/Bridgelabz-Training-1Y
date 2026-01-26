import java.util.Scanner;

public class LeapYear{
        public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int n1 = sc.nextInt();
			
			if(n1>=1582){
				
			    if((n1%4==0 && n1%100 !=0) || n1%400==0){
					System.out.println(n1 + " is the leap Year.");
				}else {
					System.out.println(n1 + " is not the leap Year.");
				}
				
			}else{
				System.out.println("Error : . The Gregorian calendar was instituted in 1582 . Enter a year after 1582.");
			}
			
			
		}
}