package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a="Paras";
        String b="Paras";
        String e=a;
        System.out.println(a==b);
        System.out.println(e==b);

        String c=new String("Kunal");
        String d=new String("Kunal");
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(c.charAt(3));
    }
}
