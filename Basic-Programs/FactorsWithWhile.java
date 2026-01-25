import java.util.Scanner;

public class FactorsWithWhile{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	   int i=1;
	    
		if(n1>0){
			
			while(i<=n1){
				 if(n1%i==0){
					 System.out.println("Factors of number "+  n1 + " contain " + i);
					 }
					 i++;
			}
		}else{
			System.out.println("YOU given number is not positive integer.");
		}
	   }
}