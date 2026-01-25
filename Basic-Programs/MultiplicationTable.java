import java.util.Scanner;

public class MultiplicationTable{
       public static void main(String [] args){
	   
	          Scanner sc = new Scanner(System.in);
			  
	          System.out.println("Enter a [1].Number for multiplication and [2]. Till the times you want the table.");
			  
	          int n1 = sc.nextInt();
			  int n2 = sc.nextInt();
			  
			  if(n1>=6 && n1<=9){
			    for(int i =1;i<n2+1;i++){
				int mul = n1*i;
				
				System.out.println(n1 + " * " + i + " " +  " = " + mul);
			    }
			  }else{
			    System.out.println("The numbver you have enter for multiplication is not between 6 and 9.");
				
			  }
	
		}
	}	
	   