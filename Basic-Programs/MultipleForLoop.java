import java.util.Scanner;

public class MultipleForLoop{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	   
	    
		if(n1>0){
			for(int i=100;i>=1;i--){
				 if(i%n1==0){
				 System.out.println("Multiple of "+  n1 + " , conatin " + i);   
			     
				 }
			
			}
		}else{
			System.out.println("Your given number is not positive integer.");
		}
		
		
	   }
}