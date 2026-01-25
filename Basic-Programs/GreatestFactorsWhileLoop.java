import java.util.Scanner;

public class GreatestFactorsWhileLoop{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	   int max=0;
	   int i=1;
	    
		if(n1>0){
			while(i<n1){
				 if(n1%i==0){
				    if(max<i){
					  max=i;
					 }
			     
				 }
				 i++;
			
			}
		}else{
			System.out.println("YOU given number is not positive integer.");
		}
		
		System.out.println("From the factors of "+  n1 + " , it's greatest factor is " + max);
	   }
}