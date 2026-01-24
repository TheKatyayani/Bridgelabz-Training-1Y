import java.util.Scanner;

public class OddAndEven{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	   
	   if(n1%2==0 && n1>=1){
	      System.out.println("User given number " + n1 + " is even number.");
	   }else{
	      System.out.println("User given number " + n1 + " is odd number.");
	   }
	   
}
}