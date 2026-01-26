import java.util.Scanner;

public class AbundantNumber{
        public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int n1 = sc.nextInt();
			int n2 = n1;
			
			int sum = 0;
			
			int i=1;
			while(i<n1){
				 if(n1%i==0){
				 sum = sum + i;
				 }
				 i++;
			}
			
			if(sum>n1){
			   System.out.println(n1 + " this number is Abundant Number.");	
			}else{
				System.out.println(n1 + " this number is not Abundant Number.");	
			}
	
		}
}