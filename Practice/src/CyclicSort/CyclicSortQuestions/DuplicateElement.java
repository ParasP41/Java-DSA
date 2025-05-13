package CyclicSort.CyclicSortQuestions;

//https://leetcode.com/problems/find-the-duplicate-number/description/
public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    //first approach
//    public static int findDuplicate(int[] arr) {
//        int i=0;
//        while(i<arr.length)
//        {
//            int cor=arr[i]-1;
//            if(arr.length>=arr[i] && arr[i]!=arr[cor])
//            {
//                int temp=arr[i];
//                arr[i]=arr[cor];
//                arr[cor]=temp;
//            }else{
//                i++;
//            }
//        }
//        return arr[arr.length-1];
//    }

    //second approach
        public static int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]!=i+1)
            {
                int cor=arr[i]-1;
                if(arr.length>=arr[i] && arr[i]!=arr[cor])
                {
                    int temp=arr[i];
                    arr[i]=arr[cor];
                    arr[cor]=temp;
                }else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
