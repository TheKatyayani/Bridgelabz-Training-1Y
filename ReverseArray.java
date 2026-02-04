import java.util.Scanner;
public class ReverseArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of number");
        int n = sc.nextInt();
        System.out.println("Enter number");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }

}