import java.util.Scanner;

public class MultiplicationArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter numfor multiplication between 6 to 9.");
        int num = sc.nextInt();

        if(num<6 || num>9){
            System.out.println("Number is not between 6 to 9");
            sc.close();
            return;
        }
         System.out.println("Enter array length:");
         int length = sc.nextInt();


        int[] arr = new int[length];
        int index=0;

        while(index<arr.length){
            arr[index]=(num*(index+1));
            index++;
        }

        for(int i=0;i<length;i++){
            System.out.println(num + " * " + (i+1) + " = " + arr[i]);
        }

        sc.close();
}
}

