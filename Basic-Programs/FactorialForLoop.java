import java.util.Scanner;

public class FactorialForLoop{
       public static void main(String [] args){
	          Scanner sc = new Scanner(System.in);
			  
			  int n1 = sc.nextInt();
			  int factorial =1;
			  
			  if(n1>0){
			  for(int i=1 ; i <n1+1 ; i++){
			      factorial = factorial*i;
				  }
				  System.out.println("Fctorial of "+ n1 + " is " + factorial);
			  }else if(n1<0){
				  System.out.println("Factorial for negative number is not possible.");
			  }else {
				  System.out.println("Factorial of Zero is 1.");
				  
		}
		
	}
}
	
			  