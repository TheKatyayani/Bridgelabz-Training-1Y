import java.util.Scanner;

public class PrimeNumber{
        public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int n1 = sc.nextInt();
			
			int count=0;
			
			for(int i=1;i<n1+1;i++){
				if(n1%i==0){
					count++;
				}
			}
			
			if(count==2){
				System.out.println(n1 + " is the Prime Number.");
			}else{
				System.out.println(n1 + " is not the Prime Number.");
			}
			
			
			
		}
}