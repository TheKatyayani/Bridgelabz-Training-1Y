import java.util.Scanner;


public class UntilZeroArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        double[] arr = new double[10];

        double sum = 0.0;
        int index=0;

        while(true){
            if(index==10){
                System.out.println("Array length is full:");
                break;
            }
            double num = sc.nextDouble(); 
            if(num<=0){
                break;
            }
            arr[index]=num;
            index++;
        }

        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }

        System.out.println("sum " + sum);

             sc.close();
    }
}