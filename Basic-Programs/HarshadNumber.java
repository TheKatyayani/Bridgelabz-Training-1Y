import java.util.Scanner;

public class HarshadNumber{
        public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int n1 = sc.nextInt();
			
			int sum = 0;
			int n2 =n1;
			
			while(n1!=0){
				  int num=n1%10;
				  sum=sum + num;
				  n1 = n1/10;
			}
			System.out.println(sum +" and "+n2);
			
			int Harshad = n2/sum;
			System.out.println(Harshad);
			
			if((n2%sum)==0){
			   System.out.println(n2 + " is the Harshad number.");
			}else{
			   System.out.println(n2 + " is not the Harshad number.");		
			}

				
			
			
			
		}
}