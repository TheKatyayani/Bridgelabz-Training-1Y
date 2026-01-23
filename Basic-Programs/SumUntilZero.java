import java.util.Scanner;

public class SumUntilZero{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   double n1=sc.nextDouble();;
	   double sum =0;
	  
	  while(n1!=0){
	 //  n1 = sc.nextDouble();
	  
	  sum = n1 + sum;
	 
	   
	  }
	  
	  System.out.println("Total sum untill zero is " + sum);
}
}