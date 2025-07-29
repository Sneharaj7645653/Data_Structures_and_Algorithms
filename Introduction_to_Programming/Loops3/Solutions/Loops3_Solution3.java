import java.lang.*;
import java.util.*;

public class Loops3_Solution3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while(i<=n)
        {

            int c = 2;
            int num = i;
            boolean flag = true;
            while(c*c <= num)
            {
                if(num%c==0)
                {
                    flag = false;
                    break;
                }
                c++;
            }
            if(flag)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}