package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    static void main() {

//        String regexp = "^[A-Z a-z 0-9]{3,6}$";
 //       String emailexp = "^[a-z A-Z \\d]?@[a-z]+\\.com$";
//        String emailexp = "^[a-z A-Z \\d]+@[a-z]+\\.com$";
        String emailexp = "^[a-z]+?[A-z]+?[0-9]=?[\\W]+?{8,16}$";
//        String emailexp = "^\\d+$";
        Pattern pattern = Pattern.compile(emailexp);
        Matcher matcher= pattern.matcher("aB9%$khit5");

        if(matcher.matches()){
//        if(matcher.find()){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }

    }
}
