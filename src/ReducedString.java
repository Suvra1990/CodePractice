import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReducedString {
    static String super_reduced_string(String s){
        // Complete this function
        int i = 1;
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(i - 1)) {
              s = s.substring(0, i - 1) + s.substring(i + 1);
              i = 1;
            } else {
                i++;
            }
        }
        if (s.length() == 0) {
            return "Empty String";
        } else {
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
