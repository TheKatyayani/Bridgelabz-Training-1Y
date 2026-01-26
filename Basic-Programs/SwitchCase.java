import java.util.Scanner;

public class SwitchCase{
        public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter two number for operations .");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			System.out.println("Enter and Choose an operator from them \n+ , - , * , /");
			String operators = sc.nextLine();
			       operators = sc.nextLine();           // because after nextInt i have used two nextLine because   
			                                            //nextint will consumed the next leading space so one of this command will skip so ,
														//have to use again this line nextLine(); 
			switch (operators){
				case "+":
				int sum = n1 + n2;
                         System.out.println("Sum of " + n1 + " and " + n2 + " is " + sum);
						 break;
				case "-":
				int diff = n1 - n2;
                         System.out.println("Diffenece of " + n1 + " and " + n2 + " is " + diff);
						 break;
				case "*":
				int mul = n1 * n2;
                         System.out.println("Multiplication of " + n1 + " and " + n2 + " is " + mul);
						 break;		 		 
				case "/":
				 if(n2!=0){
					int divide = n1 / n2;
                         System.out.println("Divide of " + n1 + " and " + n2 + " is " + divide);
						  
				 }else{
					     System.out.println("Undefined.");
				 }
				        break;
				default : 
				         System.out.println("Invalid Operator.");
			
			    }
		}
}