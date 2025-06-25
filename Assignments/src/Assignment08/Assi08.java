package Assignment08;

import java.sql.Array;
import java.util.Arrays;

public class Assi08 {

    public static void main(String[] args) {
        System.out.println(sdeep());
    }
    static boolean sdeep(String a,String b)
    {
        for(int i=0,j=a.length()-1;i<j;i++,j--)
        {
            if(a.charAt(i)!=b.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
    static boolean pdeep(String a,String b)
    {
        for(int i=0,j=a.length()-1;i<j;i++,j--)
        {
            if(b.charAt(i)!=a.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}


