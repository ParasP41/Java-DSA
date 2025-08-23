package StriverRecursion;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sum(1,5,0));
        System.out.println(sum2(5));
    }

    //1
    static int sum(int i, int n,int sum) {
        if(i>n)
        {
            return sum;
        }
        return sum(i+1,n,sum+=i);
    }

    //2
    static int sum2(int i)
    {
        if (i==0)
        {
            return 0;
        }
        return i+sum2(i-1);
    }
}
