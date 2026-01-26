import java.util.Scanner;

public class PowerForLoop{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter [1].power and [2].Number.");
	   int power = sc.nextInt();
	   int n = sc.nextInt();
	   int result = 1;
	    
		if(n>0 && power>0){
			for(int i = 1 ; i<=power;i++){
                result = result*n;
		
			}
		}else{
			System.out.println("Your given number is not positive integer.");
		}
		
		System.out.println("The number "+ n + " with power "+ power + " result is " + result);
		
		
	   }
}