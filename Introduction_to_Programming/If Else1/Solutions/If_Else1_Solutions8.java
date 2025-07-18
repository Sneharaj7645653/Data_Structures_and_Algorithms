import java.lang.*;
import java.util.*;


public class If_Else1_Solutions8 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int per = (a+b+c+d+e)/5;
        System.out.println(per);
        if(per>=90)
        {
            System.out.println('A');
        }
        else if(per>=80)
        {
            System.out.println('B');
        }
        else if(per>=70)
        {
            System.out.println('C');
        }
        else if(per>=60)
        {
            System.out.println('D');
        }
        else if(per>=40)
        {
            System.out.println('E');
        }
        else
        {
            System.out.println('F');
        }
    }
}