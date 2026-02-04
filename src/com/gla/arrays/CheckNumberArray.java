import java.util.Scanner;

public class CheckNumberArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length = 5;
		int[]arr = new int[length];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<arr.length;j++){
			if(arr[j]>0){
				if(arr[j]%2==0){
				   System.out.println(arr[j]+" This number is postive and it is even.");
				}else{
				   System.out.println(arr[j]+" This number is postive and it is odd.");	
				}
			}else if(arr[j]<0){
				System.out.println(arr[j]+" This number is negative.");
			}else{
				System.out.println(arr[j]+" This number is zero.");
			}
			
		}
		
		if(arr[0]>arr[arr.length-1]){
				System.out.println(" First number is greater than last number.");
			}else if(arr[0]<arr[arr.length-1]){
				System.out.println(" First number is less than last number.");
			}else{
				System.out.println(" First number is equal last number.");
			}
			
			//System.out.println(arr.length);
	}
		
}