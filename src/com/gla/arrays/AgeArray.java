import java.util.Scanner;

public class AgeArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[]arr = new int[length];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<arr.length;j++){
			if(arr[j]<0){
				System.out.println("Invalid Age");
			}else if(arr[j]<18){
				System.out.println("The student with age "+ arr[j] + " cannot vote.");
			}else{
				System.out.println("The student with age "+ arr[j] + " can vote.");
			}
		}
	}
		
}