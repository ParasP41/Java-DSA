package StriverRecursion;

public class NameNTime {
    public static void main(String[] args) {
        print(0,3);
    }

    static void print(int i,int n) {
        if(i==n)
        {
            return;
        }
        System.out.println("Paras");
        print(i+1,n);
    }
}
