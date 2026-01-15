public class pens_distribution{
        public static void main(String[] args){
		       
			   int total_pen = 14;
			   int remaining_pen = 14%3;
			   
			   int pen_each_student = (total_pen - remaining_pen)/3;
			   			   
			   System.out.println("The Pen Per Student is " + pen_each_student + " and the remaining pen not distributed is " + remaining_pen);
			   }
		
	}