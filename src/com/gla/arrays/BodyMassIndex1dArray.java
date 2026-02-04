import java.util.Scanner;
public class BodyMassIndex1dArray{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("for status");
        System.out.println("1 = underweight");
        System.out.println("2 = normal");
        System.out.println("3 = overweight");
        System.out.println("4 = obese");
        System.out.println("no. of persons :");
        int persons = sc.nextInt();
        int[] weight = new int[persons];
        int[] height = new int[persons];
        float[] bmi = new float[persons];
        int[] status = new int[persons];
        System.out.println("weight");
        for(int j=0;j<persons;j++) {
            weight[j]=sc.nextInt();
        }
        System.out.println("height");
        for(int j=0;j<persons;j++) {
            height[j]=sc.nextInt();
        }
        float BMI=0;
        for(int i=0;i<persons;i++){
            BMI=weight[i]/height[i];
            bmi[i]=BMI;
        }

        for(int i=0;i<persons;i++){
            if(bmi[i]>=40.0){
                status[i]=4;
            }else if(bmi[i]<=39.9 && bmi[i]>=25.0){
                status[i]=3;
            }else if(bmi[i]<=29.9 && bmi[i]>=18.5){
                status[i]=2;
            }else{
                status[i]=1;
            }
        }
        for(int i=0;i<persons;i++){
            int j=i+1;
            System.out.println(j+"   weight : "+weight[i]+"   height : "+height[i]+"    BMI : "+bmi[i]+"  Status : "+status[i]);
        }
    }
}