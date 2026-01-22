import java.util.Scanner;

public class Max_Num{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	   int n2 = sc.nextInt();
	   int n3 = sc.nextInt();
	   
	   if(n1>n2 && n1>n3){
	   System.out.println("First number the largest and that is " + n1);
	   }else if (n2>n1 && n2>n3){
	   System.out.println("Second number the largest and that is " + n2);
	   }else {
	   System.out.println("Third number the largest and that is " + n3);
	   }
	   
	   
	   }
}