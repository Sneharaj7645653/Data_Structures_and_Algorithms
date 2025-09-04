public  class Strings_Solution5{
    public static String change_char(String str) {
        // complete the function template
        String ans ="";
        ans =ans+str.charAt(0);
        int f =str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)-f==0)
                ans = ans+"$";
            else
                ans = ans+str.charAt(i);
        }
        return ans;
    }
}