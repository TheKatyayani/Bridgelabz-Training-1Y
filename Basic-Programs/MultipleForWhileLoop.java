import java.util.Scanner;

public class MultipleForWhileLoop{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	   int i=100;
	    
		if(n1>0){
			while(i>=1){
				 if(i%n1==0){
				 System.out.println("Multiple of "+  n1 + " , conatin " + i);   
			     
				 }
			    i--;
			}
		}else{
			System.out.println("Your given number is not positive integer.");
		}
		
		
	   }
}