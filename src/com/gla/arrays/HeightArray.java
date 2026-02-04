import java.util.Scanner;

public class HeightArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       // System.out.println("Enter length of an array :");
       // int length = sc.nextInt();

        double[] height = new double[11];
        double sum = 0;
        

        for(int i=0 ; i<11 ; i++){
            double height1 = sc.nextInt();
            height[i]=height1;
            sum = sum + height[i];
        }

        for(int m=0;m<11;m++){
            System.out.println("Height of "+ (m+1) + " first player is "+ height[m]);
        }

        System.out.println("sum is "+ sum);
        double mean= sum/11;
        System.out.println("mean height is "+ mean);

        sc.close();
    }
}
