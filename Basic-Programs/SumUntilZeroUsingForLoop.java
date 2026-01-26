import java.util.Scanner;

public class SumUntilZeroUsingForLoop{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   
	   double n1=sc.nextDouble();;
	   double sum =0;
	  
	 
	   for(double i= n1;i !=0 && i>0;){   
		  sum = sum + i;
		  
		  System.out.println("Enter number again for the sum : ");
	     
 		  i = sc.nextDouble();
	
	   
	  }
	  
	  System.out.println("Total sum until zero or negative number is " + sum);
}
}