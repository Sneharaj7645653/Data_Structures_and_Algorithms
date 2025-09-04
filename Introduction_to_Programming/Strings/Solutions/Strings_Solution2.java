import java.lang.*;
import java.util.*;

public class Strings_Solution2 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            System.out.print((int)str.charAt(i)+" ");
        }
    }
}