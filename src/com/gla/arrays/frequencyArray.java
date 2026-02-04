import java.util.Scanner;
public class frequencyArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int[] freq = new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
            freq[i]=-1;
        }
        for(int i=0;i<length;i++){
            int count=1;
            for(int j=i+1;j<length;j++){
                if(arr[j]== arr[i]){
                    count++;
                    freq[j]=0;
                }
            }if(freq[i]!=0){
                freq[i]=count;
            }
        }
        for(int k=0;k<length;k++){
            if(freq[k]!=0){
                System.out.println("frequency of "+arr[k]+" is "+freq[k]);
            }
        }
    }
}