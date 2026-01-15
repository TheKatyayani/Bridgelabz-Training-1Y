public class volume_miles_kilometer{
        public static void main(String[] args){
		       
			   int radius = 6371;
			   
			   double volume =(4.0/3.0)* 3.14 * radius*radius*radius;
			   
			   double volume_in_miles = volume / 1.6 ;
			   			   
			   System.out.println("The volume of earth in cubic kilometers is "+ volume + " and cubic miles to "+volume_in_miles);
			   }
		
	}