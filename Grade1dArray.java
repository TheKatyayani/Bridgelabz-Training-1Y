import java.util.Scanner;
public class Grade1dArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int[] phy = new int[students];
        int[] chem = new int[students];
        int[] maths = new int[students];
        float[] percentages = new float[students];
        int[] grade = new int[students];
        System.out.println("Physics");
        for(int j=0;j<students;j++) {
            phy[j]=sc.nextInt();
        }
        System.out.println("chemistry");
        for(int j=0;j<students;j++) {
            chem[j]=sc.nextInt();
        }
        System.out.println("maths");
        for(int j=0;j<students;j++) {
            maths[j]=sc.nextInt();
        }
        float percent=0;
            int sum=0;
            for(int i=0;i<students;i++){
                sum= phy[i]+chem[i]+maths[i];
                percent=(sum)/3.0f;
                percentages[i]=percent;
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
            System.out.println(j+"   phy : "+phy[i]+"   chem : "+chem[i]+"  maths : "+maths[i]+"    persentage : "+percentages[i]+"  grade : "+grade[i]);
        }
    }
}