import java.util.Scanner;

public class ArmstrongNumber{

	
   public static int exponent(int num){
			
			int count=0;
			while(num!=0){
				  count++;
				  num = num/10;
			}
		return count;	
		
   }
	
	
	public static int power(int base , int exp){
	int result =1;
	int i=1;
	while(i<=exp){
		result= base*result;
		i++;
	}
	
	return result;
}
	

	
        public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int n1 = sc.nextInt();
			
			long sum = 0;
			int n2 =n1;
			int exp = exponent(n1);
			System.out.println("digits " + exp);
			
			
			while(n1!=0){
				  int num=n1%10;
				  int k= power(num , exp);
				  System.out.println(k);
				  sum = sum + k;
				  n1 = n1/10;
				  System.out.println("sum " + sum);
				  
			}
			
                if(sum==n2){
				System.out.println(n2 + " is the Armstrong number");
			    }else{
					System.out.println(n2 + " is not the Armstrong number");
				}
			
			
		}
}