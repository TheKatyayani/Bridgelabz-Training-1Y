import java.util.Scanner;

public class Precedence{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
				
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				
				System.out.println("operation1 = x + y * z" + "\noperation2 = x * y + z" + "\noperation3 = z + x/z" + "\noperation4 = x % y + z");
				
				double operation1 = x + y * z;
				double operation2 = x * y + z;
				double operation3 = z + x/y;
				double operation4 = x % y + z;
				
				System.out.println("Operation 1 value "+ operation1 + "\nOperation 2 value " +operation2 + "\nOperation 3 value " + operation3 + "\nOperation 4 value " + operation4);
		}
	}