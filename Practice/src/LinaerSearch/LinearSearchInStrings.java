package LinaerSearch;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String name="kunal";
        char target='u';
        System.out.println(search(name,target));
    }
    static boolean search(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)==target)
//            {
//                return true;
//            }
//        }

        for(char ch : str.toCharArray())//str.toCharArray is convert the string into the character array
        {
            if(ch==target);
            {
                return true;
            }
        }
        return false;
    }

}
