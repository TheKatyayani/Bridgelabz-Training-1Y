import java.util.Scanner;

public class Factors{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	    
		if(n1>0){
			for(int i=1;i<n1+1;i++){
				 if(n1%i==0){
					 System.out.println("Factors of number "+  n1 + " conatin " + i);
				 }
			}
		}else{
			System.out.println("YOU given number is not positive integer.");
		}
	   }
}