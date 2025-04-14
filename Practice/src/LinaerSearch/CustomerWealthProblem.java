package LinaerSearch;
// https://leetcode.com/problems/richest-customer-wealth/
public class CustomerWealthProblem {
    public static void main(String[] args) {
        int[][] accounts={
                {1,2,3},
                {1,2,3,4,1},
                {1,2,4}
        };
        System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] accounts)
    {
        int rowsum=Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if(rowsum<sum)
            {
                rowsum=sum;
            }
        }
        return rowsum;
    }
}
