import java.lang.*;
import java.util.*;

public class Strings_Solution3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        int u=0;
        int l=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
                u++;
            else
                l++;

        }
        System.out.println(u+"\n"+l);
    }
}