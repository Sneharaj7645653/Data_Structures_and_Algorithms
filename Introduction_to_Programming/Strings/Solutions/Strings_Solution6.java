public class Strings_Solution6 {
    public String solve(String A) {
        String ans ="";
        for(int i=A.length()-1;i>=0;i--)
        {
            ans =ans+A.charAt(i);
        }
        return ans;
    }
}
