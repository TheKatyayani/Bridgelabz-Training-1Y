import java.util.Scanner;

public class SumUntilZero{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   
	   double n1=sc.nextDouble();
	   double sum =0;
	  
	  
	    while(n1!=0){
		  sum = sum + n1;
		  
		  System.out.println("Enter number again for the sum : ");
	     
 		  n1 = sc.nextDouble();
	
	   
	  }
	  
	  System.out.println("Total sum until zero is " + sum);
 }
}