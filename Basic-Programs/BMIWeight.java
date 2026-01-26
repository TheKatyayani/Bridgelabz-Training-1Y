import java.util.Scanner;

public class BMIWeight{
        public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter two values [1] For weight and [2] For height(in cm).");
			double weight = sc.nextDouble();
			double height = sc.nextDouble();
			
			double h2 = height/100.0;
			
			double bmi = weight/(h2*h2);
			
			if(bmi>=40){
				System.out.println("you are Obese. According to you weight " + weight + " and Height " + height );
			}else if (bmi<40 && bmi>=25){
				System.out.println("you are Overweight. According to you weight " + weight + " and Height " + height );
			}else if(bmi<25 && bmi>=18.5){
				System.out.println("you are Normal. According to you weight " + weight + " and Height " + height );
			}else{
				System.out.println("you are UnderWeight. According to you weight " + weight + " and Height " + height );
			}
			
		}
}
			
			