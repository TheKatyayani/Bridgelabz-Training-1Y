import java.util.Scanner;

public class OddAndEven{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	   
	   if(n1>0 ){
		   if(n1%2==0){
	            for(int i=1;i<n1+1;i++){
			       if(i%2==0){
				   System.out.println("Even number till "+ n1 + " contain " + i);
				   }
				}
		   }else{
		  
                for(int j=1;j<n1+1;j++){
                   if(j%2 !=0){
				   System.out.println("Odd number till "+ n1 + " contain " + j);
                   }
				}
		   }
			
	    }else{
	    System.out.println("'Number is not natural number.");
	   }
	   }

}