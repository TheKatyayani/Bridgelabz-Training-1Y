import java.util.Scanner;

public class EvenAndOddArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num<=0){
            System.out.println("Error:not natural number:");
            sc.close();
            return;
        }
        int size = (num/2)+1;

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int index1=0;
        int index2=0;

        for(int i=1;i<=num;i++){
            if(i%2==0){
                arr1[index1++]=i;
            }else{
                arr2[index2++]=i;
            }
        }

         System.out.println("even array elements:");
        for(int m=0;m<index1;m++){
            System.out.println( arr1[m] );
        }

         System.out.println("odd array elements");
         for(int m=0;m<index2;m++){
            System.out.println(arr2[m]);
        }


        sc.close();
    }
}
