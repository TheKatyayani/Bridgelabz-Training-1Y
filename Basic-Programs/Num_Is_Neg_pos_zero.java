import java.util.Scanner;

public class Num_Is_Neg_pos_zero{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	  
	   if(n1>0){
	   System.out.println("Number " + n1 + " is Positive number.");
	   }else if (n1<0){
	   System.out.println("Number " + n1 + " is Negative number.");
	   }else {
	   System.out.println("Number " + n1 + " is Zero.");
	   }
	   
	   
	   }
}