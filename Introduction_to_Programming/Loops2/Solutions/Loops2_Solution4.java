import java.lang.*;
import java.util.*;

public class Loops2_Solution4 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean negative = false;
        if(num<0)
        {
            negative=true;
            num=num*(-1);
        }
        int sum = 0;
        while(num>0)
        {
            sum = sum*10+(num%10);
            num=num/10;
        }

        if(negative)
            System.out.println(-1*sum);
        else
            System.out.println(sum);

    }
}