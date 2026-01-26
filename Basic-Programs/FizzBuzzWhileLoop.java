import java.util.Scanner;

public class FizzBuzzWhileLoop{
       public static void main(String [] args){
	   
	        Scanner sc = new Scanner(System.in);

	        int n1 = sc.nextInt();
            int i = 1;
			  
			    if(n1>0){
			     
			       while(i<=n1){
					   if(n1%i==0){
					   
					      if(n1%3==0 && n1%5==0){
						    System.out.println("Multiple of "+ n1 + " contain = FizzBuzz " );
					      }else if(n1%5==0){
						    System.out.println("Multiple of "+ n1 + " contain = Buzz " );
					      }else if(n1%3==0){
						    System.out.println("Multiple of "+ n1 + " contain = Fizz " );
					      }else{
						    System.out.println("Multiple of "+ n1 + " contain = " + i );
					      }
				        }
						i++;
				    }
			        
				}else{
					System.out.println("The number you have enter , is not a positive number.");
				} 				

		}
	}	
	   