package Math.Bitwise;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 10;
//        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    public static int setBits(int n) {
        int count=0;
//        while (n>0)
//        {
//            count++;
//            n-=n&(-n);
//        }
        while (n>0)
        {
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
