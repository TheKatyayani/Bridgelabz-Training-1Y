import java.util.Scanner;

public class GradeAndRemarks{
        public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			double phy = sc.nextDouble();
			double chem = sc.nextDouble();
			double math = sc.nextDouble();
			
			double sum = phy + chem + math;
			double avg = (phy + chem + math)/3.0;
			
			double percentage = (sum/300)*100;
			
			if(percentage>=80){
				System.out.println("Grade => A");
				System.out.println("Remark => Level 4, above agency-normalised standards");
				System.out.println("Average marks => " + avg);
			}else if(percentage>=70 && percentage<80){
				System.out.println("Grade => B");
				System.out.println("Remark => Level 3, agency-normalised standards");
				System.out.println("Average marks => " + avg);
			}else if(percentage>=60 && percentage<70){
				System.out.println("Grade => C");
				System.out.println("Remark => Level 2, below , but approaching agency-normalised standards");
				System.out.println("Average marks => " + avg);
			}else if(percentage>=50 && percentage<60){
				System.out.println("Grade => D");
				System.out.println("Remark => Level 1, well below agency-normalised standards");
				System.out.println("Average marks => " + avg);
			}else if(percentage>=40 && percentage<50){
				System.out.println("Grade => E");
				System.out.println("Remark => Leve 1-, too below agency-normalised standards");
				System.out.println("Average marks => " + avg);
			}else{
				System.out.println("Grade => R");
				System.out.println("Remark => Remedial standards");
				System.out.println("Average marks => " + avg);
			}
			
			
				
			
			
			
		}
}