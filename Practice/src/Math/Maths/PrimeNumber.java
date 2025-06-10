package Math.Maths;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(speed(8));
    }

    static boolean speed(int n) {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        while (c*c<n){
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        return true;
    }

}
