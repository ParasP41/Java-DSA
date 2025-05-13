package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str="";
        System.out.println(palin(str));
    }
    static boolean palin(String str)
    {
        //1 method
//        if(str==null || str.length()==0)
//        {
//            return true;
//        }
//        str=str.toLowerCase();
//        for (int i = 0,j=str.length()-1; i < j; i++,j--) {
//            if(str.charAt(i)!=str.charAt(j))
//            {
//                return false;
//            }
//        }
//        return true;

//        2 method
        if(str==null || str.length()==0)
        {
            return true;
        }
        str=str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end)
            {
                return false;
            }
        }
        return true;
    }
}
