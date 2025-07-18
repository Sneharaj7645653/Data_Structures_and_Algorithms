import java.lang.*;
import java.util.*;

public class If_Else1_Solutions1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<=12)
        {
            System.out.println("Child");
        }
        else if(age<=19)
        {
            System.out.println("Teenager");
        }
        else if(age<=40)
        {
            System.out.println("Young");
        }
        else if(age<=60)
        {
            System.out.println("Middle-Aged");
        }
        else
        {
            System.out.println("Senior-Citizen");
        }
    }
}