import java.util.Scanner;
public class Grade2dArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int[][] marks = new int[students][3];
        float[] percentages = new float[students];
        int[] grade = new int[students];

        for(int j=0;j<students;j++) {
            for (int i = 0; i < 3; i++) {
                marks[j][i] = sc.nextInt();
            }
        }
        float percent=0;
        for(int j=0;j<students;j++){
            int sum=0;
            for(int i=0;i<3;i++){
                sum=sum+marks[j][i];
                percent=(sum)/3.0f;
            }
            percentages[j]=percent;
        }
        for(int i=0;i<students;i++){
            if(percentages[i]>79){
                grade[i]=4;
            }else if(percentages[i]<80 && percentages[i]>69){
                grade[i]=3;
            }else if(percentages[i]<70 && percentages[i]>59){
                grade[i]=2;
            }else if(percentages[i]<60 && percentages[i]>49) {
                grade[i]=1;
            }else if(percentages[i]<50 && percentages[i]>39){
                grade[i]=-1;
            }else{
                grade[i]=-2;
            }
        }
        for(int i=0;i<students;i++){
            int j=i+1;
            System.out.println(j+"   phy : "+marks[i][0]+"   chem : "+marks[i][1]+"  maths : "+marks[i][2]+"    persentage : "+percentages[i]+"  grade : "+grade[i]);
        }
    }
}