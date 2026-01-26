import java.util.Scanner;

public class NumberOfDigits{
        public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int n1 = sc.nextInt();
			
			int reverse = 0;
			int count=0;
			int n2 =n1;
			
			while(n1!=0){
				  int num=n1%10;
				  reverse=10*reverse+n1;
				  count++;
				  n1 = n1/10;
			}

				System.out.println("The total number of dights "+ n2 + " contain is " + count);
			
			
			
		}
}