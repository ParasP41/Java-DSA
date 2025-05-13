package Strings;

//strings are immutable in nature
public class String01 {
    public static void main(String[] args) {
        String str = "Paras";
        System.out.println(str);
        str = "Parth";//this is not changing the obj->("Paras") this creating the new obj->("Parth")
        System.out.println(str);

        System.out.println(str.charAt(3));
    }
}
