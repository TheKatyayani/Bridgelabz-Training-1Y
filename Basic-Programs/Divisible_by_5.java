import java.util.Scanner;

public class Divisible_by_5{
 
        public static void main(String [] args){
		       
			   Scanner sc = new Scanner(System.in);
			   
			   int n = sc.nextInt();
			   int modulus = n % 5 ;
			   
			   if(modulus==0){
			   System.out.println("number " + n + " is divisible by 5 .");
			   }else {   
			   System.out.println("number " + n + " is not divisible by 5 .");
			   }
		
		}
	
	}
