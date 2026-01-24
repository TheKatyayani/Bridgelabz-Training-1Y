import java.util.Scanner;

public class SumByForlmulaForLoop{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	   
	   int sum1 = n1 * (n1+1)/2;
	   
	   int sum2 = 0;
	   
	   for(int i=1;i<n1+1;i++){
	   sum2 = sum2 + i;
	   }
	   
	   System.out.println("Sum of natural number by for formula [n1 * (n1+1)/2] is " + sum1 + " and by for loop is " + sum2);
	   System.out.println("SO, we can see that sum by both method result is same.");
}
}