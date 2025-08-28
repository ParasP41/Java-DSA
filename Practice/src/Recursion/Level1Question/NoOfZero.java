package Recursion.Level1Question;

public class NoOfZero {
    public static void main(String[] args) {
        System.out.println(count(12020201,0));
    }
    static int count(int n,int c)
    {
        if(n%10==n)
        {
            return c;
        }
        if(n%10==0)
        {
            return count(n/10,c+1);
        }
        return count(n/10,c);

    }
}
