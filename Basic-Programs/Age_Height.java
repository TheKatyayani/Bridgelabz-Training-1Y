import java.util.Scanner;

public class Age_Height{
       public static void main(String [] args){
	   
	          Scanner sc = new Scanner(System.in);
			  
	         
			  System.out.println("Enter [1].Age and Height of Amar.");
			  double age1 = sc.nextDouble();
			  double height1 = sc.nextDouble();
			  
			  System.out.println("Enter [2].Age and Height of Akbar.");
			  double age2 = sc.nextDouble();
			  double height2 = sc.nextDouble();
			  
			  System.out.println("Enter [3].Age and Height of Anthony.");
			  double age3 = sc.nextDouble();
			  double height3 = sc.nextDouble();
	
	          
			  double samllest=0;
		      if(age1<age2 && age1<age3){
				  samllest=age1;
				  System.out.println("Amar has samllest age among three of them.");
			  }else if(age2<age1 && age2<age3){
				  samllest=age2;
				  System.out.println("Akbar has samllest age among three of them.");
			  }else{
				  samllest=age3;
				  System.out.println("Anthony has samllest age among three of them.");
			  }
			  
			  double max=0;
		      if(height1>height2 && height1>height3){
				  max=height1;
				  System.out.println("Amar has biggest height among three of them.");
			  }else if(height2>height1 && height2>height3){
				  max=height2;
				  System.out.println("Akbar has biggest height among three of them.");
			  }else{
				  max=height3;
				  System.out.println("Anthony has biggest height among three of them.");
			  }
			  
			  
			 

		}
	}	
	   