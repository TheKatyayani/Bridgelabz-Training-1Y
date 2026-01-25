import java.util.Scanner;

public class GreatestFactors{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	   int max=0;
	    
		if(n1>0){
			for(int i=1;i<n1;i++){
				 if(n1%i==0){
				    if(max<i){
					  max=i;
					 }
			     
				 }
			
			}
		}else{
			System.out.println("YOU given number is not positive integer.");
		}
		
		System.out.println("From the factors of "+  n1 + " , it's greatest factor is " + max);
	   }
}