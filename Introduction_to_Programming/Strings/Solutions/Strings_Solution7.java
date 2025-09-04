public class Strings_Solution7{
    public static boolean isPalin(String A) {
        // complete the function template
        String ans ="";
        for(int i=A.length()-1;i>=0;i--)
        {
            ans =ans+A.charAt(i);
        }
        return (ans.equals(A));

    }
}