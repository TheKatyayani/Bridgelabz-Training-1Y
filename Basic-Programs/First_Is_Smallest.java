import java.util.Scanner;

public class First_Is_Smallest{
 
        public static void main(String [] args){
		       
			   Scanner sc = new Scanner(System.in);
			   
			   int n1 = sc.nextInt();
			   int n2 = sc.nextInt();
			   int n3 = sc.nextInt();
			  
			   
			   if(n1<n2 && n1 <n3){
			   System.out.println("Yes , First number " + n1 + " is the smallest among the rest three");
			   }else {   
			   System.out.println("No , Number " + n1 + " is not the smallest among the rest three");
			   }
		
		}
	
	}
