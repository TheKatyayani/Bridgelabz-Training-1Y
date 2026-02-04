import java.util.Scanner;

public class TableArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[]arr = new int[length];
		int num = sc.nextInt();
		
		for(int i=0;i<arr.length;i++){
			arr[i]=num*(i+1);
		}
		
		for(int j=0;j<arr.length;j++){
			System.out.println(num + " * " + (j+1) + " = "+ arr[j]);
		
		}
		
	}
		
}