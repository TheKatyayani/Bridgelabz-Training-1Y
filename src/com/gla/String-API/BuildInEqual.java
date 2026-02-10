import java.util.Scanner;

public class BuildInEqual {

    public static boolean comparison(String s1 , String s2 ){

            if(s1.length() != s2.length()){
                return false;
            }

            for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String  str1 = sc.next();
        System.out.println("Enter second string:");
        String  str2 = sc.next();

        boolean buildcomparison =  comparison(str1, str2);
        boolean equal = str1.equals(str2);

        System.out.println("custom CharAt() string result " + buildcomparison);
        System.out.println("custom .equal string result " + equal);

        if(buildcomparison==equal){
            System.out.println("Both string are equal. It is varified.");
        }
        
        sc.close();

    }
}
