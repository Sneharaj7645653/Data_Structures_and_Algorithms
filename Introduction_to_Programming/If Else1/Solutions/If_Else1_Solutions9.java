import java.lang.*;
import java.util.*;

public class If_Else1_Solutions9 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = 0;
        if(n<=50)
        {
            a = n*.50;
        }
        else if(n<=150)
        {
            a = 50*.50 + (n-50)*.75;
        }
        else if(n<=250)
        {
            a = 50*.50 + (100)*.75+ (n-150)*1.2;
        }
        else
        {
            a = 50*.50 + (100)*.75+ (100)*1.2+ (n-250)*1.5;
        }
        a = 1.2*a;
        int ans = (int)a;
        System.out.println(ans);

    }
}