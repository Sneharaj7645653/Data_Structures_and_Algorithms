import java.lang.*;
import java.util.*;

public class Loops3_Solution4 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while( i<= n ){
            int num = i;
            int x = i;
            int sum = 0;
            while(x>0)
            {
                sum += (x%10)*(x%10)*(x%10);
                x/=10;
            }
            if(sum == num)
            {
                System.out.println(num);
            }
            i++;
        }
    }
}