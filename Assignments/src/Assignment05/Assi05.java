package Assignment05;


import java.util.Arrays;

public class Assi05 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3};
        int y=0;
        int z=0;
        int[] newArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0)
            {
                newArr[i]=arr[z];
                z++;
            }else
            {
                int x= (arr.length)/2;
                newArr[i] = arr[x + y];
                y++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

}




