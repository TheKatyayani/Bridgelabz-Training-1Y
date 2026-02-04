import java.util.Scanner;

public class TwoDimensionalArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give 2D-Array length of rwo and column:");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int [] [] arr = new int[row][column];
        System.out.println("Enter the value of 2D array:");

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                //int num2=sc.nextInt();
                //no need for that direct take input
                arr[i][j] =sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        int [] arr1 = new int[row*column];
        int k=0;

         for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr1[k] = arr[i][j];
                k++;
            }
        }

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        sc.close();

        
    }
}
