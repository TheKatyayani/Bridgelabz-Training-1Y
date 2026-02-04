import java.util.Scanner;
public class FactorArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int MaxSize=10;
        int num = sc.nextInt();
        int [] arr = new int[MaxSize];
        int index=0;
        int count=0;

        for(int i=1;i<MaxSize;i++){
            if(num%i==0){
                arr[index]=i;
                index++;
                count++;
            }
            if(MaxSize==index){
                MaxSize=MaxSize*2;
            }
        }

        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
